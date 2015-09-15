/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import database.FachadaVendedor;
import dto.DtoVendedor;
import java.util.List;

/**
 *
 * @author maquina0
 */
public class ExpertoVendedor {

    private List<DtoVendedor> vendedores;
    private FachadaVendedor fachadaVendedor;

    public ExpertoVendedor() {
        fachadaVendedor = new FachadaVendedor();
    }

    public List<DtoVendedor> buscarVendedores() {
        vendedores = fachadaVendedor.buscarVendedores();
        return vendedores;
    }

    public String obtenerCodigoVendedor(String nombreVendedor) {
        String retorno = "";
        for (DtoVendedor dtoVendedor : vendedores) {
            if (dtoVendedor.getNombreVendedor().equals(nombreVendedor)) {
                retorno = dtoVendedor.getCondigoVendedor();
            }
        }
        return retorno;
    }
    
    public String obtenerNombreVendedor(String codigoVendedor) {
        String retorno = "";
        vendedores = fachadaVendedor.buscarVendedores();
        for (DtoVendedor dtoVendedor : vendedores) {
            if (dtoVendedor.getCondigoVendedor().equals(codigoVendedor)) {
                retorno = dtoVendedor.getNombreVendedor();
            }
        }
        return retorno;
    }
}
