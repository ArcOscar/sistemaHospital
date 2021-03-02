/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_Hospital;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Actualizar extends javax.swing.JInternalFrame {

    public Actualizar() {
        initComponents();
        
           try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        textidproducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cambios = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("Dar altas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Dar bajas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Actualizar Inventario");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Existencia", "Precio", "Marca", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Id del producto a actualizar:");

        textidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidproductoActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad:");

        cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiosActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar tabla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Connection con;
     SQLException exception = null;
        try {
            String cad1 = "SELECT * FROM datos_producto";
            con = DriverManager.getConnection("jdbc:mysql://localhost/boutiqueanal", "root", "");
            con.prepareStatement(cad1); 
             Statement stmt = con.createStatement();
             int idProducto = Integer.parseInt(textidproducto.getText());
             int cambio = Integer.parseInt(cambios.getText());
             
            ResultSet res6 = stmt.executeQuery("SELECT idProducto FROM datos_producto ORDER BY idProducto DESC LIMIT 1");
            res6.next();
           int idFinal=res6.getInt("idProducto");
           
           if (idFinal < idProducto){
                 JOptionPane.showMessageDialog(null, "El producto señalado no existe, no se hara el registro");
            throw exception;
            
            }
             
           ResultSet res4 = stmt.executeQuery("SELECT existencia_producto FROM datos_producto WHERE idProducto = '"+idProducto+"'");
            res4.next();
            int existencia=res4.getInt("existencia_producto")+cambio;
            
         stmt.executeUpdate("UPDATE datos_producto SET existencia_producto='"+existencia+"' WHERE idProducto='"+idProducto+"'");
                    
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textidproductoActionPerformed

    private void cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Connection con;
        try {
            String cad1 = "SELECT * FROM datos_producto";
            con = DriverManager.getConnection("jdbc:mysql://localhost/boutiqueanal", "root", "");
            con.prepareStatement(cad1); 
             DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
       
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            ResultSet res = stmt.executeQuery(cad1);
            res.first();
            
            
            do{
                String[] fila = { res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5) };
                modelo.addRow(fila);
            } while(res.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Connection con;
     SQLException exception = null;
        try {
            String cad1 = "SELECT * FROM datos_producto";
            con = DriverManager.getConnection("jdbc:mysql://localhost/boutiqueanal", "root", "");
            con.prepareStatement(cad1); 
             Statement stmt = con.createStatement();
             int idProducto = Integer.parseInt(textidproducto.getText());
             int cambio = Integer.parseInt(cambios.getText());
             
            ResultSet res6 = stmt.executeQuery("SELECT idProducto FROM datos_producto ORDER BY idProducto DESC LIMIT 1");
            res6.next();
           int idFinal=res6.getInt("idProducto");
           
           if (idFinal < idProducto){
                 JOptionPane.showMessageDialog(null, "El producto señalado no existe, no se hara el registro");
            throw exception;
            
            }
             
           ResultSet res4 = stmt.executeQuery("SELECT existencia_producto FROM datos_producto WHERE idProducto = '"+idProducto+"'");
            res4.next();
            int limite=res4.getInt("existencia_producto");
            
            if(limite==0){
                JOptionPane.showMessageDialog(null, "Ya no hay existencia de ese producto, no se hara el registro");
            throw exception;
            }
            int existencia=res4.getInt("existencia_producto")-cambio;
            
            
            
         stmt.executeUpdate("UPDATE datos_producto SET existencia_producto='"+existencia+"' WHERE idProducto='"+idProducto+"'");
                    
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cambios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textidproducto;
    // End of variables declaration//GEN-END:variables
}
