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

    public ExpertoCalcular() {
        this.fachadaVendedor = new FachadaVendedor();
        this.fachadaRecibo = new FachadaRecibo();
        this.fachadaFactura = new FachadaFactura();
        this.fachadaCheque = new FachadaCheque();
    }

    public DtoVendedor calcularComisionVendedor(String codigoVendedor, String fechaDesde, String fechaHasta, int diasMenor, int diasMedio, int diasMayor, float porcentaje1,
            float porcentaje2, float porcentaje3, float porcentaje4) throws ExcepcionesComunes {
        int dias;
        float porcentaje;
        float totalComisiones = 0f;
        float totalCheques = 0f;
        List<DtoFactura> facturas;
        List<DtoCheque> cheques;
        List<DtoRecibo> recibosVendedor = fachadaRecibo.buscarRecibosVendedorPorFecha(codigoVendedor, fechaDesde, fechaHasta);

        for (DtoRecibo recibo : recibosVendedor) {
            facturas = fachadaFactura.buscarFacturasRecibo(recibo.getNumeroComprobante());
            cheques = fachadaCheque.buscarChequesRecibo(recibo.getNumeroComprobante());
            recibo.setChequesRecibo(cheques);
            recibo.setFacturasRecibo(facturas);
            if (!facturas.isEmpty()) {
                for (DtoFactura factura : facturas) {
                    asdf
                }
            }else {
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
                    totalComisiones += (dtoCheque.getImporte()*porcentaje/100);
                }
            }

        }

        return null;
    }
}
