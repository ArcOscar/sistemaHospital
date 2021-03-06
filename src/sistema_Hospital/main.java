package sistema_Hospital;

import static javafx.application.Platform.exit;

/**
 *
 * @author erawong
 */
public class main extends javax.swing.JFrame {

    consultaPaciente conPac;
    Cita cita;
    RegistroPaciente RegPac;
    RegistroMedicina RegMed;
    RegistroPersonal RegPer;
    RegistroTriple RegEsp;
    RegistroEnfermedad RegEnf;
    RegistroConsultorio RegCon;
    RegistroHG RHG;
    RegistroLaboratorios RegLab;
    RegistroExamenC RegExaC;
    RegistroOrdenE RegOrdE;
    RegistroRecGen RegRecG;
    RegistroRecDet RegRecD;
    RegistroCategoria RegCat;
    RegistroPuesto RegPue;
    HistorialDetallado HistDet;
    BuscarMed BusMed;
    BuscarServicio BusSer;
    BuscarEnfermedades BusEnf;
    BuscarCapacidad BusCap;

    public main() {
        initComponents();

        conPac = new consultaPaciente();
        cita = new Cita();
        RegPac = new RegistroPaciente();
        RegMed = new RegistroMedicina();
        RegPer = new RegistroPersonal();
        RegEsp = new RegistroTriple();
        RegEnf = new RegistroEnfermedad();
        RegCon = new RegistroConsultorio();
        RHG = new RegistroHG(1);
        RegLab = new RegistroLaboratorios();
        RegExaC = new RegistroExamenC();
        RegOrdE = new RegistroOrdenE();
        RegRecG = new RegistroRecGen();
        RegRecD = new RegistroRecDet();
        RegCat = new RegistroCategoria();
        RegPue = new RegistroPuesto();
        HistDet = new HistorialDetallado() ;
        BusMed = new BuscarMed() ;
        BusSer = new BuscarServicio();
        BusEnf = new BuscarEnfermedades();
        BusCap = new BuscarCapacidad();


        
        add(conPac);
        add(cita);
        add(RegPac);
        add(RegMed);
        add(RegPer);
        add(RegEsp);
        add(RegEnf);
        add(RegCon);
        add(RegLab);
        add(RegExaC);
        add(RegOrdE);
        add(RegRecG);
        add(RegRecD);
        add(RegCat);
        add(RegPue);
        add(HistDet);
        add(BusMed);
        add(BusSer);
         add(BusEnf);
          add(BusCap);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Acciones");

        jMenuItem6.setText("Citas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Pacientes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Medicinas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem1.setText("Personal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Especialidades");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem9.setText("Enfermedades");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Consultorio");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Laboratorios");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Examen Clinico");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem13.setText("Orden de Examen");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem14.setText("Puestos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setText("Recetas Generales");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem16.setText("Receta Detallada");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuItem2.setText("Categorias de Medicina");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuItem3.setText("Consulta Historial Detallado");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Consultas Medicinas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem17.setText("Consulta Servicio");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuItem18.setText("Consulta enfermedades");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem18);

        jMenuItem19.setText("Consulta Capacidad");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem19);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(true);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);

          RegRecG.setVisible(false);
          RegRecD.setVisible(false);
          RegCat.setVisible(false);
           RegPue.setVisible(false);
           HistDet.setVisible(false);
           BusMed.setVisible(false);
           BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);


    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(true);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);

          RegRecG.setVisible(false);
          RegRecD.setVisible(false);
          RegCat.setVisible(false);
          RegPue.setVisible(false);
           HistDet.setVisible(false);
           BusMed.setVisible(false);
           BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);



    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(true);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);

        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
        RegPue.setVisible(false);
           HistDet.setVisible(false);
           BusMed.setVisible(false);
           BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);


    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(true);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);

        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
        RegPue.setVisible(false);
           HistDet.setVisible(false);
           BusMed.setVisible(false);
           BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);



    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(true);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
        
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
        RegPue.setVisible(false);
           HistDet.setVisible(false);
           BusMed.setVisible(false);
           BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);



    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(true);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
        
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
        RegPue.setVisible(false);
           HistDet.setVisible(false);
BusMed.setVisible(false);
BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);


    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(true);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
     
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
        RegPue.setVisible(false);
           HistDet.setVisible(false);
BusMed.setVisible(false);
BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);


    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(true);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
        
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
        RegPue.setVisible(false);
           HistDet.setVisible(false);
BusMed.setVisible(false);
BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);


    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(true);
        RegOrdE.setVisible(false);
      
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
        RegPue.setVisible(false);
           HistDet.setVisible(false);
BusMed.setVisible(false);
BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);


    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed

        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(true);
      
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
        RegPue.setVisible(false);
           HistDet.setVisible(false);
BusMed.setVisible(false);
BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);


    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
       
        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
        RegPue.setVisible(true);
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
        
           HistDet.setVisible(false);
BusMed.setVisible(false);
BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);
   
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
      
         conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
           RegPue.setVisible(false);
        RegRecG.setVisible(true);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
         HistDet.setVisible(false);
        BusMed.setVisible(false);
        BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
       
        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
         RegPue.setVisible(false);
        RegRecG.setVisible(false);
        RegRecD.setVisible(true);
        RegCat.setVisible(false);
         HistDet.setVisible(false);
        BusMed.setVisible(false);
        BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);
         
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
               RegPue.setVisible(false);
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(true);
         HistDet.setVisible(false);
        BusMed.setVisible(false);
        BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);
         
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    
                conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
               RegPue.setVisible(false);
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
         HistDet.setVisible(true);
        BusMed.setVisible(false);
        BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);
         
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
                   conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
               RegPue.setVisible(false);
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
         HistDet.setVisible(false);
        BusMed.setVisible(true);
        BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(false);
         
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        
                conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
               RegPue.setVisible(false);
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
         HistDet.setVisible(false);
        BusMed.setVisible(false);
        BusSer.setVisible(true); 
           BusEnf.setVisible(false); 
           BusCap.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        
                    conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
               RegPue.setVisible(false);
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
         HistDet.setVisible(false);
        BusMed.setVisible(false);
        BusSer.setVisible(false);
           BusEnf.setVisible(true);
           BusCap.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        
                    conPac.setVisible(false);
        cita.setVisible(false);
        RegPac.setVisible(false);
        RegMed.setVisible(false);
        RegPer.setVisible(false);
        RegEsp.setVisible(false);
        RegEnf.setVisible(false);
        RegCon.setVisible(false);
        RegLab.setVisible(false);
        RegExaC.setVisible(false);
        RegOrdE.setVisible(false);
               RegPue.setVisible(false);
        RegRecG.setVisible(false);
        RegRecD.setVisible(false);
        RegCat.setVisible(false);
         HistDet.setVisible(false);
        BusMed.setVisible(false);
        BusSer.setVisible(false);
           BusEnf.setVisible(false);
           BusCap.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
