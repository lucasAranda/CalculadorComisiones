/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import dto.DtoFactura;
import java.sql.PreparedStatement;
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
public class FachadaFactura {
    
    private ConexionSQLServer conexion;

    public FachadaFactura() {
        conexion = ConexionSQLServer.getConexion();
    }
    
    public List<DtoFactura> buscarFacturasRecibo(String numeroRecibo){
        List<DtoFactura> facturas = new ArrayList<>();
        try {
            ResultSet rs; 
            PreparedStatement ps = conexion.conn.prepareStatement("SELECT ID_GVA12, COD_CLIENT, COD_VENDED, ESTADO, FECHA_EMIS, IMPORTE, N_COMP, T_COMP "
                    + "FROM GVA12 INNER JOIN GVA07 ON GVA12.N_COMP = GVA07.N_COMP "
                    + "WHERE ESTADO != 'ANU' AND T_COMP = 'FAC' AND N_COMP_CAN = ? "
                    + "ORDER BY FECHA_EMIS");
            ps.setString(1, numeroRecibo);
            rs = ps.executeQuery();
            while(rs.next()){
                DtoFactura factura = new DtoFactura();
                factura.setIdComprobante(rs.getLong(1));
                factura.setCodigoCliente(rs.getString(2));
                factura.setCodigoVendedor(rs.getString(3));
                factura.setEstado(rs.getString(4));
                factura.setFecha(rs.getString(5));
                factura.setImporte(rs.getFloat(6));
                factura.setNumeroComprobante(rs.getString(7));
                factura.setTipoComprobante(rs.getString(8));
                facturas.add(factura);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FachadaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return facturas;
    }
}
