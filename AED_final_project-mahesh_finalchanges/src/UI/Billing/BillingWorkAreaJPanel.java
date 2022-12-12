
package UI.Billing;

import HMS.NetworkDirectory;
import HMS.Enterprise.Enterprise;
import HMS.Homeless.Homeless;
import HMS.Homeless.HomelessDirectory;
import HMS.Network.Network;
import HMS.Organization.BillingOrganization;
import HMS.Organization.LabOrganization;
import HMS.Organization.Organization;
import HMS.UserAccount.UserAccount;
import HMS.WorkQueue.BillingWorkQueue;
import HMS.WorkQueue.WorkRequest;
import HMS.Email.Email;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import HMS.Homeless.Shelter;
import HMS.Homeless.ShelterDirectory;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;


/**
 *
 * @author mahes
 */
public class BillingWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BillingWorkAreaJPanel
     */
    
    
    
     private JPanel userProcessContainer;
    private BillingOrganization billingOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HomelessDirectory homelessDirectory;
    private Homeless homeless;
    private NetworkDirectory business;
    private Network network;
     private ShelterDirectory shelterDirectory;
    private Shelter shelter;
    
    
    
    
    public BillingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, NetworkDirectory business, String location) {
        initComponents();
        
        
        
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.billingOrganization = (BillingOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
        this.homelessDirectory = new HomelessDirectory();
         this.shelterDirectory = new ShelterDirectory();
        btnGovernment.setVisible(false);
        populateTable();
        populateTable11();
        txtCurrentLocation.setText(location);
        loc();
        assignShelter.setToolTipText("Button to assign shelter on the basis of Person's location");
        btnGovernment.setToolTipText("Send the total generated bill to government for claims");
        
    }

    
    
    public void loc()
    {
        
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
             JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        BillingWorkQueue request = (BillingWorkQueue) workRequestJTable.getValueAt(selectedRow, 0);

        if(txtCurrentLocation.getText().equals("Quincy")){
            request.setShelterLocation("Cambridge");
            txtShelterLocation.setText(request.getShelterLocation());
        }

        else if(txtCurrentLocation.getText().equals("Boylston Street")){
            request.setShelterLocation("Boston");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Waltham")){
            request.setShelterLocation("Wrentham");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Saugus")){
            request.setShelterLocation("Wrentham");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Brookline")){
            request.setShelterLocation("New York");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Fenway")){
            request.setShelterLocation("Park Drive");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Park Drive")){
            request.setShelterLocation("Park Drive");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("High Street")){
            request.setShelterLocation("Cambridge");
            txtShelterLocation.setText(request.getShelterLocation());
        }
    }
    
     public void populateTable11(){
            DefaultTableModel dtm = (DefaultTableModel) shelterTbl.getModel();
            dtm.setRowCount(0);
            for(Shelter shelter : shelterDirectory.getShelterList()){
                Object[] row = new Object[3];
                row[0] = shelter;
                row[1] = shelter.getName();
                row[2] = shelter.getShelterLocation();
                 dtm.addRow(row);
            }
        }
     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : billingOrganization.getWorkQueue().getWorkRequestList()){
         
            Object[] row = new Object[11];
            
            row[1] = request.getMessage();
            row[0] = request;
            row[2] = request.getName1();
           row[3] = request.getAge();
           row[4] = request.getLocation();
            row[5] = request.getGender();
            row[6] = request.getLabbill();
            row[7] = request.getDoctorbill();
            row[8] = request.getClothCost();
            row[9] = request.getFoodCost();
             row[10] = request.getClaimed();

            
            model.addRow(row);
            
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
        workRequestJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtCurrentLocation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtShelterLocation = new javax.swing.JTextField();
        assignShelter = new javax.swing.JButton();
        btnGovernment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labTxt = new javax.swing.JTextField();
        doctorTxt = new javax.swing.JTextField();
        foodTxt = new javax.swing.JTextField();
        clothTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        costTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        shelterTbl = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        locationbtn = new javax.swing.JButton();

        setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Message", "Name", "Age", "Location", "Gender", "LabTestPrice", "DoctorsConsultation", "ClothingBill", "FoodBill", "Claimed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        workRequestJTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
        });
        workRequestJTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                workRequestJTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(250, 110, 1280, 96);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Current Location");
        add(jLabel6);
        jLabel6.setBounds(350, 500, 190, 30);

        txtCurrentLocation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCurrentLocation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        txtCurrentLocation.setEnabled(false);
        add(txtCurrentLocation);
        txtCurrentLocation.setBounds(560, 500, 180, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Shelter Location");
        add(jLabel5);
        jLabel5.setBounds(350, 540, 190, 30);

        txtShelterLocation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtShelterLocation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        txtShelterLocation.setEnabled(false);
        add(txtShelterLocation);
        txtShelterLocation.setBounds(560, 540, 180, 28);

        assignShelter.setBackground(new java.awt.Color(0, 0, 0));
        assignShelter.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        assignShelter.setForeground(new java.awt.Color(255, 255, 255));
        assignShelter.setText("Assign Shelter");
        assignShelter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        assignShelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignShelterActionPerformed(evt);
            }
        });
        add(assignShelter);
        assignShelter.setBounds(430, 600, 200, 33);

        btnGovernment.setBackground(new java.awt.Color(0, 0, 0));
        btnGovernment.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGovernment.setForeground(new java.awt.Color(255, 255, 255));
        btnGovernment.setText("Claim To Government");
        btnGovernment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGovernment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGovernmentActionPerformed(evt);
            }
        });
        add(btnGovernment);
        btnGovernment.setBounds(1090, 500, 270, 33);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lab Test Price");
        add(jLabel1);
        jLabel1.setBounds(350, 300, 160, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Doctor Test Price");
        add(jLabel2);
        jLabel2.setBounds(350, 340, 180, 27);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cloth Provided Bill");
        add(jLabel3);
        jLabel3.setBounds(350, 380, 180, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Food Provided Bill");
        add(jLabel4);
        jLabel4.setBounds(350, 420, 180, 27);

        labTxt.setEditable(false);
        labTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        labTxt.setEnabled(false);
        add(labTxt);
        labTxt.setBounds(560, 300, 180, 28);

        doctorTxt.setEditable(false);
        doctorTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doctorTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        doctorTxt.setEnabled(false);
        add(doctorTxt);
        doctorTxt.setBounds(560, 340, 180, 28);

        foodTxt.setEditable(false);
        foodTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        foodTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        foodTxt.setEnabled(false);
        add(foodTxt);
        foodTxt.setBounds(560, 420, 180, 28);

        clothTxt.setEditable(false);
        clothTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clothTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        clothTxt.setEnabled(false);
        add(clothTxt);
        clothTxt.setBounds(560, 380, 180, 28);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Total Cost");
        add(jLabel7);
        jLabel7.setBounds(350, 470, 130, 22);

        costTxt.setEditable(false);
        costTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        costTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        costTxt.setEnabled(false);
        add(costTxt);
        costTxt.setBounds(560, 460, 180, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Billing Work Area");
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1750, 80);

        shelterTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Name", "Shelter Location"
            }
        ));
        shelterTbl.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(shelterTbl);

        add(jScrollPane2);
        jScrollPane2.setBounds(1090, 350, 452, 100);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Homeless Person Repository");
        add(jLabel9);
        jLabel9.setBounds(1090, 290, 360, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/bills-removebg-preview.png"))); // NOI18N
        add(jLabel11);
        jLabel11.setBounds(0, 0, 1790, 900);

        locationbtn.setText("Set Location");
        locationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationbtnActionPerformed(evt);
            }
        });
        add(locationbtn);
        locationbtn.setBounds(780, 500, 120, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void workRequestJTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workRequestJTableKeyPressed

        //
        //         int i = workRequestJTable.getSelectedRow();
        //        TableModel model = workRequestJTable.getModel();
        //        String cloth = model.getValueAt(i,3).toString();
        //        if( cloth == "true")
        //
        //            jCheckBox1.setSelected(true);
        //
        //        else
        //            jCheckBox1.setSelected(false);
        //
        
        
//           int i = workRequestJTable.getSelectedRow();
//        //TableModel model = workRequestJTable.getModel(); 
//        txtCurrentLocation.setText(workRequestJTable.getValueAt(i,3).toString());
//        
    }//GEN-LAST:event_workRequestJTableKeyPressed
