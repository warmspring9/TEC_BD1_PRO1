/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.Controller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalej
 */
public class addProposal_1 extends javax.swing.JFrame {
    Controller control=Controller.getInstance();
    /**
     * Creates new form addProposal
     */
    public addProposal_1() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        
        for(int i=0; i<control.getCategorysNames().size(); i++ ){
            selectCategoryBox.addItem(control.getCategorysNames().get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        proposalPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        proposalTitleField = new javax.swing.JTextField();
        selectCategoryBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        budgetField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        proposalDescriptionField = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        addProposalPhotoButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(45, 49, 66));
        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 192, 192), 2, true));

        proposalPanel.setBackground(new java.awt.Color(79, 93, 117));
        proposalPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TITLE :");

        proposalTitleField.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        proposalTitleField.setSelectionColor(new java.awt.Color(239, 131, 84));
        proposalTitleField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                proposalTitleFieldKeyTyped(evt);
            }
        });

        selectCategoryBox.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        selectCategoryBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select category" }));
        selectCategoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCategoryBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUDGET :");

        budgetField.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        budgetField.setSelectionColor(new java.awt.Color(239, 131, 84));
        budgetField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                budgetFieldKeyTyped(evt);
            }
        });

        proposalDescriptionField.setColumns(20);
        proposalDescriptionField.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        proposalDescriptionField.setRows(5);
        proposalDescriptionField.setText("add a description to your proposal!!");
        proposalDescriptionField.setSelectionColor(new java.awt.Color(239, 131, 84));
        jScrollPane1.setViewportView(proposalDescriptionField);

        javax.swing.GroupLayout proposalPanelLayout = new javax.swing.GroupLayout(proposalPanel);
        proposalPanel.setLayout(proposalPanelLayout);
        proposalPanelLayout.setHorizontalGroup(
            proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proposalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(proposalPanelLayout.createSequentialGroup()
                        .addGroup(proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(proposalTitleField)
                            .addComponent(budgetField, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectCategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        proposalPanelLayout.setVerticalGroup(
            proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proposalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectCategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proposalTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(proposalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(budgetField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_image_png.png"))); // NOI18N

        addProposalPhotoButton.setFont(new java.awt.Font("Corbel Light", 2, 14)); // NOI18N
        addProposalPhotoButton.setForeground(new java.awt.Color(239, 131, 84));
        addProposalPhotoButton.setText("add a photo for the proposal!!");
        addProposalPhotoButton.setBorder(null);
        addProposalPhotoButton.setBorderPainted(false);
        addProposalPhotoButton.setContentAreaFilled(false);
        addProposalPhotoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProposalPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProposalPhotoButtonActionPerformed(evt);
            }
        });

        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enter_2_40px.png"))); // NOI18N
        submitButton.setBorder(null);
        submitButton.setBorderPainted(false);
        submitButton.setContentAreaFilled(false);
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelNaranja40.png"))); // NOI18N
        cancelButton.setBorder(null);
        cancelButton.setBorderPainted(false);
        cancelButton.setContentAreaFilled(false);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addProposalPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addGap(18, 18, 18)
                        .addComponent(submitButton))
                    .addComponent(proposalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addProposalPhotoButton))
                    .addComponent(proposalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProposalPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProposalPhotoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProposalPhotoButtonActionPerformed

    private void selectCategoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCategoryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectCategoryBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        maqueta newWindow;
        try {
            newWindow = new maqueta();
            newWindow.setVisible(true);
            
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(addProposal_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void budgetFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_budgetFieldKeyTyped
       char caracter = evt.getKeyChar();
    
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b'))
      {
         evt.consume(); 
      }   
    }//GEN-LAST:event_budgetFieldKeyTyped

    private void proposalTitleFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proposalTitleFieldKeyTyped
        if (proposalTitleField.getText().length()== 20) 
            evt.consume();   
        
        char car = evt.getKeyChar();
        if(Character.isLetter(car)){

        }else{
        evt.consume();
        getToolkit().beep();
        }
    }//GEN-LAST:event_proposalTitleFieldKeyTyped

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            control.createProposal(proposalTitleField.getText(),Integer.valueOf(budgetField.getText()), proposalDescriptionField.getText(), String.valueOf(selectCategoryBox.getSelectedItem()));
            
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(addProposal_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addProposal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProposal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProposal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProposal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new addProposal_1().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(addProposal_1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProposalPhotoButton;
    private javax.swing.JTextField budgetField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextArea proposalDescriptionField;
    private javax.swing.JPanel proposalPanel;
    private javax.swing.JTextField proposalTitleField;
    private javax.swing.JComboBox selectCategoryBox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
