/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import comun.InicializarCombo;
import controlador.ExpertoCalcular;
import controlador.ExpertoRecibo;
import controlador.ExpertoVendedor;
import dto.DtoCheque;
import dto.DtoFactura;
import dto.DtoRecibo;
import dto.DtoVendedor;
import excepciones.ExcepcionesComunes;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author maquina0
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private ExpertoVendedor expertoVendedor;
    private ExpertoCalcular expertoCalcular;
    private Calendar calendar;

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        expertoVendedor = new ExpertoVendedor();
        expertoCalcular = new ExpertoCalcular();
        comboVendedor.setModel(cargarVendedores());
        //mostrarBasesDatos();
        this.calendar = Calendar.getInstance();
        crearAnioDesde(calendar.get(Calendar.YEAR));
        crearAnioHasta(calendar.get(Calendar.YEAR));
        crearMesDesde((calendar.get(Calendar.MONTH) + 1));
        crearMesHasta((calendar.get(Calendar.MONTH) + 1));
        crearDiaDesde(calendar.get(Calendar.DATE), comboMesDesde.getSelectedIndex());
        crearDiaHasta(calendar.get(Calendar.DATE), comboMesDesde.getSelectedIndex());
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
        comboVendedor = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboDiaDesde = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboMesDesde = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboAnioDesde = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        comboDiaHasta = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboMesHasta = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        comboAnioHasta = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        diasMenor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        porcentaje1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        diasMedio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        porcentaje2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        diasMayor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        porcentaje3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        porcentaje4 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vendedor:");

        comboVendedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Fechas de coonsulta:");

        jLabel3.setText("Fecha desde:");

        comboDiaDesde.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDiaDesde.setNextFocusableComponent(comboAnioDesde);

        jLabel4.setText("/");

        comboMesDesde.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboMesDesde.setNextFocusableComponent(comboDiaDesde);
        comboMesDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesDesdeActionPerformed(evt);
            }
        });

        jLabel5.setText("/");

        comboAnioDesde.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Fecha hasta:");

        comboDiaHasta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDiaHasta.setNextFocusableComponent(comboAnioHasta);

        jLabel7.setText("/");

        comboMesHasta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboMesHasta.setNextFocusableComponent(comboDiaHasta);
        comboMesHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesHastaActionPerformed(evt);
            }
        });

        jLabel8.setText("/");

        comboAnioHasta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Parámetros de Cálculo de Comisiones:");

        jLabel10.setText("Diferencia de Dias:");

        jLabel11.setText("Menor a:");

        diasMenor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        diasMenor.setText("0");

        jLabel12.setText("días   Porcentaje de Comision:");

        porcentaje1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        porcentaje1.setText("0.0");

        jLabel13.setText("%");

        jLabel14.setText("Menor a:");

        diasMedio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        diasMedio.setText("0");

        jLabel15.setText("días   Porcentaje de Comision:");

        porcentaje2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        porcentaje2.setText("0.0");

        jLabel16.setText("%");

        jLabel17.setText("Menor a:");

        diasMayor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        diasMayor.setText("0");
        diasMayor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diasMayorKeyReleased(evt);
            }
        });

        jLabel18.setText("días   Porcentaje de Comision:");

        porcentaje3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        porcentaje3.setText("0.0");

        jLabel19.setText("%");

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel20.setText("Mayor a:");

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");

        jLabel21.setText("días   Porcentaje de Comision:");

        porcentaje4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        porcentaje4.setText("0.0");

        jLabel22.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboVendedor, 0, 203, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboDiaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboMesDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboAnioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboDiaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboMesHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboAnioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(diasMedio))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(diasMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1)
                                            .addComponent(diasMayor))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(porcentaje4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(porcentaje3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(porcentaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(porcentaje2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel22))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(comboDiaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(comboMesDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(comboAnioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboDiaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(comboMesHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(comboAnioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(diasMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(porcentaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(diasMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(porcentaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(diasMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(porcentaje3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(porcentaje4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcular)
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

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        String fechaDesde, fechaHasta;
        fechaDesde = comboAnioDesde.getSelectedItem().toString() + comboMesDesde.getSelectedItem().toString() + comboDiaDesde.getSelectedItem().toString();
        fechaHasta = comboAnioHasta.getSelectedItem().toString() + comboMesHasta.getSelectedItem().toString() + comboDiaHasta.getSelectedItem().toString();
        System.out.println(fechaDesde);
        System.out.println(fechaHasta);
        try {
            DtoVendedor vendedor = expertoCalcular.calcularComisionVendedor(expertoVendedor.obtenerCodigoVendedor(comboVendedor.getSelectedItem().toString()), fechaDesde, fechaHasta,
                    Integer.valueOf(diasMenor.getText()), Integer.valueOf(diasMedio.getText()), Integer.valueOf(diasMayor.getText()), Float.valueOf(porcentaje1.getText()),
                    Float.valueOf(porcentaje2.getText()), Float.valueOf(porcentaje3.getText()), Float.valueOf(porcentaje4.getText()));
            
            System.out.println("Vendedor: "+ vendedor.getNombreVendedor());
            System.out.println("Codigo Vendedor: "+ vendedor.getCondigoVendedor());
            System.out.println("Comision Total: "+ vendedor.getComision());
            int i = 1;
            for (DtoRecibo dtoRecibo : vendedor.getRecibos()) {
                System.out.println("Recibo "+ i + ": "+dtoRecibo.getNumeroComprobante());
                System.out.println("Fecha: "+ dtoRecibo.getFecha());
                System.out.println("Importe recibo: "+ dtoRecibo.getImporte());
                int j = 1;
                for (DtoFactura dtoFactura : dtoRecibo.getFacturasRecibo()) {
                    System.out.print("Factura "+ j +": "+ dtoFactura.getNumeroComprobante());
                    System.out.print(". Fecha: "+ dtoFactura.getFecha());
                    System.out.println(". Importe Factura: "+ dtoFactura.getImporte());
                    j++;
                }
                j = 1;
                for (DtoCheque dtoCheque : dtoRecibo.getChequesRecibo()) {
                    System.out.print("Cheque: "+ j + ": "+ dtoCheque.getNumeroCheque());
                    System.out.print(". Fecha de Cobro: "+ dtoCheque.getFechaCobroCheque());
                    System.out.println(". Importe Cheque: "+ dtoCheque.getImporte());
                    j++;
                }
                i++;
            }
            new ResultadoCalculo(vendedor).setVisible(true);
        } catch (ExcepcionesComunes ex) {
            System.out.println("Error con las fechas");
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_calcularActionPerformed

    private void comboMesDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesDesdeActionPerformed
        // TODO add your handling code here:
        crearDiaDesde(calendar.get(Calendar.DATE), comboMesDesde.getSelectedIndex());
    }//GEN-LAST:event_comboMesDesdeActionPerformed

    private void comboMesHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesHastaActionPerformed
        // TODO add your handling code here:
        crearDiaHasta(calendar.get(Calendar.DATE), comboMesDesde.getSelectedIndex());
    }//GEN-LAST:event_comboMesHastaActionPerformed

    private void diasMayorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diasMayorKeyReleased
        // TODO add your handling code here:
        jTextField1.setText(diasMayor.getText());
    }//GEN-LAST:event_diasMayorKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JComboBox comboAnioDesde;
    private javax.swing.JComboBox comboAnioHasta;
    private javax.swing.JComboBox comboDiaDesde;
    private javax.swing.JComboBox comboDiaHasta;
    private javax.swing.JComboBox comboMesDesde;
    private javax.swing.JComboBox comboMesHasta;
    private javax.swing.JComboBox comboVendedor;
    private javax.swing.JTextField diasMayor;
    private javax.swing.JTextField diasMedio;
    private javax.swing.JTextField diasMenor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField porcentaje1;
    private javax.swing.JTextField porcentaje2;
    private javax.swing.JTextField porcentaje3;
    private javax.swing.JTextField porcentaje4;
    // End of variables declaration//GEN-END:variables

    private DefaultComboBoxModel cargarVendedores() {
        DefaultComboBoxModel defaultComboBoxModel = InicializarCombo.inicializarCombo(new DefaultComboBoxModel(), "Seleccione vendedor.");
        for (DtoVendedor dtoVendedor : expertoVendedor.buscarVendedores()) {
            defaultComboBoxModel.addElement(dtoVendedor.getNombreVendedor());
        }
        return defaultComboBoxModel;
    }

    private void crearAnioDesde(int anio) {
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        defaultComboBoxModel.addElement(anio - 2);
        defaultComboBoxModel.addElement(anio - 1);
        defaultComboBoxModel.addElement(anio);
        defaultComboBoxModel.addElement(anio + 1);
        defaultComboBoxModel.addElement(anio + 2);
        defaultComboBoxModel.setSelectedItem(anio);
        comboAnioDesde.setModel(defaultComboBoxModel);
    }

    private void crearAnioHasta(int anio) {
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        defaultComboBoxModel.addElement(anio - 2);
        defaultComboBoxModel.addElement(anio - 1);
        defaultComboBoxModel.addElement(anio);
        defaultComboBoxModel.addElement(anio + 1);
        defaultComboBoxModel.addElement(anio + 2);
        defaultComboBoxModel.setSelectedItem(anio);
        comboAnioHasta.setModel(defaultComboBoxModel);
    }

    private void crearMesDesde(int mes) {
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        for (int recorrido = 1; recorrido < 13; recorrido++) {
            if (recorrido < 10) {
                defaultComboBoxModel.addElement("0"+recorrido);
            } else {
                defaultComboBoxModel.addElement(recorrido);
            }
        }
        if (mes < 10) {
            defaultComboBoxModel.setSelectedItem("0"+mes);
        } else {
            defaultComboBoxModel.setSelectedItem(mes);
        }
        comboMesDesde.setModel(defaultComboBoxModel);
    }

    private void crearMesHasta(int mes) {
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        for (int recorrido = 1; recorrido < 13; recorrido++) {
            if (recorrido < 10) {
                defaultComboBoxModel.addElement("0"+recorrido);
            } else {
                defaultComboBoxModel.addElement(recorrido);
            }
        }
        if (mes < 10) {
            defaultComboBoxModel.setSelectedItem("0"+mes);
        } else {
            defaultComboBoxModel.setSelectedItem(mes);
        }
        comboMesHasta.setModel(defaultComboBoxModel);
    }

    private void crearDiaDesde(int dia, int mes) {
        int maxDia;
        switch (mes) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                maxDia = 31;
                break;
            case 3:
            case 5:
            case 8:
            case 10:
                maxDia = 30;
                break;
            case 1:
                int anio = Integer.valueOf(comboAnioDesde.getSelectedItem().toString());
                if (((anio % 4 == 0)
                        && !(anio % 100 == 0))
                        || (anio % 400 == 0)) {
                    maxDia = 29;
                } else {
                    maxDia = 28;
                }
                break;
            default:
                maxDia = 31;
        }
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        for (int recorrido = 1; recorrido <= maxDia; recorrido++) {
            if (recorrido < 10) {
                defaultComboBoxModel.addElement("0"+recorrido);
            } else {
                defaultComboBoxModel.addElement(recorrido);
            }
        }
        defaultComboBoxModel.setSelectedItem(dia);
        comboDiaDesde.setModel(defaultComboBoxModel);

    }

    private void crearDiaHasta(int dia, int mes) {
        int maxDia;
        switch (mes) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                maxDia = 31;
                break;
            case 3:
            case 5:
            case 8:
            case 10:
                maxDia = 30;
                break;
            case 1:
                int anio = Integer.valueOf(comboAnioHasta.getSelectedItem().toString());
                if (((anio % 4 == 0)
                        && !(anio % 100 == 0))
                        || (anio % 400 == 0)) {
                    maxDia = 29;
                } else {
                    maxDia = 28;
                }
                break;
            default:
                maxDia = 31;
        }
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        for (int recorrido = 1; recorrido <= maxDia; recorrido++) {
            if (recorrido < 10) {
                defaultComboBoxModel.addElement("0"+recorrido);
            } else {
                defaultComboBoxModel.addElement(recorrido);
            }
        }
        defaultComboBoxModel.setSelectedItem(dia);
        comboDiaHasta.setModel(defaultComboBoxModel);
    }

    private void mostrarBasesDatos() {
        for (String string : expertoVendedor.obtenerBasesDatos()) {
            System.out.println(string);
        }
    }

}
