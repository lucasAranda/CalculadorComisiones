/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pantallas;

import dto.DtoRecibo;
import dto.DtoVendedor;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maquina0
 */
public class ResultadoCalculo extends javax.swing.JFrame {
    
    private DtoVendedor vendedor;
    /**
     * Creates new form ResultadoCalculo
     */
    public ResultadoCalculo(DtoVendedor vendedor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.vendedor = vendedor;
        nombreVendedor.setText(vendedor.getNombreVendedor());
        totalComision.setText(String.valueOf(vendedor.getComision()));
        cargarTablaRecibos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreVendedor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalComision = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRecibos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESULTADO DE CALCULO");

        jLabel2.setText("Vendedor:");

        nombreVendedor.setText("Vendedor");

        jLabel3.setText("TOTAL COMISION CALCULADA ($):");

        totalComision.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalComision.setText("Total");

        tablaRecibos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero Recibo", "Cliente", "Fecha", "Estado", "Importe ($)", "Comision del Recibo ($)"
            }
        ));
        tablaRecibos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRecibosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRecibos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalComision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreVendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalComision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaRecibosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRecibosMouseClicked
        // TODO add your handling code here:
        if (!(tablaRecibos.getSelectedRow() == -1)) {
            //obtener boolean del DtoPedido seleccionado y enviarselo a la pantalla de despacho
            new FacturasCheques(vendedor.getRecibos().get(tablaRecibos.getSelectedRow())).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Recibo");
        }
    }//GEN-LAST:event_tablaRecibosMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreVendedor;
    private javax.swing.JTable tablaRecibos;
    private javax.swing.JLabel totalComision;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaRecibos() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Numero Recibo");
        defaultTableModel.addColumn("Cliente");
        defaultTableModel.addColumn("Fecha de Emision");
        defaultTableModel.addColumn("Estado");
        defaultTableModel.addColumn("Importe ($)");
        defaultTableModel.addColumn("Comision del Recibo($)");
        for (DtoRecibo dtoRecibo : vendedor.getRecibos()) {
            Object[] fila = new Object[6];
            fila[0] = dtoRecibo.getNumeroComprobante();
            fila[1] = dtoRecibo.getNombreCliente();
            fila[2] = dtoRecibo.getFecha();
            fila[3] = dtoRecibo.getEstado();
            fila[4] = dtoRecibo.getImporte();
            fila[5] = dtoRecibo.getComision();
            defaultTableModel.addRow(fila);
        }
        tablaRecibos.setModel(defaultTableModel);
    }
}
