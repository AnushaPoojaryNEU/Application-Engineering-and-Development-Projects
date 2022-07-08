/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anu61
 */
public class UpdateEmployees extends javax.swing.JPanel {

    /**
     * Creates new form UpdateEmployees
     */
    JPanel userProcessContainer;
    EcoSystem system;
    String role;
    String username;

    public UpdateEmployees(JPanel userProcessContainer, EcoSystem system, String role, String username) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.role= role;
        this.username = username;
        this.usernameJTextField.setEnabled(false);
        
        this.populateData();
        
       
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
        usernameJTextField = new javax.swing.JTextField();
        passwordJPasswordField = new javax.swing.JPasswordField();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        usernameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameJTextFieldActionPerformed(evt);
            }
        });

        passwordJPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJPasswordFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Password:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Username:");

        submitJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        submitJButton.setText("Update");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Update");

        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(submitJButton)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(532, 532, 532)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(673, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameJTextFieldActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String name = nameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());

        if (password.equals("") || name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the details");
            return;
        }

        if (role.equals("Customer")) {

            if (validName()== false) {
                JOptionPane.showMessageDialog(null, "Invalid Name");
                return;
            }

            for (Customer c : system.getCustomerDirectory().getCustomerList()) {
                if (c.getCustUserName() != null) {
                    if (c.getCustUserName().equals(this.username)) {
                        Customer cust = c;
                        cust.setName(nameJTextField.getText());
                        break;
                    }
                }
            }

            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    ua.setPassword(password);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Customer Details updated succesfully");
            nameJTextField.setText("");
            passwordJPasswordField.setText("");
            usernameJTextField.setText("");
            
        } else if (role.equals("Admin")) {
            Restaurant rest = null;
            //  String password = String.valueOf(passwordJPasswordField.getPassword());
            for (Restaurant restaurant : system.getRestaurantDirectory().getRestaurantList()) {
                if (restaurant.getRestaurantAdminUsername()!= null) {
                    if (restaurant.getRestaurantAdminUsername().equals(this.username)) {
                        rest = restaurant;
                        rest.setName(nameJTextField.getText());
                        break;
                    }
                }
            }
            for (Employee employee : rest.getEmployeeDirectory().getEmployeeList()) {
                for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(employee.getName())) {
                        ua.setPassword(password);
                        break;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Restaurant Details updated succesfully");
            nameJTextField.setText("");
            passwordJPasswordField.setText("");
            usernameJTextField.setText("");
        } else {
            if (validName()== false) {
                JOptionPane.showMessageDialog(null, "Invalid Name");
                return;
            }
            DeliveryMan del = null;
            for (DeliveryMan deliveryMan : system.getDeliveryManDirectory().getDeliveryManList()) {
                if (deliveryMan.getDeliveryManUserName()!= null) {
                    if (deliveryMan.getDeliveryManUserName().equals(this.username)) {
                        del = deliveryMan;
                        del.setName(nameJTextField.getText());
                        break;
                    }
                }
            }

            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    ua.setPassword(password);
                    break;
                }
            }

            JOptionPane.showMessageDialog(null, "Delivery Man Details updated succesfully");
            nameJTextField.setText("");
            passwordJPasswordField.setText("");
            usernameJTextField.setText("");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if (role.equals("Customer")) {

            ManageCustomersJPanel manageCustomersJPanel = (ManageCustomersJPanel) component;
            manageCustomersJPanel.populateTable();

        } else if (role.equals("Admin")) {
            ManageRestaurantJPanel manageRestaurantJPanel = (ManageRestaurantJPanel) component;
            manageRestaurantJPanel.populateTable();
        } else {
            ManageDeliveryManJPanel manageDeliveryManJPanel = (ManageDeliveryManJPanel) component;
            manageDeliveryManJPanel.populateTable();
        }

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void passwordJPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJPasswordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
         if (role.equals("Customer")) {
            usernameJTextField.setText(this.username);
            for (Customer c : system.getCustomerDirectory().getCustomerList()) {
                if (c.getCustUserName() != null) {
                    if (c.getCustUserName().equals(this.username)) {
                        Customer cust = c;
                        nameJTextField.setText(cust.getName());
                    }
                }
            }

            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    UserAccount userAccount = ua;
                    passwordJPasswordField.setText(userAccount.getPassword());
                }
            }
        } else if (role.equals("Admin")) {
            //this.nameJTextField.setEnabled(false);
            usernameJTextField.setText(this.username);
            Restaurant rest = null;
            for (Restaurant restaurant : system.getRestaurantDirectory().getRestaurantList()) {
                if (restaurant.getRestaurantAdminUsername()!= null) {
                    if (restaurant.getRestaurantAdminUsername().equals(this.username)) {
                        rest = restaurant;
                        nameJTextField.setText(rest.getName());
                    }
                }
            }
            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    UserAccount userAccount = ua;
                    passwordJPasswordField.setText(userAccount.getPassword());
                }
            }
        
        } else {
            usernameJTextField.setText(this.username);
            for (DeliveryMan deliveryMan : system.getDeliveryManDirectory().getDeliveryManList()) {
                if (deliveryMan.getDeliveryManUserName() != null) {
                    if (deliveryMan.getDeliveryManUserName().equals(this.username)) {
                        DeliveryMan d = deliveryMan;
                        nameJTextField.setText(d.getName());
                    }
                }
            }

            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    UserAccount userAccount = ua;
                    passwordJPasswordField.setText(userAccount.getPassword());
                }
            }

        }
    }
    private boolean validName() {
        Pattern p = Pattern.compile("^[a-zA-Z]*$");
        Matcher m = p.matcher(nameJTextField.getText());
        Boolean b = m.matches();
        return b;
    }

    
}
