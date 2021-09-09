/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.view;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import ec.edu.espe.mechanic.controller.Validacion;
import static ec.edu.espe.mechanic.utils.Connection.createConnection;
import static ec.edu.espe.mechanic.utils.OperationMongoDB.deleteParts;
import static ec.edu.espe.mechanic.utils.OperationMongoDB.updateParts;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author G7
 */
public class FrmPartsManager extends javax.swing.JFrame {

    MongoClient mongo = createConnection();
    Validacion AdmValid = new Validacion();
    
    /**
     * Creates new form FrmRead
     */
    public FrmPartsManager() {
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
        jLabel5 = new javax.swing.JLabel();
        cmbField = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDataToUpdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNewData = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSpeakers = new javax.swing.JTable();
        btnShow = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPlate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPEAKERS MANAGE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 0));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setText("Tipo de Dato");

        cmbField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Modelo", "Precio" }));
        cmbField.setToolTipText("");
        cmbField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("Dato antiguo");

        txtDataToUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataToUpdateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setText("Dato Nuevo");

        txtNewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewDataActionPerformed(evt);
            }
        });

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Borrar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblSpeakers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblSpeakers);

        btnShow.setFont(new java.awt.Font("Elephant", 3, 14)); // NOI18N
        btnShow.setText("Ver Todo");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/mechanic/images/return32.png"))); // NOI18N
        btnReturn.setContentAreaFilled(false);
        btnReturn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/mechanic/images/return64.png"))); // NOI18N
        btnReturn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/mechanic/images/return64.png"))); // NOI18N
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("Actualizar Piezas");

        txtPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setText("Codigo");

        jLabel7.setText("----------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel8.setText("Datos a modificar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(148, 148, 148))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134)))
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(235, 235, 235))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(138, 138, 138)
                        .addComponent(cmbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataToUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNewData, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(btnUpdate))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnDelete)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataToUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNewData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        DBCursor cursor = null;
        DB db = mongo.getDB("Mechanic");
        DBCollection dbCollection = db.getCollection("Parts");
        try {
            cursor = dbCollection.find();
            String[] columnNames = {"Codigo", "Nombre", "Marca", "Modelo", "Precio"};
            DefaultTableModel modelTable = new DefaultTableModel(columnNames, 0);
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String code = (String) obj.get("Codigo");
                String name = (String) obj.get("Nombre");
                String trademark = (String) obj.get("Marca");
                String model = (String) obj.get("Modelo");
                String price = (String) obj.get("Precio");
                modelTable.addRow(new Object[]{code, name, trademark, model, price});
            }
            tblSpeakers.setModel(modelTable);
            cursor.close();
        } catch (Exception ex) {
            System.out.println("Error printing tables");
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String dataToDelete = "Usted desea eliminar " + txtPlate.getText() + "?";
        if (txtPlate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "FILL ALL THE FIELDS");
        } 
        
        boolean valid = AdmValid.validarCode(txtPlate.getText());
            
        if(valid == true) {
            int selection = JOptionPane.showConfirmDialog(null, dataToDelete, "Borrado",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            switch (selection) {
                case 0:
                    JOptionPane.showMessageDialog(null, "La informacion fue eliminada", txtPlate.getText() + "Eliminado",
                            JOptionPane.INFORMATION_MESSAGE);
                    deleteParts(mongo, "Mechanic", "Parts", txtPlate.getText());
                    txtPlate.setText("");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Se cancelo el proceso", txtPlate.getText() + "NO eliminado",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtPlate.setText("");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Se cancelo el proceso", txtPlate.getText() + "Calcelado",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Datos no validos");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        String dataToUpdate = "Desea actualizar la informacion " + txtDataToUpdate.getText() + "?";

        if (txtDataToUpdate.getText().isEmpty() || txtNewData.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } 
        
        boolean valid = AdmValid.validarCode(txtPlate.getText());
            
        if(valid == true){
            int selection = JOptionPane.showConfirmDialog(null, dataToUpdate, "Speaker Updating",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            switch (selection) {
                case 0:
                    JOptionPane.showMessageDialog(null, "La informacion fue actualizada", txtDataToUpdate.getText() + "Actualizada",
                            JOptionPane.INFORMATION_MESSAGE);
                    updateParts(mongo, "Mechanic", "Parts", txtDataToUpdate.getText(), txtNewData.getText(), cmbField.getSelectedItem().toString());
                    txtDataToUpdate.setText("");
                    txtNewData.setText("");
                    cmbField.setSelectedIndex(0);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "La informacion NO fue guardad", txtPlate.getText() + "Sin datos cambiados",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtDataToUpdate.setText("");
                    txtNewData.setText("");
                    cmbField.setSelectedIndex(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El proceso fue cancelado", txtPlate.getText() + "Cancelado",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Codigo no valido");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        FrmParts view = new FrmParts();
        this.setVisible(false);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void cmbFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFieldActionPerformed

    private void txtDataToUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataToUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataToUpdateActionPerformed

    private void txtNewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewDataActionPerformed

    private void txtPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlateActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPartsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPartsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPartsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPartsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPartsManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSpeakers;
    private javax.swing.JTextField txtDataToUpdate;
    private javax.swing.JTextField txtNewData;
    private javax.swing.JTextField txtPlate;
    // End of variables declaration//GEN-END:variables
}
