/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
       // populateTree();
    }
    
//    public void populateTree(){
//        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
//        List<Restaurant> restaurantList = ecosystem.getRestaurantDirectory().getRestaurantList();
//        ArrayList<DeliveryMan> deliveryManList;
//        ArrayList<Restaurant> restaurantList;
//        
//        Restaurant rest;
//        DeliveryMan deliveryMan;
//        
//        DefaultMutableTreeNode nodes=new DefaultMutableTreeNode("Nodes");
//        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
//        root.removeAllChildren();
//        root.insert(nodes, 0);
//        
//        DefaultMutableTreeNode restNode;
//        DefaultMutableTreeNode deliveryManNode;
//        
//        for(int i=0;i<restaurantList.size();i++){
//            rest=restaurantList.get(i);
//            restNode=new DefaultMutableTreeNode(rest.getName());
//            nodes.insert(restNode, i);
//            
//            deliveryManList = ecosystem.getDeliveryManDirectory().getDeliveryManList();
//            for(int j=0; j<deliveryManList.size();j++){
//                enterprise=deliveryManList.get(j);
//                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
//                networkNode.insert(enterpriseNode, j);
//                
//                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
//                
//            }
//        }
//        model.reload();
//    
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        btnManageNetwork.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnManageNetwork.setText("Manage All Customers >>");
        btnManageNetwork.setBorder(null);
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnManageEnterprise.setText("Manage Restaurants >>");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageAdmin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnManageAdmin.setText("Manage Deliveryman >>");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Welcome Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(529, 529, 529)
                .addComponent(jLabel1)
                .addContainerGap(472, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageAdmin)
                    .addComponent(btnManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(448, 448, 448))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageAdmin, btnManageEnterprise, btnManageNetwork});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(132, 132, 132)
                .addComponent(btnManageNetwork)
                .addGap(50, 50, 50)
                .addComponent(btnManageEnterprise)
                .addGap(44, 44, 44)
                .addComponent(btnManageAdmin)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageEnterprise, btnManageNetwork});

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageCustomersJPanel manageCustomersJPanel = new ManageCustomersJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageCustomersJPanel", manageCustomersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageRestaurantJPanel manageRestaurantJPanel = new ManageRestaurantJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageRestaurantJPanel", manageRestaurantJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        ManageDeliveryManJPanel manageDeliveryJPanel = new ManageDeliveryManJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageDeliveryJPanel", manageDeliveryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
