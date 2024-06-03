
package tap_u1p4;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.text.StyleContext;


public class VentanaFicha extends javax.swing.JFrame {
    
    private ArrayList<Alumno> alumnos;
    private int promedio=0;
    
    public VentanaFicha() {
        initComponents();
        this.setLocationRelativeTo(null);
        alumnos=new ArrayList<>();
        sexo.add(radioF);
        sexo.add(radioM);
        sexo.add(radioNon);
        radioNon.setSelected(true);
        buttonGuardar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ENTER"), "tecla");
        buttonGuardar.getActionMap().put("tecla", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuardar.doClick();
            }
        });
        try {
            FileInputStream ent = new FileInputStream("Alumno.bin");
            ObjectInputStream ob = new ObjectInputStream(ent);
            alumnos=(ArrayList<Alumno>)ob.readObject();
            ent.close();
            ob.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        String[] datos=new String[alumnos.size()];
            for (int i = 0; i < datos.length; i++) {
                datos[i]=alumnos.get(i).getNumControl()+" - "+
                        alumnos.get(i).getCalificacioon();
                promedio+=alumnos.get(i).getCalificacioon();
        }
        
        guardaList.setListData(datos);
        labelProm.setText("Promedio grupal: "+(promedio/alumnos.size()));
        fieldNControl.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        fieldNControl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        calS = new javax.swing.JSlider();
        labelCalif = new javax.swing.JLabel();
        radioM = new javax.swing.JRadioButton();
        radioF = new javax.swing.JRadioButton();
        radioNon = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        carreraCB = new javax.swing.JComboBox<>();
        buttonLimpiar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        guardaList = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        labelProm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("N° de control:");

        fieldNControl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldNControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNControlKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        fieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNombreFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Calificación");

        calS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calSStateChanged(evt);
            }
        });

        labelCalif.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCalif.setText("50");

        radioM.setText("Masculino");

        radioF.setText("Femenino");

        radioNon.setText("No binario");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Carrera");

        carreraCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        carreraCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISC", "I.MECANICA", "I.MECATRONICA", "CONTABILIDAD" }));

        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jScrollPane1.setViewportView(guardaList);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Guardados:");

        labelProm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelProm.setText("Promedio grupal :   0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(fieldNControl)
                    .addComponent(jLabel2)
                    .addComponent(fieldNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCalif))
                    .addComponent(calS, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioNon))
                    .addComponent(jLabel4)
                    .addComponent(carreraCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGuardar)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelProm)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(labelProm)
                        .addGap(65, 76, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(labelCalif))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioM)
                                    .addComponent(radioF)
                                    .addComponent(radioNon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carreraCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonLimpiar)
                                    .addComponent(buttonGuardar))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNControlKeyTyped
        int let=evt.getKeyChar();
        if(let<48||let>57)evt.consume();
    }//GEN-LAST:event_fieldNControlKeyTyped

    private void fieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNombreFocusLost
        fieldNombre.setText(fieldNombre.getText().toUpperCase());
    }//GEN-LAST:event_fieldNombreFocusLost

    private void calSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_calSStateChanged
        labelCalif.setText(calS.getValue()+"");
    }//GEN-LAST:event_calSStateChanged

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        fieldNControl.setText("");
        fieldNombre.setText("");
        calS.setValue(50);
        radioNon.setSelected(true);
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        if(fieldNControl.getText().equals("")||fieldNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Faltan datos por llenar");
        }
        else{
            Alumno al = new Alumno(fieldNControl.getText(),
                    fieldNombre.getText(),
                    Integer.parseInt(labelCalif.getText()),
                    radioM.isSelected() ? "M":(radioF.isSelected() ? "F":"N"),
                    carreraCB.getSelectedItem().toString()
                    );
            alumnos.add(al);
            String[] datos=new String[alumnos.size()];
            for (int i = 0; i < datos.length; i++) {
                datos[i]=alumnos.get(i).getNumControl()+" - "+
                        alumnos.get(i).getCalificacioon();

            }
            try {
                FileOutputStream sal = new FileOutputStream("Alumno.bin");
                ObjectOutputStream ob= new ObjectOutputStream(sal);
                ob.writeObject(alumnos);
                ob.close();
                sal.close();
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Fallo al guardar los datos");
            }
            promedio+=alumnos.get(alumnos.size()-1).getCalificacioon();
            guardaList.setListData(datos);
            labelProm.setText("Promedio grupal: "+(promedio/alumnos.size()));
            buttonLimpiarActionPerformed(evt);
            fieldNControl.requestFocus();
        }
        
    }//GEN-LAST:event_buttonGuardarActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFicha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JSlider calS;
    private javax.swing.JComboBox<String> carreraCB;
    private javax.swing.JTextField fieldNControl;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JList<String> guardaList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCalif;
    private javax.swing.JLabel labelProm;
    private javax.swing.JRadioButton radioF;
    private javax.swing.JRadioButton radioM;
    private javax.swing.JRadioButton radioNon;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables
}
