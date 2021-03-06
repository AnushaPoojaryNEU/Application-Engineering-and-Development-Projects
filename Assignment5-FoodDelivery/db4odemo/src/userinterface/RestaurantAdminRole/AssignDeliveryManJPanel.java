/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anu61
 */
public class AssignDeliveryManJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Restaurant restaurant;
    UserAccount userAccount;
    DeliveryManDirectory deliveryManDirectory;
    WorkRequest request;
    /**
     * Creates new form AssignDeliveryManJPanel
     */
    public AssignDeliveryManJPanel(JPanel userProcessContainer, UserAccount userAccount, WorkRequest request, DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.deliveryManDirectory = deliveryManDirectory;
        this.userAccount = userAccount;
        this.valueLabel.setText(Integer.toString(request.getId()));
        if (deliveryManDirectory.getDeliveryManList().size() == 0) {
            deliveryManJTable.setVisible(false);
            assignBtn.setVisible(false);
            lblNotFound.setVisible(true);
            lblNotFound.setText("No delivery Man Found");
        } else {
            populateDeliveryMan();
            deliveryManJTable.setVisible(true);
            assignBtn.setVisible(true);
            lblNotFound.setVisible(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        deliveryManJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        assignBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        lblNotFound = new javax.swing.JLabel();

        deliveryManJTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deliveryManJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                " Username", "Delivery Man Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deliveryManJTable);

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        assignBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        assignBtn.setText("Assign ");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Assign Delivery Man");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Order Id:");

        valueLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        valueLabel.setText("value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblNotFound)
                        .addGap(488, 488, 488)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(valueLabel))
                            .addComponent(backJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(613, 613, 613)
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(813, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblNotFound)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valueLabel))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageOrdersJPanel manageOrdersJPanel = (ManageOrdersJPanel) component;
        //adminWorkArea.populateTree();
        manageOrdersJPanel.populateOrderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        int selectedRow = deliveryManJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        DeliveryMan deliveryMan = (DeliveryMan) deliveryManJTable.getValueAt(selectedRow, 0);
        // UserAccount receiver=deliveryMan.getUserAccountDirectory().getUserAccountList().get(0);
        JOptionPane.showMessageDialog(null, "Order Assigned Successfully!!");
        // request.setReceiver(receiver);
        request.setStatus("Picked for Delivery");
        request.setSender(userAccount);
       // request.setReceiver(deliveryMan.getName());
        deliveryMan.getWorkQueue().getWorkRequestList().add(request);
    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable deliveryManJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNotFound;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    public void populateDeliveryMan() {
        DefaultTableModel sf = (DefaultTableModel) deliveryManJTable.getModel();
        sf.setRowCount(0);
        for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManList()) {
            Object[] row = new Object[2];
            row[0] = deliveryMan;
            row[1] = deliveryMan.getName();
            sf.addRow(row);
        }
    }
}
