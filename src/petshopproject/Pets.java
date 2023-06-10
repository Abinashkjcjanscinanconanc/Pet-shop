
package petshopproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Pets extends javax.swing.JFrame {

       public Pets() {
        initComponents();
        GetCategories(); 
        DisplayAnimals();
         
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
             PetsTable.setModel(DbUtils.resultSetToTableModel(Rs2));
         } catch (SQLException ex) {
            
         }
          
        
    }
       
      private void GetCategories()
      {
           try{
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
             Statement St=(Statement)Con.createStatement();
             Rs=St.executeQuery("select * from  PetTbl");
             while(Rs.next())
             {
                 int CatId=Rs.getInt("CatId");
                 CatCb.addItem(CatId);
             }
           }catch(Exception e)
           {
               
           }
      }
     
    int ItemId;
       Statement St1=null;
       ResultSet Rs1=null;
       
    private void CountIt()
    {
        try{
              St1=Con.createStatement();
              Rs1=St1.executeQuery("select Max(PId) from PetTbl");
              Rs1.next();
              ItemId=Rs1.getInt(1)+1;
        }catch(Exception e)
          {
                    
          }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CatCb = new javax.swing.JTextField();
        QuantityTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        PetNameTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PetsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Category");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        CatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbActionPerformed(evt);
            }
        });
        jPanel2.add(CatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, -1));
        jPanel2.add(QuantityTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 120, -1));
        jPanel2.add(PriceTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 120, -1));
        jPanel2.add(PetNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Quantity");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Price");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setText("Product List");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 150, -1));

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveBtn.setText("SAVE");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel2.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        PetsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Quantity", "Price"
            }
        ));
        PetsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PetsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PetsTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 800, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 840, 710));

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
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PETS");
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

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
            
          if(PetNameTb.getText().isEmpty() && QuantityTb.getText().isEmpty()|| CatCb.getSelectedIndex()== -1 || PriceTb.getText().isEmpty())
          {
              try{
                  CountIt();
                  Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
                  PreparedStatement save=Con.prepareStatement("insert into  PetTbl values(?,?,?,?)");
                  save.setInt(1,ItemId);
                  save.setString(2,PetNameTb.getText());
                  save.setInt(3,Integer.valueOf(CatCb.getSelectedItem().toString()));
                  save.setInt(4,Integer.valueOf(QuantityTb.getText().toString()));
                  save.setInt(5,Integer.valueOf(PriceTb.getText()));
                  int row=save.executeUpdate();
                  
                  JOptionPane.showMessageDialog(this,"Customer added");
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

    private void CatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbActionPerformed
     int Key=0;
    private void PetsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PetsTableMouseClicked

          DefaultTableModel model=(DefaultTableModel)PetsTable.getModel();
                 int Myindex=PetsTable.getSelectedRow();
                 Key=Integer.valueOf(model.getValueAt(Myindex,0).toString());
                 PetNameTb.setText(model.getValueAt(Myindex,1).toString());
                 CatCb.setText(model.getValueAt(Myindex,2).toString());
                 QuantityTb.setText(model.getValueAt(Myindex,3).toString());
                 PriceTb.setText(model.getValueAt(Myindex,4).toString());
    }//GEN-LAST:event_PetsTableMouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed

               
                  if(PetNameTb.getText().isEmpty() || QuantityTb.getText().isEmpty()|| PriceTb.getText().isEmpty() || CatCb.getSelectedIndex()==-1)
        {
                  JOptionPane.showMessageDialog(this,"Missing INFORMATION");
        }
        else
        {
            try
            {
              Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ PetShopDb","root","root");
              PreparedStatement save=(PreparedStatement)Con.prepareStatement("update  PetTbl set PName=?,PCat=?,PQty=?,Pprice=? ,where  PId=?");
              save.setInt(4,Key);
              save.setString(1,PetNameTb.getText());
              save.setString(2,CatCb.getSelectedItem().toString());
              save.setString(3,QuantityTb.getText());
              save.setString(4,PriceTb.getText());
              int row=save.executeUpdate();
              JOptionPane.showMessageDialog(this,"Pet Updated");
              Con.close();
              DisplayAnimals();
            clear();   
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        
        
    }//GEN-LAST:event_EditBtnActionPerformed
    private void clear()
    {
        PetNameTb.setText("");
        QuantityTb.setText("");
        PriceTb.setText("");
        CatCb.setSelectedIndex("");

                 
    }
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
      
             
                  if(Key==0)
        {
                  JOptionPane.showMessageDialog(this,"select  a Pet");
        }
        else
        {
            try
            {
              Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ PetShopDb","root","root");
              PreparedStatement save=(PreparedStatement)Con.prepareStatement("Delete  from  PetTbl where CustId=?");
              save.setInt(1,Key);
             
              int row=save.executeUpdate();
              JOptionPane.showMessageDialog(this,"Pet Deleted");
              Con.close();
              DisplayAnimals();
             clear();   
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
                new  Customers().setVisible(true);
             this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new  Billing().setVisible(true);
             this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CatCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField PetNameTb;
    private javax.swing.JTable PetsTable;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField QuantityTb;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
