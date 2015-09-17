/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maquina0
 */
public class DtoRecibo {
    
    private long idComprobante;
    private String codigoCliente;
    private String codigoVendedor;
    private String estado;
    private String fecha;
    private double importe;
    private float comision;
    private String numeroComprobante;
    private String tipoComprobante;
    private List<DtoFactura> facturasRecibo;
    private List<DtoCheque> chequesRecibo;

    public DtoRecibo() {
        this.facturasRecibo = new ArrayList<>();
        this.chequesRecibo = new ArrayList<>();
    }

    public long getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(long idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public List<DtoFactura> getFacturasRecibo() {
        return facturasRecibo;
    }

    public void setFacturasRecibo(List<DtoFactura> facturasRecibo) {
        this.facturasRecibo = facturasRecibo;
    }

    public List<DtoCheque> getChequesRecibo() {
        return chequesRecibo;
    }

    public void setChequesRecibo(List<DtoCheque> chequesRecibo) {
        this.chequesRecibo = chequesRecibo;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
    
}
