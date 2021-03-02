/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class RegistroPersonal extends javax.swing.JInternalFrame {

 Connection con;
    public RegistroPersonal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        idMed = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sueldoText = new javax.swing.JTextField();
        Apellido2Paciente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        textidFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Apellido1Paciente = new javax.swing.JTextField();
        telText = new javax.swing.JTextField();
        NombrePaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        direccText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idPuesto = new javax.swing.JTextField();
        texto = new javax.swing.JLabel();
        idEsp = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido P.", "Telefono", "E-mail", "ID Puesto", "ID E."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Mostrar Medicos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar Datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setText("ID Personal:");

        idMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMedActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar Medico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Sexo (M / H):");

        jLabel7.setText("Nacimiento:");

        jLabel3.setText("1° Apellido:");

        jLabel5.setText("2° Apellido:");

        jLabel6.setText("Sueldo:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Registro de Medicos");

        jLabel8.setText("Direccion:");

        jLabel10.setText("Telefono:");

        Apellido1Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apellido1PacienteActionPerformed(evt);
            }
        });

        NombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePacienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        direccText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccTextActionPerformed(evt);
            }
        });

        jLabel9.setText("E-mail:");

        jLabel12.setText("ID Puesto");

        texto.setText("ID Especialidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jButton3)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Apellido2Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textidFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Apellido1Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idMed, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1)
                                    .addGap(182, 182, 182))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sueldoText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(telText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(direccText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(texto)
                                            .addGap(31, 31, 31)
                                            .addComponent(idEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(idMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Apellido1Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Apellido2Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textidFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sueldoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texto)
                            .addComponent(idEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SQLException exception = null;
        int error=0;
        String cad1 = "SELECT * FROM personal";
        //String cad1 = "{call tablita ()}";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");

            con.prepareStatement(cad1);
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
            modelo.setRowCount(0);

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet res = stmt.executeQuery(cad1);
            res.first();

            do{
                String[] fila = { res.getString(1), res.getString(2), res.getString(3), res.getString(8), res.getString(9), res.getString(11), res.getString(12)};
                modelo.addRow(fila);
            } while(res.next());

        } catch (SQLException ex) {
            Logger.getLogger(RegistroPersonal.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Error en la consulta.");
            error=1;
        }

        if(error==0) JOptionPane.showMessageDialog(null, "Consulta realizada exitosamente!.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BOTON MODIFICAR
        SQLException exception = null;
        int error=0;
        int id = Integer.parseInt(idMed.getText());
        String email = (emailText.getText());
        String tel = (telText.getText());
        String cad1 = "{call modificarContactoPer(?,?,?)}";

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");
            CallableStatement cst = con.prepareCall(cad1);
            Statement stmt = con.createStatement();

            cst.setInt(1, id);
            cst.setString(2, email);
            cst.setString(3, tel);
            cst.execute();
            // cst.executeUpdate(cad1);
            // stmt.executeUpdate("	DELETE FROM medicina WHERE cod_Medicina = '"+id+"';");

        } catch (SQLException ex) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Error modificando.");
            error=1;
        }

        if(error==0) JOptionPane.showMessageDialog(null, "Se modifico medico.");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void idMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idMedActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //BOTON BORRAR
        SQLException exception = null;
        int error=0;
        int id = Integer.parseInt(idMed.getText());
        String cad1 = "{call borrarPersonal(?)}";

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");
            CallableStatement cst = con.prepareCall(cad1);
            Statement stmt = con.createStatement();

            cst.setInt(1, id);
            cst.execute();
            // cst.executeUpdate(cad1);
            // stmt.executeUpdate("	DELETE FROM medicina WHERE cod_Medicina = '"+id+"';");

        } catch (SQLException ex) {
            Logger.getLogger(RegistroPersonal.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Error borrando.");
            error=1;
        }

        if(error==0) JOptionPane.showMessageDialog(null, "Se borro Medico.");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SQLException exception = null;
        String nom = (NombrePaciente.getText());
        String ape1 = (Apellido1Paciente.getText());
        String ape2 = (Apellido2Paciente.getText());
        String nac = (textidFecha.getText());
        String gendeer = (gender.getText());
        String dir = (direccText.getText());
        String email = (emailText.getText());
        Double bt = Double.parseDouble(sueldoText.getText());
        String tel = (telText.getText());
        int idP = Integer.parseInt(idPuesto.getText());
        int idE = Integer.parseInt(idEsp.getText());
        int error=0;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdoctora", "root", "");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO personal VALUES('0','"+nom+"','"+ape1+"','"+ape2+"','"+nac+"','"+gendeer+"','"+dir+"','"+tel+"','"+email+"','"+bt+"','"+idP+"','"+idE+"')");

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
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Error en el registro.");
            error=1;
        }

        if(error==0) JOptionPane.showMessageDialog(null, "Se registro el dato.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Apellido1PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apellido1PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Apellido1PacienteActionPerformed

    private void NombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePacienteActionPerformed

    private void direccTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido1Paciente;
    private javax.swing.JTextField Apellido2Paciente;
    private javax.swing.JTextField NombrePaciente;
    private javax.swing.JTextField direccText;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField idEsp;
    private javax.swing.JTextField idMed;
    private javax.swing.JTextField idPuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField sueldoText;
    private javax.swing.JTextField telText;
    private javax.swing.JTextField textidFecha;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
