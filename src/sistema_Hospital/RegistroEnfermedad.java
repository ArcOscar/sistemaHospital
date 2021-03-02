
package sistema_Hospital;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erawo
 */
public class RegistroEnfermedad extends javax.swing.JInternalFrame {

    Connection con;   
    public RegistroEnfermedad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombrePaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idMed = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        idEsp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        idPac = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        NombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePacienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel11.setText("ID Enfermedad:");

        idMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMedActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Registro de Enfermedad");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "ID Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Nombre");
        }

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel12.setText("Descripcion:");

        jLabel13.setText("ID Especialidad:");

        idEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEspActionPerformed(evt);
            }
        });

        jLabel14.setText("Asignar a paciente:");

        idPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPacActionPerformed(evt);
            }
        });

        jButton4.setText("Asignar a paciente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(idMed, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(idPac, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(idEsp))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(idMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(idPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(idEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePacienteActionPerformed

    private void idMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idMedActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //BOTON BORRAR
        SQLException exception = null;
        int error=0;
        int id = Integer.parseInt(idMed.getText());
        String cad1 = "{call borrarEnfermedad(?)}";

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");
            CallableStatement cst = con.prepareCall(cad1);
            Statement stmt = con.createStatement();

            cst.setInt(1, id);
            cst.execute();
            // cst.executeUpdate(cad1);
            // stmt.executeUpdate("	DELETE FROM medicina WHERE cod_Medicina = '"+id+"';");

        } catch (SQLException ex) {
            Logger.getLogger(RegistroEnfermedad.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Error borrando.");
            error=1;
        }

        if(error==0) JOptionPane.showMessageDialog(null, "Se borro Enfermedad.");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SQLException exception = null;
      
        int idEs = Integer.parseInt(idEsp.getText());
        String desc = (jTextArea1.getText());
        String nom = (NombrePaciente.getText());
        int idP=Integer.parseInt(idPac.getText());
//        String cad1 = "{call update_DeEnfermedad(?)}";
        int error=0;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO enfermedad VALUES('0','"+nom+"','"+desc+"','"+idEs+"')");
            
             con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");
        //    CallableStatement cst = con.prepareCall(cad1);


          //  cst.setInt(1, idP);
            //cst.execute();

            /*         ResultSet res2 = stmt.executeQuery("SELECT precio_producto FROM datos_producto WHERE idProducto = '"+idProducto+"'");
            res2.next();
            int precio=res2.getInt("precio_producto");
            */

            /*
            ResultSet res = stmt.executeQuery("SELECT idApartado FROM apartado ORDER BY idApartado DESC LIMIT 1");
            res.next();
            int nota=res.getInt("idApartado")+1;

            ResultSet res3 = stmt.executeQuery("SELECT idCliente FROM cliente ORDER BY idCliente DESC LIMIT 1");
            res3.next();
            int nuevoIdC=res3.getInt("idCliente")+1;
            apartado.cliente.setId(nuevoIdC);
            apartado.setIdd(nota);

            ResultSet res6 = stmt.executeQuery("SELECT idProducto FROM datos_producto ORDER BY idProducto DESC LIMIT 1");
            res6.next();
            int idFinal=res6.getInt("idProducto");

            if (idFinal < idProducto){
                JOptionPane.showMessageDialog(null, "El producto señalado no existe, no se hara el registro");
                throw exception;

            }

            ResultSet res5 = stmt.executeQuery("SELECT existencia_producto FROM datos_producto WHERE idProducto='"+idProducto+"'");
            res5.next();
            int existencia=res5.getInt("existencia_producto")-1;

            stmt.executeUpdate("UPDATE datos_producto SET existencia_producto='"+existencia+"' WHERE idProducto='"+idProducto+"'");

            stmt.executeUpdate("INSERT INTO apartado VALUES('"+apartado.getIdd()+"','"+idProducto+"','"+textidPrenda.getText()+"','"+apartado.cliente.getId()+"','"+textidFecha.getText()+"')");

            stmt.executeUpdate("INSERT INTO cliente VALUES('"+apartado.cliente.getId()+"','"+apartado.cliente.getNombre()+"')");*/

        } catch (SQLException ex) {
            Logger.getLogger(RegistroEnfermedad.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Error en el registro.");
            error=1;
        }

        if(error==0) JOptionPane.showMessageDialog(null, "Se registro el dato.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SQLException exception = null;
        int error=0;
        String cad1 = "SELECT * FROM Enfermedad";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");

            con.prepareStatement(cad1);
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
            modelo.setRowCount(0);

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet res = stmt.executeQuery(cad1);
            res.first();

            do{
                String[] fila = { res.getString(1), res.getString(2),res.getString(3), res.getString(4)};
                modelo.addRow(fila);
            } while(res.next());

        } catch (SQLException ex) {
            Logger.getLogger(RegistroEnfermedad.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Error en la consulta.");
            error=1;
        }

        if(error==0) JOptionPane.showMessageDialog(null, "Consulta realizada exitosamente!.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEspActionPerformed

    private void idPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPacActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SQLException exception = null;
        int idEnf= Integer.parseInt(idMed.getText());
        int idP=Integer.parseInt(idPac.getText());
        String cad1 = "{call enfermo(?,?)}";
        int error=0;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");
            Statement stmt = con.createStatement();

            
             con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");
            CallableStatement cst = con.prepareCall(cad1);


            cst.setInt(1, idP);
            cst.setInt(2, idEnf);
            cst.execute();


        } catch (SQLException ex) {
            Logger.getLogger(RegistroEnfermedad.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Error en el registro.");
            error=1;
        }

        if(error==0) JOptionPane.showMessageDialog(null, "Se registro el dato.");
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombrePaciente;
    private javax.swing.JTextField idEsp;
    private javax.swing.JTextField idMed;
    private javax.swing.JTextField idPac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
