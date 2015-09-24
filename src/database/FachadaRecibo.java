/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import dto.DtoRecibo;
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
public class FachadaRecibo {
    
    private ConexionSQLServer conexion;

    public FachadaRecibo() {
        conexion = ConexionSQLServer.getConexion();
    }
    
    public List<DtoRecibo> buscarRecibosVendedorPorFecha(String codigoVendedor, String fechaDesde, String fechaHasta){
        List<DtoRecibo> recibos = new ArrayList<>();
        try {
            ResultSet rs; 
            /*PreparedStatement ps = conexion.conn.prepareStatement("SELECT ID_GVA12, COD_CLIENT, COD_VENDED, ESTADO, FECHA_EMIS, IMPORTE, N_COMP, T_COMP "
                    + "FROM GVA12 "
                    + "WHERE COD_VENDED = ? AND FECHA_EMIS BETWEEN ? AND ? AND T_COMP = 'REC'");*/
            PreparedStatement ps = conexion.conn.prepareStatement("SELECT ID_GVA12, GVA12.COD_CLIENT, GVA14.RAZON_SOCI,  GVA12.COD_VENDED, ESTADO, FECHA_EMIS, IMPORTE, N_COMP, T_COMP "
                    + "FROM GVA12 INNER JOIN GVA14 ON GVA12.COD_CLIENT = GVA14.COD_CLIENT "
                    + "WHERE GVA12.COD_VENDED = ? AND FECHA_EMIS BETWEEN ? AND ? AND T_COMP = 'REC'");
            ps.setString(1, codigoVendedor);
            ps.setString(2, fechaDesde);
            ps.setString(3, fechaHasta);
            rs = ps.executeQuery();
            while(rs.next()){
                DtoRecibo recibo = new DtoRecibo();
                recibo.setIdComprobante(rs.getLong(1));
                recibo.setCodigoCliente(rs.getString(2));
                recibo.setNombreCliente(rs.getString(3));
                recibo.setCodigoVendedor(rs.getString(4));
                recibo.setEstado(rs.getString(5));
                recibo.setFecha(rs.getString(6));
                recibo.setImporte(rs.getFloat(7));
                recibo.setNumeroComprobante(rs.getString(8));
                recibo.setTipoComprobante(rs.getString(9));
                recibos.add(recibo);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FachadaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return recibos;
    }
}
