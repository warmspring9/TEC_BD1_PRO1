/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.Controller;
import java.sql.SQLException;


/**
 *
 * @author Mau
 */
public class ProposalPanel extends javax.swing.JPanel {
    
    Controller control=Controller.getInstance();
    int idPerson=control.getIdPerson();
    public ProposalPanel(int idProp) throws SQLException{
        initComponents();
        if(!control.isAdmin(idPerson)){
            editProposal.setVisible(false);
    
        }
        
        
        titleText.setText(control.getProposalTitle(idProp));
        budgetText.setText(Integer.toString(control.getProposalBudget(idProp))) ;
        contentText.setText(control.getProposalContent(idProp));
        for(int i=0; i<control.getCategorysNames().size(); i++ ){
            categoryComboBox.addItem(control.getCategorysNames().get(i));
        }
        categoryComboBox.setSelectedItem(control.getCategoryName(control.getProposalIdCategory(idProp)));
        trashButton.setVisible(false);
        enterButton.setVisible(false);
        contentText.setLineWrap(true);
        
        
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentText = new javax.swing.JTextArea();
        titleText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        budgetText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        editProposal = new javax.swing.JButton();
        trashButton = new javax.swing.JButton();
        categoryComboBox = new javax.swing.JComboBox();
        enterButton = new javax.swing.JButton();
        likeButton = new javax.swing.JButton();
        dislikeButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dislikeCount = new javax.swing.JLabel();
        likeCount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(45, 49, 66));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(720, 340));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(720, 340));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_image_png.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(79, 93, 117));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        contentText.setEditable(false);
        contentText.setBackground(new java.awt.Color(191, 192, 192));
        contentText.setColumns(20);
        contentText.setRows(5);
        contentText.setEnabled(false);
        jScrollPane1.setViewportView(contentText);

        titleText.setEditable(false);
        titleText.setBackground(new java.awt.Color(79, 93, 117));
        titleText.setForeground(new java.awt.Color(255, 255, 255));
        titleText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        titleText.setBorder(null);
        titleText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        titleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextActionPerformed(evt);
            }
        });
        titleText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                titleTextKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 192, 192));
        jLabel2.setText("Budget :");

        jLabel3.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 192, 192));
        jLabel3.setText("Title :");

        budgetText.setEditable(false);
        budgetText.setBackground(new java.awt.Color(79, 93, 117));
        budgetText.setForeground(new java.awt.Color(255, 255, 255));
        budgetText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        budgetText.setBorder(null);
        budgetText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        budgetText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                budgetTextKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 192, 192));
        jLabel4.setText("Category :");

        editProposal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editProfile.png"))); // NOI18N
        editProposal.setBorder(null);
        editProposal.setBorderPainted(false);
        editProposal.setContentAreaFilled(false);
        editProposal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProposalActionPerformed(evt);
            }
        });

        trashButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/paper_waste_25px.png"))); // NOI18N
        trashButton.setBorder(null);
        trashButton.setBorderPainted(false);
        trashButton.setContentAreaFilled(false);
        trashButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trashButtonActionPerformed(evt);
            }
        });

        categoryComboBox.setToolTipText("");
        categoryComboBox.setEnabled(false);
        categoryComboBox.setName(""); // NOI18N

        enterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enter_2_23px.png"))); // NOI18N
        enterButton.setBorder(null);
        enterButton.setBorderPainted(false);
        enterButton.setContentAreaFilled(false);
        enterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(budgetText, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(trashButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editProposal)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editProposal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleText)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trashButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterButton)
                    .addComponent(budgetText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        likeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/thumb_up_40px.png"))); // NOI18N
        likeButton.setBorder(null);
        likeButton.setBorderPainted(false);
        likeButton.setContentAreaFilled(false);
        likeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dislikeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/thumbs_down_40px.png"))); // NOI18N
        dislikeButton.setBorder(null);
        dislikeButton.setBorderPainted(false);
        dislikeButton.setContentAreaFilled(false);
        dislikeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/comment40.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        dislikeCount.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        dislikeCount.setForeground(new java.awt.Color(255, 255, 255));
        dislikeCount.setText("0");

        likeCount.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        likeCount.setForeground(new java.awt.Color(255, 255, 255));
        likeCount.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(likeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(likeCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dislikeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dislikeCount)
                        .addGap(257, 257, 257)
                        .addComponent(jButton3)
                        .addGap(16, 16, 16))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dislikeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(likeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(likeCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dislikeCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        comments newWindow = new comments();
        
        newWindow.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void editProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProposalActionPerformed
        
        budgetText.setEditable(true);
        titleText.setEditable(true);
        categoryComboBox.setEditable(true);
        trashButton.setVisible(true);
        contentText.setEditable(true);
        enterButton.setVisible(true);
        
        
        
    }//GEN-LAST:event_editProposalActionPerformed

    private void titleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextActionPerformed
        
    }//GEN-LAST:event_titleTextActionPerformed

    private void titleTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleTextKeyTyped
    
        if (titleText.getText().length()== 41) 
        evt.consume();   
        
        char car = evt.getKeyChar();
        if(Character.isLetter(car)){

        }else{
        evt.consume();
        getToolkit().beep();
        }
        

    }//GEN-LAST:event_titleTextKeyTyped

    private void budgetTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_budgetTextKeyTyped
        char caracter = evt.getKeyChar();
    
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b'))
      {
         evt.consume(); 
      }  
    }//GEN-LAST:event_budgetTextKeyTyped

    private void trashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trashButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        
        budgetText.setEditable(false);
        titleText.setEditable(false);
        categoryComboBox.setEditable(false);
        trashButton.setVisible(false);
        contentText.setEditable(false);
        enterButton.setVisible(false);
        
    }//GEN-LAST:event_enterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField budgetText;
    private javax.swing.JComboBox categoryComboBox;
    private javax.swing.JTextArea contentText;
    private javax.swing.JButton dislikeButton;
    private javax.swing.JLabel dislikeCount;
    private javax.swing.JButton editProposal;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton likeButton;
    private javax.swing.JLabel likeCount;
    private javax.swing.JTextField titleText;
    private javax.swing.JButton trashButton;
    // End of variables declaration//GEN-END:variables
}
