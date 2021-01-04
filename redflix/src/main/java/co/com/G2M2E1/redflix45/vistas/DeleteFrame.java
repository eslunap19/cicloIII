/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45.vistas;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author ESLUNAP
 */
public class DeleteFrame extends javax.swing.JFrame {

    JPanelUsuarioD jpu = new JPanelUsuarioD();
    JPanelSerieC jps = new JPanelSerieC();
    JPanelPeliculaD jpp = new JPanelPeliculaD();
    CardLayout vista;
    
    /**
     * Creates new form ReadFrame
     */
    public DeleteFrame() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        vista = (CardLayout) jPanelRead.getLayout();
        jPanelRead.add(jpu,"usuario");
        vista.show(jPanelRead, "usuario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxRead = new javax.swing.JComboBox<>();
        jPanelRead = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Menú Delete");

        jComboBoxRead.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Serie", "Película" }));
        jComboBoxRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxReadActionPerformed(evt);
            }
        });

        jPanelRead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelRead.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxRead, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanelRead, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxReadActionPerformed
        // TODO add your handling code here:
        String opcion = jComboBoxRead.getSelectedItem().toString();
        switch (opcion){
            case "Usuario":
            jPanelRead.add(jpu,"usuario");
            vista.show(jPanelRead, "usuario");
            SwingUtilities.updateComponentTreeUI(this);
            //this.repaint();
            break;
            case "Serie":
            jPanelRead.add(jps,"serie");
            vista.show(jPanelRead, "serie");
            SwingUtilities.updateComponentTreeUI(this);
            //this.repaint();
            break;
            case "Película":
            jPanelRead.add(jpp,"pelicula");
            vista.show(jPanelRead, "pelicula");
            SwingUtilities.updateComponentTreeUI(this);
            //this.repaint();
            break;
        }
    }//GEN-LAST:event_jComboBoxReadActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxRead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelRead;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
