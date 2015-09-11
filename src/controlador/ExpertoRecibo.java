/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import database.FachadaRecibo;
import dto.DtoRecibo;
import java.util.List;

/**
 *
 * @author maquina0
 */
public class ExpertoRecibo {

    private FachadaRecibo fachadaRecibo;
    private List<DtoRecibo> recibos;

    public ExpertoRecibo() {
        fachadaRecibo = new FachadaRecibo();
    }

    public List<DtoRecibo> buscarRecibosVendedor(String codigoVendedor, String fechaDesde, String fechaHasta) {
        System.out.println("Vendedor: "+ codigoVendedor);
        recibos = fachadaRecibo.buscarRecibosVendedorPorFecha(codigoVendedor, fechaDesde, fechaHasta);
        for (DtoRecibo recibo : recibos) {
            System.out.println("Recibo Nro: "+ recibo.getNumeroComprobante());
        }
        return recibos;
    }
}
