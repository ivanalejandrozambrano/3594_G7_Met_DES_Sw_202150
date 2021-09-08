/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import ec.edu.espe.mechanic.controller.ArchivoAdmin;
import static ec.edu.espe.mechanic.utils.Connection.createConnection;
import static ec.edu.espe.mechanic.utils.OperationMongoDB.createUser;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberson Constante
 */
public class FRegistro extends javax.swing.JFrame {

    /**
     * Creates new form FRegistro
     */
    DB db;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    MongoClient mongo = createConnection();

    public FRegistro() {
        initComponents();
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
        lblRegistro1 = new javax.swing.JLabel();
        lblRegistroNombre = new javax.swing.JLabel();
        txtRegistroNombre = new javax.swing.JTextField();
        lblRegistroPass = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblRegistroCorreo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        lblRegistroError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRegistroNombre1 = new javax.swing.JLabel();
        txtRegistroApellido = new javax.swing.JTextField();
        txtRegistroUser = new javax.swing.JTextField();
        txtRegistroCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblRegistroPass1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtRegistroContrasena = new javax.swing.JPasswordField();
        lblCancelar = new javax.swing.JLabel();
        lblRetroceder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 153)));

        lblRegistro1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        lblRegistro1.setText("Registro De Usuario");

        lblRegistroNombre.setText("Nombre ");

        lblRegistroPass.setText("Contraseña");

        lblRegistroCorreo.setText("Cedula");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/mechanic/images/return.png"))); // NOI18N
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/mechanic/images/addClients.png"))); // NOI18N

        jLabel2.setText("Información Personal");

        lblRegistroNombre1.setText("Apellido");

        txtRegistroUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroUserActionPerformed(evt);
            }
        });

        txtRegistroCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroCedulaActionPerformed(evt);
            }
        });

        jLabel3.setText("Información Cuenta");

        lblRegistroPass1.setText("Usuario");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/mechanic/images/exit_48.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblCancelar.setText("Cancelar");

        lblRetroceder.setText("Retroceder");
        lblRetroceder.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRegistroPass1)
                                            .addComponent(lblRegistroPass))
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRegistroUser)
                                            .addComponent(txtRegistroContrasena)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblRegistroNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRegistroApellido))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblRegistroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRegistroNombre))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblRegistroCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRegistroCedula)))
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRetroceder)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnRetroceder)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRegistroError, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCancelar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRegistro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(87, 87, 87)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel5)))
                .addGap(276, 276, 276))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRegistroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegistroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRegistroNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegistroApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRegistroCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegistroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistroUser, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRegistroPass1))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRegistroPass)
                                    .addComponent(txtRegistroContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrar)
                                .addGap(33, 33, 33)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRegistroError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRetroceder))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCancelar)
                    .addComponent(lblRetroceder))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
       
        ArchivoAdmin crud = new ArchivoAdmin();
        
        BasicDBObject searchedName = new BasicDBObject();
        String data,pass;
        data = txtRegistroUser.getText();
        pass = txtRegistroContrasena.getText();
        
        
        int suma=0;
        if( txtRegistroCedula.getText().length()!=10){             
        JOptionPane.showMessageDialog(null, "Ingrese su cedula de 10 digitos");               
        }else{
            int a[]=new int [txtRegistroCedula.getText().length()/2];
            int b[]=new int [(txtRegistroCedula.getText().length()/2)];
            int c=0;
            int d=1;
        for (int i = 0; i < txtRegistroCedula.getText().length()/2; i++) {
        a[i]=Integer.parseInt(String.valueOf(txtRegistroCedula.getText().charAt(c)));
        c=c+2;
        if (i < (txtRegistroCedula.getText().length()/2)-1) {
          b[i]=Integer.parseInt(String.valueOf(txtRegistroCedula.getText().charAt(d)));
          d=d+2;
        }
      }
   
      for (int i = 0; i < a.length; i++) {
        a[i]=a[i]*2;
        if (a[i] >9){
          a[i]=a[i]-9;
        }
        suma=suma+a[i]+b[i];
      } 
        int aux=suma/10;
        int dec=(aux+1)*10;
        if ((dec - suma) == Integer.parseInt(String.valueOf(txtRegistroCedula.getText().charAt(txtRegistroCedula.getText().length()-1)))){
            JOptionPane.showMessageDialog(null, "Se a validado Cedula Correcta");
        }else{
            if(suma%10==0 && txtRegistroCedula.getText().charAt(txtRegistroCedula.getText().length()-1)=='0'){
                JOptionPane.showMessageDialog(null, "Se ha validado Cedula Correcta");
            }else{
                JOptionPane.showMessageDialog(null, "Cedula ingresado no existe");                
            }
    }

        
        if (!data.equals("jonathan3")){
            if (txtRegistroNombre.getText().isEmpty() || txtRegistroApellido.getText().isEmpty() || txtRegistroCedula.getText().isEmpty() || txtRegistroUser.getText().isEmpty() || txtRegistroContrasena.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos");
               
            } else {
                String dataToSave = "Su informacion es: \n"
                        + "\nNombre: " + txtRegistroNombre.getText()
                        + "\nApellido: " + txtRegistroApellido.getText()
                        + "\nCedula: " + txtRegistroCedula.getText();

                int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Person Saving",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                switch (selection) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Informacion guardada con exito", txtRegistroNombre.getText() + " " + txtRegistroApellido.getText() + "Saved", JOptionPane.INFORMATION_MESSAGE);

                        createUser(mongo, "Mechanic", "Users", txtRegistroNombre.getText(), txtRegistroApellido.getText(), txtRegistroCedula.getText(), txtRegistroUser.getText(), txtRegistroContrasena.getText());

                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "La informacion de ", txtRegistroNombre.getText() + " " + txtRegistroApellido.getText() + "NO fue guardada", JOptionPane.INFORMATION_MESSAGE);
                        emptyFields();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "El proceso ha sido cancelado", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                        emptyFields();
                        break;
                }
                emptyFields();
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Datos existentes");
             emptyFields();
        }
            
    }//GEN-LAST:event_btnRegistrarActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRegistroUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroUserActionPerformed

    private void txtRegistroCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroCedulaActionPerformed

    public void emptyFields() {
        txtRegistroNombre.setText("");
        txtRegistroApellido.setText("");
        txtRegistroCedula.setText("");
        txtRegistroUser.setText("");
        txtRegistroContrasena.setText("");
    }

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
            java.util.logging.Logger.getLogger(FRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblRegistro1;
    private javax.swing.JLabel lblRegistroCorreo;
    private javax.swing.JLabel lblRegistroError;
    private javax.swing.JLabel lblRegistroNombre;
    private javax.swing.JLabel lblRegistroNombre1;
    private javax.swing.JLabel lblRegistroPass;
    private javax.swing.JLabel lblRegistroPass1;
    private javax.swing.JLabel lblRetroceder;
    private javax.swing.JTextField txtRegistroApellido;
    private javax.swing.JTextField txtRegistroCedula;
    private javax.swing.JPasswordField txtRegistroContrasena;
    private javax.swing.JTextField txtRegistroNombre;
    private javax.swing.JTextField txtRegistroUser;
    // End of variables declaration//GEN-END:variables

}