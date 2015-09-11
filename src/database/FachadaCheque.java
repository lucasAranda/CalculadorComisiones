/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import dto.DtoCheque;
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
public class FachadaCheque {
    
    private ConexionSQLServer conexion;

    public FachadaCheque() {
        conexion = ConexionSQLServer.getConexion();
    }
    
    public List<DtoCheque> buscarChequesRecibo(String numeroRecibo){
        List<DtoCheque> cheques = new ArrayList<>();
        try {
            ResultSet rs; 
            PreparedStatement ps = conexion.conn.prepareStatement("SELECT ID_SBA14, DIAS, F_EMISION, FECHA_CHEQ, FECHA_REC, IMPORTE_CH, N_CHEQUE, N_COMP_REC "
                    + "FROM SBA14 "
                    + "WHERE ESTADO NOT BETWEEN 'R' AND 'X' AND N_COMP_REC = ? "
                    + "ORDER BY FECHA_CHEQ");
            ps.setString(1, numeroRecibo);
            rs = ps.executeQuery();
            while(rs.next()){
                DtoCheque cheque = new DtoCheque();
                cheque.setIdCheque(rs.getLong(1));
                cheque.setDias(rs.getInt(2));
                cheque.setFechaEmisionCheque(rs.getString(3));
                cheque.setFechaCobroCheque(rs.getString(4));
                cheque.setFechaRecibo(rs.getString(5));
                cheque.setImporte(rs.getFloat(6));
                cheque.setNumeroCheque(rs.getFloat(7));
                cheque.setNumeroRecibo(rs.getString(8));
                cheques.add(cheque);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FachadaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
