/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


public class Category extends javax.swing.JFrame {

    
    public Category() {
        initComponents();
         DisplayCategory();
    }
      Connection Con=null;
     PreparedStatement Pst=null;
     ResultSet Rs=null;
     Statement St=null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CatNameTb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
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
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 70, -1));
        jPanel2.add(CatNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 120, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setText("Categories List");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 200, -1));

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveBtn.setText("SAVE");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel2.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoryTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 800, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel13.setText("Category");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, -1));

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
    int Key=0;
    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked
             
        
        
                 DefaultTableModel model=(DefaultTableModel)CategoryTable.getModel();
                 int Myindex=CategoryTable.getSelectedRow();
                 Key=Integer.valueOf(model.getValueAt(Myindex,0).toString());
                 CatNameTb.setText(model.getValueAt(Myindex,1).toString());
                 
                 
    }//GEN-LAST:event_CategoryTableMouseClicked
     private void DisplayCategory()
    {
         try {
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
             Statement St=(Statement)Con.createStatement();
             Rs=St.executeQuery("select * from  CategoryTbl ");
             CategoryTable.setModel(DbUtils.resultSetToTableModel(Rs));
         } catch (SQLException ex) {
            
         }
          
        
    }
      private void clear()
    {
        CatNameTb.setText("");
      
    }
    int ItemId;
       Statement St1=null;
       ResultSet Rs1=null;
       
    private void CountIt()
    {
        try{
              St1=Con.createStatement();
              Rs1=St1.executeQuery("select Max(CatId) from CategoryTbl");
              Rs1.next();
              ItemId=Rs1.getInt(1)+1;
        }catch(Exception e)
          {
                    
          }
    }
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
           
              if(CatNameTb.getText().isEmpty())
         {
             JOptionPane.showMessageDialog(this,"Missing Information");
         }
         else
         {
              try{
                    CountIt();
                    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
                    PreparedStatement save=Con.prepareStatement("insert into CategoryTbl values(?,?)");
                    save.setInt(1,ItemId);
                    save.setString(2,CatNameTb.getText());
                    
                    int row=save.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this,"Category added");
                    Con.close();
                     DisplayCategory();
    
                    
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(this,e);
              }
         }
        
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        
                      if(CatNameTb.getText().isEmpty())
        {
                  JOptionPane.showMessageDialog(this,"Missing INFORMATION");
        }
        else
        {
            try
            {
              Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
              PreparedStatement save=(PreparedStatement)Con.prepareStatement("update  CategoryTbl  set CatDes=?,where CatId=?");
              save.setInt(2,Key);
              save.setString(1,CatNameTb.getText());
            
              
              int row=save.executeUpdate();
              JOptionPane.showMessageDialog(this,"Category Updated");
              Con.close();
              DisplayCategory();
              clear();   
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        
        
        
    }//GEN-LAST:event_EditBtnActionPerformed
     
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
            
            
                  if(Key==0)
        {
                  JOptionPane.showMessageDialog(this,"select  a Category");
        }
        else
        {
            try
            {
              Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ PetShopDb","root","root");
              PreparedStatement save=(PreparedStatement)Con.prepareStatement("Delete  from  CategoryTbl where CatId=?");
              save.setInt(1,Key);
             
              int row=save.executeUpdate();
              JOptionPane.showMessageDialog(this,"Category Deleted");
              Con.close();
              DisplayCategory();
              clear();   
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

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

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CatNameTb;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
