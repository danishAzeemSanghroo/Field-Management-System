
import RashidBeans.TractorBean;
import RashidDataManager.RashidDataBaseManager;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danish
 */
public class TractorFrame extends javax.swing.JFrame {

    /**
     * Creates new form TractorFrame
     */
    public TractorFrame() {
        initComponents();
        getTractor();
        tractorWorkComboBox.addItem("Plough");
        tractorWorkComboBox.addItem("Yoke");
        tractorWorkComboBox.addItem("Mud Taking");
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rashidAccountLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameListLabel = new javax.swing.JLabel();
        customerIdTextField = new javax.swing.JTextField();
        customerNameTextField = new javax.swing.JTextField();
        casteTextField = new javax.swing.JTextField();
        tractorWorkComboBox = new javax.swing.JComboBox();
        paidMoneyTextField = new javax.swing.JTextField();
        remainingMoneyTextField = new javax.swing.JTextField();
        timeTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        totalWorkTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerNameList = new javax.swing.JList();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1394, 803));
        setMinimumSize(new java.awt.Dimension(1394, 803));
        setPreferredSize(new java.awt.Dimension(1394, 803));
        getContentPane().setLayout(null);

        rashidAccountLabel.setFont(new java.awt.Font("Stencil Std", 1, 36)); // NOI18N
        rashidAccountLabel.setText("RASHID ACCOUNT");
        getContentPane().add(rashidAccountLabel);
        rashidAccountLabel.setBounds(500, 20, 470, 70);

        jLabel2.setText("CUSTOMER ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 130, 120, 20);

        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 190, 43, 20);

        jLabel4.setText("CASTE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 250, 49, 20);

        jLabel5.setText("WORK");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 310, 45, 20);

        jLabel6.setText("PAID MONEY");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 370, 96, 20);

        jLabel7.setText("REMAINING MONEY");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 430, 146, 20);

        jLabel8.setText("TIME");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 490, 37, 20);

        jLabel9.setText("DATE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 550, 41, 20);

        jLabel10.setText("TOTAL WORK");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, 610, 101, 20);

        jLabel11.setText("REMARKS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(130, 670, 70, 20);

        nameListLabel.setText("NAME");
        getContentPane().add(nameListLabel);
        nameListLabel.setBounds(640, 400, 43, 20);
        getContentPane().add(customerIdTextField);
        customerIdTextField.setBounds(310, 130, 130, 26);
        getContentPane().add(customerNameTextField);
        customerNameTextField.setBounds(310, 190, 290, 26);
        getContentPane().add(casteTextField);
        casteTextField.setBounds(310, 250, 290, 26);

        getContentPane().add(tractorWorkComboBox);
        tractorWorkComboBox.setBounds(310, 310, 290, 26);
        getContentPane().add(paidMoneyTextField);
        paidMoneyTextField.setBounds(310, 370, 290, 26);
        getContentPane().add(remainingMoneyTextField);
        remainingMoneyTextField.setBounds(310, 430, 290, 26);
        getContentPane().add(timeTextField);
        timeTextField.setBounds(310, 490, 290, 26);
        getContentPane().add(dateTextField);
        dateTextField.setBounds(310, 550, 290, 26);
        getContentPane().add(totalWorkTextField);
        totalWorkTextField.setBounds(310, 610, 290, 26);

        remarksTextArea.setColumns(20);
        remarksTextArea.setRows(5);
        jScrollPane1.setViewportView(remarksTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 670, 300, 96);

        customerNameList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                customerNameListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(customerNameList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(630, 440, 380, 330);

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(1060, 190, 90, 29);

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(1060, 260, 93, 29);

        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(1060, 340, 100, 29);

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(1060, 420, 100, 29);

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(1040, 709, 89, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
         if(deleteButton==evt.getSource())
            deleteTractor(); // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
                 if(addButton==evt.getSource())
                addTractor(); // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
             if(updateButton==evt.getSource())
            updateTractor();   
             // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
                if(clearButton==evt.getSource())
            clear();  // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void customerNameListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_customerNameListValueChanged
        TractorBean bean=(TractorBean)customerNameList.getSelectedValue();
   if(bean==null)return;

 customerIdTextField.setText( ""+bean.getCustomerId());
   customerNameTextField.setText( bean.getCustomerName());
  casteTextField.setText( bean.getCaste());
  paidMoneyTextField.setText( ""+bean.getPaidMoney());
  remainingMoneyTextField.setText( ""+bean.getRemainingMoney());
  tractorWorkComboBox.setSelectedItem( bean.getTotalWork());
    timeTextField.setText( bean.getTractorTime());
  dateTextField.setText( bean.getCurrentDate());
  totalWorkTextField.setText( bean.getTractorWork());
  
   remarksTextArea.setText( bean.getRemarks());        // TODO add your handling code here:
 
    }//GEN-LAST:event_customerNameListValueChanged
    private void addTractor(){
    String customerName=customerNameTextField.getText();
    String caste=casteTextField.getText();
    String tractorWork=tractorWorkComboBox.getSelectedItem().toString();
    int paidMoney=Integer.parseInt(paidMoneyTextField.getText());
    int remainingMoney=Integer.parseInt(remainingMoneyTextField.getText());
    String tractorTime=timeTextField.getText();
    String currentDate=dateTextField.getText();
    String totalWork=totalWorkTextField.getText();
    String remarks=remarksTextArea.getText();

    try{
               	int rows=RashidDataBaseManager.addTractor(customerName,caste,tractorWork,paidMoney,remainingMoney,tractorTime,currentDate,totalWork,remarks);
	if(rows>=1){
	        	javax.swing.JOptionPane.showMessageDialog(this,rows+" Records Inserted."); 
		clear();
		getTractor();				
	}
    }catch(Exception e){
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,"Error: "+e.getMessage()); 
    }

}   //end 

private void deleteTractor(){
    TractorBean bean = (TractorBean)customerNameList.getSelectedValue();
    if(bean==null)return;
    try{
           int rows = RashidDataBaseManager.deleteTractor(bean.getCustomerId());
           if(rows>=1){
           javax.swing.JOptionPane.showMessageDialog(this,rows+"Record Removed.");
           getTractor();
           clear();
           }
    }catch(Exception e){
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,"Error: "+e.getMessage()); 
    }

}
private void updateTractor(){
     TractorBean bean=(TractorBean)customerNameList.getSelectedValue();
     if(bean==null)return;


    String customerName=customerNameTextField.getText();
    String caste=casteTextField.getText();
    String tractorWork=tractorWorkComboBox.getSelectedItem().toString();
    int paidMoney=Integer.parseInt(paidMoneyTextField.getText());
    int remainingMoney=Integer.parseInt(remainingMoneyTextField.getText());
    String tractorTime=timeTextField.getText();
    String currentDate=dateTextField.getText();
    String totalWork=totalWorkTextField.getText();
    String remarks=remarksTextArea.getText();
    

     try{
	/*int rows=DatabaseManager.updateTractor(bean.getFacId(),facName,remarks);*/
         int rows=RashidDataBaseManager.updateTractor(bean.getCustomerId(),customerName,caste,tractorWork,paidMoney,remainingMoney,tractorTime,currentDate,totalWork,remarks);
	if(rows>=1){
	    javax.swing.JOptionPane.showMessageDialog(this,rows+" Record Modified.");
	    getTractor();
	    clear();
        	}
     }catch(Exception e){
         e.printStackTrace();
         javax.swing.JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
     } 
}

private void clear(){
    customerIdTextField.setText("");
    customerNameTextField.setText("");
    casteTextField.setText("");
    paidMoneyTextField.setText("");
    remainingMoneyTextField.setText("");
    timeTextField.setText("");
    dateTextField.setText("");
    totalWorkTextField.setText("");
    remarksTextArea.setText("");
}
private void getTractor(){
	try{
		Vector v=RashidDataBaseManager.getTractor();	
                customerNameList.setListData(v);
	}catch(Exception e){
		javax.swing.JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
	}
}//end Method 
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
            java.util.logging.Logger.getLogger(TractorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TractorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TractorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TractorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TractorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField casteTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField customerIdTextField;
    private javax.swing.JList customerNameList;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameListLabel;
    private javax.swing.JTextField paidMoneyTextField;
    private javax.swing.JLabel rashidAccountLabel;
    private javax.swing.JTextField remainingMoneyTextField;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JTextField totalWorkTextField;
    private javax.swing.JComboBox tractorWorkComboBox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
