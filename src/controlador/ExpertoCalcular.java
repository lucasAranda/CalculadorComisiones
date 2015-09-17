/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import comun.DiferenciaEntreFechas;
import database.FachadaCheque;
import database.FachadaFactura;
import database.FachadaRecibo;
import database.FachadaVendedor;
import dto.DtoCheque;
import dto.DtoFactura;
import dto.DtoRecibo;
import dto.DtoVendedor;
import excepciones.ExcepcionesComunes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maquina0
 */
public class ExpertoCalcular {

    private FachadaVendedor fachadaVendedor;
    private FachadaRecibo fachadaRecibo;
    private FachadaFactura fachadaFactura;
    private FachadaCheque fachadaCheque;
    private ExpertoVendedor expertoVendedor;
    private float porcentaje;
    private float totalComisiones;
    private float comisionRecibo;
    private float totalCheques;
    private int dias, dias1, dias2, dias3;
    private float porcentaje1, porcentaje2, porcentaje3, porcentaje4;
    List<Double> facturasNoUsadas = new ArrayList<>();

    public ExpertoCalcular() {
        this.fachadaVendedor = new FachadaVendedor();
        this.fachadaRecibo = new FachadaRecibo();
        this.fachadaFactura = new FachadaFactura();
        this.fachadaCheque = new FachadaCheque();
        this.expertoVendedor = new ExpertoVendedor();
    }

    public DtoVendedor calcularComisionVendedor(String codigoVendedor, String fechaDesde, String fechaHasta, int diasMenor, int diasMedio, int diasMayor, float porcentaje1,
            float porcentaje2, float porcentaje3, float porcentaje4) throws ExcepcionesComunes {
        this.dias1 = diasMenor;
        this.dias2 = diasMedio;
        this.dias3 = diasMayor;
        this.porcentaje1 = porcentaje1;
        this.porcentaje2 = porcentaje2;
        this.porcentaje3 = porcentaje3;
        this.porcentaje4 = porcentaje4;
        this.totalComisiones = 0;
        double sumaFacturas = 0;
        List<DtoFactura> facturas;
        List<DtoCheque> cheques;
        List<DtoCheque> chequesSinUsar;
        List<DtoRecibo> recibosVendedor = fachadaRecibo.buscarRecibosVendedorPorFecha(codigoVendedor, fechaDesde, fechaHasta);

        DtoVendedor vendedor = new DtoVendedor();
        vendedor.setCondigoVendedor(codigoVendedor);
        vendedor.setNombreVendedor(expertoVendedor.obtenerNombreVendedor(codigoVendedor));

        for (DtoRecibo recibo : recibosVendedor) {
            this.totalCheques = 0;
            this.comisionRecibo = 0;
            facturas = fachadaFactura.buscarFacturasRecibo(recibo.getNumeroComprobante());
            cheques = fachadaCheque.buscarChequesRecibo(recibo.getNumeroComprobante());
            chequesSinUsar = cheques;
            recibo.setChequesRecibo(cheques);
            recibo.setFacturasRecibo(facturas);
            if (!facturas.isEmpty()) {
                for (DtoFactura factura : facturas) {
                    chequesSinUsar = emparejarFacturas(factura, chequesSinUsar);
                }
                for (Double facturaNoUsada : facturasNoUsadas) {
                    sumaFacturas += facturaNoUsada;
                }
                //AGREGAR QUE PASA SI QUEDAN CHEQUES SIN USAR Y SUMARLO AL TOTAL CHEQUES
                for (DtoCheque dtoCheque : chequesSinUsar) {
                    dias = DiferenciaEntreFechas.calcularDiferencia(recibo.getFecha(), dtoCheque.getFechaCobroCheque());
                        if (dias <= diasMenor) {
                            porcentaje = porcentaje1;
                        } else if (dias <= diasMedio) {
                            porcentaje = porcentaje2;
                        } else if (dias <= diasMayor) {
                            porcentaje = porcentaje3;
                        } else {
                            porcentaje = porcentaje4;
                        }
                        this.comisionRecibo += (dtoCheque.getImporte() * porcentaje / 100);
                        this.totalCheques += dtoCheque.getImporte();
                }
                //FALTA VER QUE COMO SE COBRE EL RECIBO CON RELACION A LA FACTURA
                if (totalCheques < recibo.getImporte()) {
                    comisionRecibo += (recibo.getImporte() - totalCheques) * porcentaje1 / 100;
                }
            } else {
                if (cheques.isEmpty()) {
                    this.comisionRecibo += recibo.getImporte()*porcentaje1/100;
                } else {
                    for (DtoCheque dtoCheque : cheques) {
                        dias = DiferenciaEntreFechas.calcularDiferencia(recibo.getFecha(), dtoCheque.getFechaCobroCheque());
                        if (dias <= diasMenor) {
                            porcentaje = porcentaje1;
                        } else if (dias <= diasMedio) {
                            porcentaje = porcentaje2;
                        } else if (dias <= diasMayor) {
                            porcentaje = porcentaje3;
                        } else {
                            porcentaje = porcentaje4;
                        }
                        this.comisionRecibo += (dtoCheque.getImporte() * porcentaje / 100);
                    }
                }
            }
            System.out.println("Comision recibo: "+this.comisionRecibo);
            recibo.setComision(comisionRecibo);
            this.totalComisiones += this.comisionRecibo;
            vendedor.getRecibos().add(recibo);
        }
        vendedor.setComision(totalComisiones);
        return vendedor;
    }

    private List<DtoCheque> emparejarFacturas(DtoFactura factura, List<DtoCheque> chequesSinUsar) throws ExcepcionesComunes {
        List<DtoCheque> cheques = new ArrayList<>();
        double copiaImporteACobrar;
        double importeACobrar = factura.getImporte();
        for (DtoCheque dtoCheque : chequesSinUsar) {
            dias = DiferenciaEntreFechas.calcularDiferenciaReal(factura.getFecha(), dtoCheque.getFechaCobroCheque());
            if (dias <= dias1) {
                porcentaje = porcentaje1;
            } else if (dias <= dias2) {
                porcentaje = porcentaje2;
            } else if (dias <= dias3) {
                porcentaje = porcentaje3;
            } else {
                porcentaje = porcentaje4;
            }
            if (importeACobrar > 0) {
                copiaImporteACobrar = importeACobrar;
                importeACobrar = importeACobrar - dtoCheque.getImporte();
                if (importeACobrar < 0) {
                    this.comisionRecibo += copiaImporteACobrar * porcentaje / 100;//ERROR
                    DtoCheque cheque = new DtoCheque();
                    cheque.setFechaCobroCheque(dtoCheque.getFechaCobroCheque());
                    cheque.setImporte((float) (importeACobrar * (-1.0)));
                    cheques.add(cheque);
                    this.totalCheques += copiaImporteACobrar;//PROBLEMA, HACER SUMATORIA DE CHEQUES USADOS

                } else {
                    this.comisionRecibo += dtoCheque.getImporte() * porcentaje / 100;
                    this.totalCheques += dtoCheque.getImporte();//PROBLEMA, HACER SUMATORIA DE CHEQUES USADOS
                }
            } else {
                cheques.add(dtoCheque);
            }
            if (cheques.isEmpty() && importeACobrar > 0) {
                this.facturasNoUsadas.add(importeACobrar);
            }
        }
        return cheques;
    }
}