int i=0;
    private void assignShelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignShelterActionPerformed
       
        
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
             JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
 btnGovernment.setVisible(true);
 assignShelter.setEnabled(false);
        BillingWorkQueue request = (BillingWorkQueue) workRequestJTable.getValueAt(selectedRow, 0);

        if(txtCurrentLocation.getText().equals("Quincy")){
            request.setShelterLocation("Cambridge");
            txtShelterLocation.setText(request.getShelterLocation());
        }

        else if(txtCurrentLocation.getText().equals("Boylston Street")){
            request.setShelterLocation("Boston");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Waltham")){
            request.setShelterLocation("Wrentham");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Saugus")){
            request.setShelterLocation("Wrentham");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Brookline")){
            request.setShelterLocation("New York");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Fenway")){
            request.setShelterLocation("Park Drive");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("Park Drive")){
            request.setShelterLocation("Park Drive");
            txtShelterLocation.setText(request.getShelterLocation());
        }
         else if(txtCurrentLocation.getText().equals("High Street")){
            request.setShelterLocation("Cambridge");
            txtShelterLocation.setText(request.getShelterLocation());
        }
        
  int id = Integer.parseInt(workRequestJTable.getValueAt(selectedRow, 0).toString());
        String name = workRequestJTable.getValueAt(selectedRow, 2).toString();
         Shelter shelter = shelterDirectory.createShelter();
         shelter.setId(id);
        shelter.setName(name);
        shelter.setShelterLocation(txtShelterLocation.getText());
       
        JOptionPane.showMessageDialog(null, "Shelter has been assigned");
        populateTable11();
       i = selectedRow;

        // TODO add your handling code here:
    }//GEN-LAST:event_assignShelterActionPerformed

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
        // TODO add your handling code here:
        
           int i = workRequestJTable.getSelectedRow();
        //TableModel model = workRequestJTable.getModel(); 
        txtCurrentLocation.setText(workRequestJTable.getValueAt(i,4).toString());
        labTxt.setText(workRequestJTable.getValueAt(i,6).toString());
        doctorTxt.setText(workRequestJTable.getValueAt(i,7).toString());
        clothTxt.setText(workRequestJTable.getValueAt(i,8).toString());
        foodTxt.setText(workRequestJTable.getValueAt(i,9).toString());
       int lab = Integer.parseInt(labTxt.getText());
       int doctor = Integer.parseInt(doctorTxt.getText());
       int cloth = Integer.parseInt(clothTxt.getText()); 
       int food = Integer.parseInt(foodTxt.getText());
       int total =0;
       total = total + lab + doctor + cloth + food;
        costTxt.setText(String.valueOf(total));
        
        
        
    }//GEN-LAST:event_workRequestJTableMouseClicked
    public void getPdf() throws FileNotFoundException, DocumentException{
          int selectedRow = workRequestJTable.getSelectedRow();
          BillingWorkQueue request = (BillingWorkQueue) workRequestJTable.getValueAt(selectedRow, 0);
    com.itextpdf.text.Document document=new com.itextpdf.text.Document();
    PdfWriter.getInstance(document, new FileOutputStream("D:/PDF5.pdf"));
    document.open();
     try {
             Image image=Image.getInstance("NGO2.png");
             image.scaleAbsolute(500,100);
             
             document.add(image);
             
         } catch (BadElementException ex) {
             Logger.getLogger(BillingWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(BillingWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    document.add( Chunk.NEWLINE );
    
    Font f1=new Font(Font.FontFamily.HELVETICA,15,Font.BOLD);
    document.add(new Paragraph("                            Invoice for "+request.getName1()+" has been generated\n\n\n\n",f1));
    
    
        document.add(new Paragraph("Please find attached the billing statement for "+request.getName1()+ ". This person has gone through different stages of treatment while being prepared for the allocation. The final settlement amount for "+request.getName1()+" is $"+costTxt.getText()+" .Request you to claim the bill so that we can start with the shelter assigning process.\n"));
    System.out.println("");
    document.add( Chunk.NEWLINE );
    PdfPTable table=new PdfPTable(2);
    PdfPCell c1=new PdfPCell(new Paragraph("Item"));
    PdfPCell c2=new PdfPCell(new Paragraph("Price"));
    PdfPCell c3=new PdfPCell(new Paragraph("Lab Test Price"));
    PdfPCell c4=new PdfPCell(new Paragraph("$ "+labTxt.getText()));
    PdfPCell c5=new PdfPCell(new Paragraph("Doctor Consulting Fee"));
     PdfPCell c6=new PdfPCell(new Paragraph("$ "+doctorTxt.getText()));
    
    table.addCell(c1);
    table.addCell(c2);
     table.addCell(c3);
    table.addCell(c4);
    table.addCell(c5);
    table.addCell(c6);
    c1=new PdfPCell(new Paragraph("Food Bill"));
    c2=new PdfPCell(new Paragraph("$ "+request.getFoodCost()));
    c3=new PdfPCell(new Paragraph("Clothing Cost"));
    c4=new PdfPCell(new Paragraph("$ "+request.getClothCost()));
    c5=new PdfPCell(new Paragraph("Total Cost"));
    c6=new PdfPCell(new Paragraph("$ "+costTxt.getText()));
    
    table.addCell(c1);
    table.addCell(c2);
    table.addCell(c3);
    table.addCell(c4);
    table.addCell(c5);
    table.addCell(c6);
    document.add(table);
    
         try {
             Image image=Image.getInstance("signaturePDF.png");
             image.scaleAbsolute(150,30);
             document.add(new Paragraph(" \n \n  Signed By Billing Organization"));
             document.add(image);
         } catch (BadElementException ex) {
             Logger.getLogger(BillingWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(BillingWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
         }

        

    document.close();
    
    }
    private void btnGovernmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGovernmentActionPerformed

          int selectedRow1 = workRequestJTable.getSelectedRow();
          if (i!=selectedRow1){
             JOptionPane.showMessageDialog(null, "Please Select the Same Row");
            return;
           
        }
        
        btnGovernment.setVisible(false);
 assignShelter.setEnabled(true);
         try {
             getPdf();
         } catch (FileNotFoundException ex) {
             Logger.getLogger(BillingWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (DocumentException ex) {
             Logger.getLogger(BillingWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
       
        
          BillingWorkQueue request = (BillingWorkQueue) workRequestJTable.getValueAt(selectedRow, 0);

        request.setClaimed("Yes");
        
           try {
            Email.sendMail("maheshpoojary132@gmail.com","Final Bill for  "+request.getName1()
                    +"has been generated"," Please settle the final amount for the follwing  "
                    +"\n"+"lab bill : "+labTxt.getText()
                    +"\n"+"doctor bill : "+doctorTxt.getText()
                    +"\n"+"cloth bill : "+clothTxt.getText()
                    +"\n"+"food bill : "+foodTxt.getText()
                    +"\n"+"Total Cost : "+costTxt.getText());
            
        } catch (Exception ex) {
            Logger.getLogger(BillingWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }    
           
populateTable();
 JOptionPane.showMessageDialog(null, "Claimed To Government and pdf Has Been Generated");
 
 
 
 
Logger logger = Logger.getLogger("MyLog");  
      FileHandler fh;  

    try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("D:/MyLogFile.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
        logger.info("Claimed To Government and pdf Has Been Generated for "+request.getName1());  

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    } 

// TODO add your handling code here:
    }//GEN-LAST:event_btnGovernmentActionPerformed

    private void locationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationbtnActionPerformed
        // TODO add your handling code here:
        
        Maps maps = new Maps(userProcessContainer,userAccount, billingOrganization, enterprise, business, "");
        userProcessContainer.add("Maps",maps);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_locationbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignShelter;
    private javax.swing.JButton btnGovernment;
    private javax.swing.JTextField clothTxt;
    private javax.swing.JTextField costTxt;
    private javax.swing.JTextField doctorTxt;
    private javax.swing.JTextField foodTxt;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField labTxt;
    private javax.swing.JButton locationbtn;
    private javax.swing.JTable shelterTbl;
    private javax.swing.JTextField txtCurrentLocation;
    private javax.swing.JTextField txtShelterLocation;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}