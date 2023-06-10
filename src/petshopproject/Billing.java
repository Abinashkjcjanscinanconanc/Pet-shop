package petshopproject;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Billing extends javax.swing.JFrame {

   
    public Billing() {
        initComponents();
        DisplayAnimals();
        GetCustomers();
        GetUser();
    }
    Connection Con=null;
     PreparedStatement Pst=null;
     ResultSet Rs=null,Rs2=null;
     Statement St=null,St2=null;
       private void DisplayAnimals()
    {
         try {
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
             St2=(Statement)Con.createStatement();
             Rs2=St2.executeQuery("select * from  PetTbl");
             ProductTable.setModel(DbUtils.resultSetToTableModel(Rs2));
         } catch (SQLException ex) {
            
         }
          
        
    }
        private void GetCustomers()
      {
           try{
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
             Statement St=(Statement)Con.createStatement();
             Rs=St.executeQuery("select * from  PetTbl");
             while(Rs.next())
             {
                 int CatId=Rs.getInt("CatId");
                 CustomerCb.addItem(CatId);
             }
           }catch(Exception e)
           {
               
           }
      }
         private void GetUser()
      {
           try{
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
             Statement St=(Statement)Con.createStatement();
             Rs=St.executeQuery("select * from  PetTbl");
             while(Rs.next())
             {
                 int CatId=Rs.getInt("CatId");
                 UserCb.addItem(CatId);
             }
           }catch(Exception e)
           {
               
           }
      }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CustomerCb = new javax.swing.JTextField();
        QuantityTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        UserCb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        GrdTotalLbl = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        AddtoBillBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        BDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PnameTb = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel2.add(CustomerCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 120, -1));
        jPanel2.add(QuantityTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 120, -1));
        jPanel2.add(PriceTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 120, -1));
        jPanel2.add(UserCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Quantity");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Price");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("User Id");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        GrdTotalLbl.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        GrdTotalLbl.setText("Grand Totall");
        jPanel2.add(GrdTotalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 190, -1));

        PrintBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PrintBtn.setText("Print");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });
        jPanel2.add(PrintBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, -1, -1));

        AddtoBillBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddtoBillBtn.setText("Add To Bill");
        AddtoBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoBillBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddtoBillBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        ResetBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResetBtn.setText("RESET");
        jPanel2.add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Category", "Quantity", "Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(BillTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 330, 270));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Product");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));
        jPanel2.add(BDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel13.setText("BILLING");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Cusomer");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        PnameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnameTbActionPerformed(evt);
            }
        });
        jPanel2.add(PnameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 120, 20));

        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, -1, -1));

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Category", "Quantity", "Price"
            }
        ));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 310, 270));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel15.setText("Product List");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 150, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel16.setText("Customers Bill");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 190, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 840, 710));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshopproject/download (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("USERS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CUSTOMERS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("LOGOUT");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PETS");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("BILLING");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PnameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnameTbActionPerformed
     
   
    
    int key=0;
    int stock=0;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model=(DefaultTableModel)ProductTable.getModel();
                 int Myindex=ProductTable.getSelectedRow();
                 key=Integer.valueOf(model.getValueAt(Myindex,0).toString());
                 PnameTb.setText(model.getValueAt(Myindex,1).toString());
                 stock=Integer.valueOf(model.getValueAt(Myindex,3).toString());
                 
                 PriceTb.setText(model.getValueAt(Myindex,4).toString());
    }//GEN-LAST:event_ProductTableMouseClicked
    int n=1;
    int row=1;
    int col=1;
    int Grdtot=0;
    private void AddtoBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoBillBtnActionPerformed
        if(PnameTb.getText().isEmpty() || QuantityTb.getText().isEmpty() || PriceTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else
        {
            int tot=Integer.valueOf(PriceTb.getText().toString())*Integer.valueOf(QuantityTb.getText());
        BillTable.setValueAt(n,row,0);    
        BillTable.setValueAt(PnameTb.getText(),row,1);
        BillTable.setValueAt(PriceTb.getText(),row,2);
        BillTable.setValueAt(QuantityTb.getText(),row,3);
        BillTable.setValueAt(PnameTb.getText(),row,4);
        Grdtot+=tot;
        GrdTotalLbl.setText("Rs"+Grdtot);
        n++;
        row++; 
        UpdateQuantity();
        }
       
    }//GEN-LAST:event_AddtoBillBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
               
                   try {
                       
                       BillTable.print();
                   } catch (PrinterException ex) {
                       
                   }
              
    }//GEN-LAST:event_PrintBtnActionPerformed
      
    int ItemId;
       Statement St1=null;
       ResultSet Rs1=null;
       
    private void CountIt()
    {
        try{
              St1=Con.createStatement();
              Rs1=St1.executeQuery("select Max(PId) from  BillTbl");
              Rs1.next();
              ItemId=Rs1.getInt(1)+1;
        }catch(Exception e)
          {
                    
          }
    }
    int Key=0;
    private void UpdateQuantity()
    {   
        try
        {
             int NewQty=stock-Integer.valueOf(QuantityTb.getText());
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ PetShopDb","root","root");
              PreparedStatement save=(PreparedStatement)Con.prepareStatement("update  BillTbl set PQty=?,Pprice=? ,where  PId=?");
              save.setInt(2,Key);
            
              save.setInt(1,NewQty);
              
              int row=save.executeUpdate();
              JOptionPane.showMessageDialog(this,"Pet Updated");
              Con.close();
              DisplayAnimals();
        }catch(Exception e)
        {
            
        }
    }
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        
          if(CustomerCb.getSelectedIndex()==-1 || UserCb.getSelectedIndex() == -1)
          {
              try{
                 CountIt();
                  Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
                  PreparedStatement save=Con.prepareStatement("insert into  BillTbl values(?,?,?,?,?)");
                  save.setInt(1,ItemId);
                  save.setString(2,BDate.getDate().toString());
                  save.setInt(3,Integer.valueOf(CustomerCb.getSelectedItem().toString()));
                  save.setInt(4,Integer.valueOf(UserCb.getSelectedItem().toString()));
                  
                  save.setInt(5,Grdtot);
                  int row=save.executeUpdate();
                  
                  JOptionPane.showMessageDialog(this,"Bill added");
                  Con.close();
                  DisplayAnimals();
                  
                  
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(this,e);
              }
          }
         else
          {
              JOptionPane.showMessageDialog(this,"Missing Information");
          }
        
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       
            new  Pets().setVisible(true);
             this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

          new  Customers().setVisible(true);
             this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

         new  Billing().setVisible(true);
             this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

         new  Login().setVisible(true);
             this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddtoBillBtn;
    private com.toedter.calendar.JDateChooser BDate;
    private javax.swing.JTable BillTable;
    private javax.swing.JTextField CustomerCb;
    private javax.swing.JLabel GrdTotalLbl;
    private javax.swing.JTextField PnameTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField QuantityTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField UserCb;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
