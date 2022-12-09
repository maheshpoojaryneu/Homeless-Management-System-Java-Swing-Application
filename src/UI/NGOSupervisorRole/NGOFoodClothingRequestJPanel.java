/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGOSupervisorRole;

import HMS.NetworkDirectory;
import HMS.Enterprise.Enterprise;
import HMS.FoodClothing.Cloth;
import HMS.FoodClothing.ClothInventory;
import HMS.FoodClothing.Food;
import HMS.FoodClothing.FoodInventory;
import HMS.Network.Network;
import HMS.Organization.NGOOrganization;
import HMS.Organization.Organization;
import HMS.UserAccount.UserAccount;
import HMS.WorkQueue.NGOWorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahes
 */
public class NGOFoodClothingRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOFoodRequestJPanel
     */
    private JPanel userProcessContainer;
    private NetworkDirectory business;
    private UserAccount userAccount;
    private NGOOrganization ngoOrganization;
    private Enterprise enterprise;
    private Network network;
    private NGOWorkRequest request;
    private FoodInventory foodinventory;
    private ClothInventory clothinventory;
    
    public NGOFoodClothingRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization ngoOrganization, NetworkDirectory business, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.ngoOrganization = (NGOOrganization)ngoOrganization;
        this.enterprise = enterprise;
        populateFoodTbl();
        populateClothTbl();
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
        clothTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        clothTbl.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        clothTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Shelter", "Location", "Cloth Quantity", "Provided By", "Donated On"
            }
        ));
        clothTbl.setSelectionBackground(new java.awt.Color(0, 0, 0));
        clothTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clothTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clothTbl);

        foodTbl.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        foodTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Shelter", "Location", "Food Quantity", "Provided By", "DonatedOn"
            }
        ));
        foodTbl.setSelectionBackground(new java.awt.Color(0, 0, 0));
        foodTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(foodTbl);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cloth Inventory");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Food Inventory");

        jLabel3.setText("Total Quantity Available:");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField1");

        jLabel4.setText("Total Quantity Available:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(750, 750, 750))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1738, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(834, 834, 834)
                                .addComponent(jLabel1)
                                .addGap(710, 710, 710)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(697, 697, 697)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clothTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clothTblMouseClicked

        int i = clothTbl.getSelectedRow();
        /* TableModel model = homelessTbl.getModel();
        idTxt.setText(model.getValueAt(i,0).toString());
        nameTxt.setText(model.getValueAt(i,1).toString());

        clothTxt.setText(model.getValueAt(i,5).toString());
        treatmentTxt.setText(model.getValueAt(i,6).toString());
        foodTxt.setText(model.getValueAt(i,7).toString());
        criminalTxt.setText(model.getValueAt(i,8).toString());
        ageTxt.setText(model.getValueAt(i,2).toString());
        locationTxt.setText(model.getValueAt(i,3).toString());
        genderTxt.setText(model.getValueAt(i,4).toString());
        */
    }//GEN-LAST:event_clothTblMouseClicked

    private void foodTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_foodTblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clothTbl;
    private javax.swing.JTable foodTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void populateFoodTbl() {
        
        DefaultTableModel model = (DefaultTableModel) foodTbl.getModel();
        model.setRowCount(0);
        
        for (Food food : foodinventory.getFoodinventory())
            
        {
            Object[] row = new Object[5];
            row[0]=food.getShelter();
            row[1]=food.getLocation();
            row[2]=food.getQuantity();
            row[3]=food.getProvidedby();
            row[4]=food.getDonatedon();
           
           
            
            model.addRow(row);
            
        }

    }

    private void populateClothTbl() {
        
        DefaultTableModel model = (DefaultTableModel) clothTbl.getModel();
        model.setRowCount(0);
        
        for (Cloth cloth : clothinventory.getClothinventory())
            
        {
            Object[] row = new Object[5];
            row[0]=cloth.getShelter();
            row[1]=cloth.getLocation();
            row[2]=cloth.getQuantity();
            row[3]=cloth.getProvidedby();
            row[4]=cloth.getDonatedon();
           
            
            model.addRow(row);
            
        }

        
    }
}
