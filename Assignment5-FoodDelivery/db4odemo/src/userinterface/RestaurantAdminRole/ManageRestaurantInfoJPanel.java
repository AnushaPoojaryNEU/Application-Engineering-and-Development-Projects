/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RestaurantAdminRole;

import Business.Restaurant.Restaurant;
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
public class ManageRestaurantInfoJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Restaurant restaurant;
    /**
     * Creates new form ManageRestaurantJPanel
     */
    public ManageRestaurantInfoJPanel(JPanel userProcessContainer, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.restaurant = restaurant;
        nameJTxt.setText(this.restaurant.getName());
        addressJText.setText(this.restaurant.getAddress());
        emailJTxt.setText(this.restaurant.getEmail());
        phoneJTxt.setText(this.restaurant.getPhoneNumber());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        emailJTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addressJText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameJTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneJTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();

        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Address:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Restaurant Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Manage Restaurant Info");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Phone Number:");

        updateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressJText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(updateBtn))
                    .addComponent(backBtn))
                .addContainerGap(863, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addressJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(emailJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(updateBtn)
                .addContainerGap(265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel adminwjp = (AdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String name = nameJTxt.getText();
        String address = addressJText.getText();
        String email = emailJTxt.getText();
        String phoneNumber = phoneJTxt.getText();
        
        if (name.equals("") || name == null) {
            JOptionPane.showMessageDialog(null, "Restaurant Name is Mandatory");
            return;
        }
        if (validEmailId() == false) {
            JOptionPane.showMessageDialog(null, "Restaurant email is invalid");
            return;
        }
        if (address.equals("") || address == null) {
            JOptionPane.showMessageDialog(null, "Restaurant Address is Mandatory");
        } 
        else if (phoneNumber.equals("") || phoneNumber == null) {
            JOptionPane.showMessageDialog(null, "Restaurant Phone Number is Mandatory");
        } 
        else {
            restaurant.setName(name);
            restaurant.setAddress(address);
            restaurant.setEmail(email);
            restaurant.setPhoneNumber(phoneNumber);
            JOptionPane.showMessageDialog(null, "Restaurant Details Updated Successfully!!");
            addressJText.setText("");
            emailJTxt.setText("");
            nameJTxt.setText("");
            phoneJTxt.setText("");
        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJText;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField emailJTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameJTxt;
    private javax.swing.JTextField phoneJTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private boolean validEmailId()  {
        Pattern p = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
        Matcher m = p.matcher(emailJTxt.getText());
        Boolean b = m.matches();
        return b;
    }
    
}
