/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author maquina0
 */
public class DtoCheque {
    
    private long idCheque;
    private int dias;
    private String fechaEmisionCheque;
    private String fechaCobroCheque;
    private String fechaRecibo;
    private float importe;
    private float numeroCheque;
    private String numeroRecibo;

    public DtoCheque() {
    }

    public long getIdCheque() {
        return idCheque;
    }

    public void setIdCheque(long idCheque) {
        this.idCheque = idCheque;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getFechaEmisionCheque() {
        return fechaEmisionCheque;
    }

    public void setFechaEmisionCheque(String fechaEmisionCheque) {
        this.fechaEmisionCheque = fechaEmisionCheque;
    }

    public String getFechaCobroCheque() {
        return fechaCobroCheque;
    }

    public void setFechaCobroCheque(String fechaCobroCheque) {
        this.fechaCobroCheque = fechaCobroCheque;
    }

    public String getFechaRecibo() {
        return fechaRecibo;
    }

    public void setFechaRecibo(String fechaRecibo) {
        this.fechaRecibo = fechaRecibo;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(float numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(String numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }
    
    
}
