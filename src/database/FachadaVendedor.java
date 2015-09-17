/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dto.DtoVendedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maquina0
 */
public class FachadaVendedor {

    private ConexionSQLServer conexion;

    public FachadaVendedor() {
        conexion = ConexionSQLServer.getConexion();
    }

    public List<DtoVendedor> buscarVendedores() {
        List<DtoVendedor> vendedores = new ArrayList<>();
        try {
            ResultSet rs = conexion.ejecutarConsulta("SELECT COD_VENDED, NOMBRE_VEN FROM GVA23");
            while (rs.next()) {
                DtoVendedor vendedor = new DtoVendedor();
                vendedor.setCondigoVendedor(rs.getString(1));
                vendedor.setNombreVendedor(rs.getString(2));
                vendedores.add(vendedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FachadaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendedores;
    }

    public List<String> obtenerBasesDatos() {
        List<String> listaBases = new ArrayList<>();
        try {
            ResultSet rs = conexion.obtenerBases();
            while (rs.next()) {
                listaBases.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FachadaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaBases;
    }
}
