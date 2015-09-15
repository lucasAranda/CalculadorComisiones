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
public class DtoVendedor {
    
    private String condigoVendedor;
    private String nombreVendedor;
    private List<DtoRecibo> recibos;
    private float comision;

    public DtoVendedor() {
        recibos = new ArrayList<>();
    }

    public String getCondigoVendedor() {
        return condigoVendedor;
    }

    public void setCondigoVendedor(String condigoVendedor) {
        this.condigoVendedor = condigoVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public List<DtoRecibo> getRecibos() {
        return recibos;
    }

    public void setRecibos(List<DtoRecibo> recibos) {
        this.recibos = recibos;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
}
