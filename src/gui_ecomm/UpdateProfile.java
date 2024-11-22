package gui_ecomm;

import static gui_ecomm.UserLogin.un;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mypack.Db;

public class UpdateProfile extends javax.swing.JFrame {

    Connection con = Db.connect();
    
    public UpdateProfile() {
        initComponents();
        
        ImageIcon img=new ImageIcon(getClass().getResource("/Images/user_settings.png"));
        setIconImage(img.getImage());
        
        uname.setText("" + UserLogin.userName);
        pwd.setText("" + UserLogin.passwd);
        address.setText("" + UserLogin.addrs);
        city.setText("" + UserLogin.cTy);
        gmail.setText("" + UserLogin.gMail);
        mobile.setText("" + UserLogin.mob);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        gmail = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        err = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("User Name");

        uname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uname.setToolTipText("");
        uname.setPreferredSize(new java.awt.Dimension(69, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Password");

        pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwd.setPreferredSize(new java.awt.Dimension(126, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Address");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.setRows(5);
        address.setToolTipText("eg. #321, xyz,.............");
        jScrollPane2.setViewportView(address);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("City");

        city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        city.setPreferredSize(new java.awt.Dimension(69, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Gmail");

        gmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gmail.setToolTipText("eg. example@gmail.com");
        gmail.setPreferredSize(new java.awt.Dimension(69, 30));

        mobile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mobile.setToolTipText("eg. 1234567890");
        mobile.setPreferredSize(new java.awt.Dimension(69, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Mobile number");

        updateButton.setBackground(new java.awt.Color(0, 255, 0));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateButton.setText("Update");
        updateButton.setPreferredSize(new java.awt.Dimension(63, 32));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 51, 51));
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setPreferredSize(new java.awt.Dimension(63, 32));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        err.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        err.setForeground(new java.awt.Color(255, 0, 0));
        err.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(err, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(uname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(err, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("PROFILE UPDATE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String un=uname.getText();
        String pw=String.valueOf(pwd.getPassword());
        String addr=address.getText();
        String cty=city.getText();
        String gMail=gmail.getText();
        String num=mobile.getText();
        
        if(un.length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter UserName", "Warning", JOptionPane.WARNING_MESSAGE);
            uname.requestFocus();
        }
        else if(pw.length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter Password", "Warning", JOptionPane.WARNING_MESSAGE);
            pwd.requestFocus();
        }
        else if(addr.length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter your corrent address", "Warning", JOptionPane.WARNING_MESSAGE);
            address.requestFocus();
        }
        else if(cty.length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter your city name", "Warning", JOptionPane.WARNING_MESSAGE);
            city.requestFocus();
        }
        else if(gMail.length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter GMAIL", "Warning", JOptionPane.WARNING_MESSAGE);
            gmail.requestFocus();
        }
        else if(num.length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter mobile number", "Warning", JOptionPane.WARNING_MESSAGE);
            mobile.requestFocus();
        }
        try
        {
            String userId = UserLogin.uId;
            
            PreparedStatement ps1=con.prepareStatement("select gmail,mobile from ecomm_user where gmail=? or mobile=?");
            ps1.setString(1, gMail);
            ps1.setString(2, num);
            ResultSet rs1=ps1.executeQuery();
            
            int row = 0;
            rs1.next();
            row = rs1.getRow();
            
            if(row == 0)
            {
                PreparedStatement ps = con.prepareStatement("update ecomm_user set u_name=?, password=md5(?), address=?, city=?, gmail=?, mobile=?, regon=now() where u_id=?");
                ps.setString(1, un);
                ps.setString(2, pw);
                ps.setString(3, addr);
                ps.setString(4, cty);
                ps.setString(5, gMail);
                ps.setString(6, num);
                ps.setString(7, userId);

                int i = ps.executeUpdate();
                if(i == 1)
                {
                    err.setText("Account Updated Successfully. Password is " + pw);
                    clr();
                    check();
                }
                else
                {
                    err.setText("Account not Updated. please try again....");
                }
            }
            else
            {
                if(rs1.getString("gmail").equals(gMail))
                {
                    err.setText("Email Exist!!!");
                }
                if(rs1.getString("mobile").equals(num))
                {
                    err.setText("Mobile number Exist!!!");
                }
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clr();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void clr()
    {
        uname.setText("");
        pwd.setText("");
        address.setText("");
        city.setText("");
        gmail.setText("");
        mobile.setText("");
        uname.requestFocus();
    }
    
    private void check()
    {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() 
            {
                for(int i=1;i<=100;i++)
                {
                    try 
                    {
                        Thread.sleep(10);
                    }
                    catch (InterruptedException ex) 
                    {
                        System.out.println(ex);
                    }

                    if(i==100)
                    {
                        dispose();
                    }
                }
            }
        });
        t.start();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField city;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel err;
    private javax.swing.JTextField gmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mobile;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField uname;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
