
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


public class Users extends javax.swing.JFrame {

    
    public Users() {
        initComponents();
        DisplayUser();
    }
       Connection Con=null;
     PreparedStatement Pst=null;
     ResultSet Rs=null;
     Statement St=null;
     private void DisplayUser()
    {
         try {
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
             Statement St=(Statement)Con.createStatement();
             Rs=St.executeQuery("select * from  UserTbl ");
             UsersTable.setModel(DbUtils.resultSetToTableModel(Rs));
         } catch (SQLException ex) {
            
         }
          
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PasswordTb = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
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
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));
        jPanel2.add(PasswordTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 120, -1));
        jPanel2.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setText("Users List");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 150, -1));

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveBtn.setText("SAVE");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel2.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Password"
            }
        ));
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 800, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel13.setText("Users");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 840, 710));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshopproject/download (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("USERS");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
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
    int Key=0;
    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
      
           DefaultTableModel model=(DefaultTableModel)UsersTable.getModel();
                 int Myindex= UsersTable.getSelectedRow();
                 Key=Integer.valueOf(model.getValueAt(Myindex,0).toString());
                 UserName.setText(model.getValueAt(Myindex,1).toString());
                 PasswordTb.setText(model.getValueAt(Myindex,2).toString());
                // PhoneTb.setText(model.getValueAt(Myindex,3).toString());
        
        
    }//GEN-LAST:event_UsersTableMouseClicked
       int ItemId;
       Statement St1=null;
       ResultSet Rs1=null;
       
    private void CountIt()
    {
        try{
              St1=Con.createStatement();
              Rs1=St1.executeQuery("select Max(UId) from UserTbl");
              Rs1.next();
              ItemId=Rs1.getInt(1)+1;
        }catch(Exception e)
          {
                    
          }
    }
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
         
              if(UserName.getText().isEmpty() || PasswordTb.getText().isEmpty())
         {
             JOptionPane.showMessageDialog(this,"Missing Information");
         }
         else
         {
              try{
                    CountIt();
                    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
                    PreparedStatement save=Con.prepareStatement("insert into UserTbl values(?,?,?)");
                    save.setInt(1,ItemId);
                    save.setString(2,UserName.getText());
                    save.setString(3,PasswordTb.getText());
                    
                    int row=save.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this,"User added");
                    Con.close();
                     DisplayUser();
    
                    
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(this,e);
              }
         }
          
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
                   
                    if(UserName.getText().isEmpty() || PasswordTb.getText().isEmpty())
        {
                  JOptionPane.showMessageDialog(this,"Missing INFORMATION");
        }
        else
        {
            try
            {
              Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
              PreparedStatement save=(PreparedStatement)Con.prepareStatement("update  UsersTbl set UName=?, UPass=?,where UId=?");
              save.setInt(3,Key);
              save.setString(1,UserName.getText());
              save.setString(2,PasswordTb.getText());
            
              int row=save.executeUpdate();
              JOptionPane.showMessageDialog(this,"User Updated");
              Con.close();
              DisplayUser();
              clear();   
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        
        
        
    }//GEN-LAST:event_EditBtnActionPerformed
     private void clear()
    {
        UserName.setText("");
        PasswordTb.setText("");
        Key=0;        
    }
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
                      if(Key==0)
        {
                  JOptionPane.showMessageDialog(this,"select  a User");
        }
        else
        {
            try
            {
              Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetShopDb","root","root");
              PreparedStatement save=(PreparedStatement)Con.prepareStatement("Delete  from  UsersTbl where UId=?");
              save.setInt(1,Key);
             
              int row=save.executeUpdate();
              JOptionPane.showMessageDialog(this,"User Deleted");
              Con.close();
              DisplayUser();
             clear();   
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked


         new Login().setVisible(true);
             this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

       new  Billing().setVisible(true);
             this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked


          new  Customers().setVisible(true);
             this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

         new  Users().setVisible(true);
             this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
 
           new  Pets().setVisible(true);
             this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField PasswordTb;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField UserName;
    private javax.swing.JTable UsersTable;
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
