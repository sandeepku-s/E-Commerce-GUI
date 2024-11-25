package gui_ecomm;

import java.awt.Color;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import mypack.Db;
import net.proteanit.sql.DbUtils;

public class UserHome extends javax.swing.JFrame {

    public UserHome() {
        initComponents();
        
        ImageIcon img=new ImageIcon(getClass().getResource("/Images/Mart.png"));
        setIconImage(img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        profile = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        profileWindow = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        cartButton = new javax.swing.JLabel();
        orderButton = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        account = new javax.swing.JMenu();
        account1 = new javax.swing.JMenu();
        updateProfile = new javax.swing.JMenuItem();
        deleteAccount = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        apps = new javax.swing.JMenu();
        calculator = new javax.swing.JMenuItem();
        chrome = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        shutdown = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to User");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        profile.setBackground(new java.awt.Color(204, 204, 204));
        profile.setForeground(new java.awt.Color(204, 204, 204));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png"))); // NOI18N
        profile.setToolTipText("PROFILE");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
        });
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });

        profilePanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        profileWindow.setEditable(false);
        profileWindow.setBackground(new java.awt.Color(255, 204, 204));
        profileWindow.setColumns(20);
        profileWindow.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        profileWindow.setLineWrap(true);
        profileWindow.setRows(3);
        profileWindow.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        profileWindow.setFocusable(false);
        profileWindow.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(profileWindow);

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/advertisement1.gif"))); // NOI18N
        jLabel1.setFocusable(false);

        searchBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchBar.setName(""); // NOI18N

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_icon1.png"))); // NOI18N
        searchButton.setBorder(null);
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchButtonKeyPressed(evt);
            }
        });

        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart.png"))); // NOI18N
        cartButton.setToolTipText("YOUR CART");
        cartButton.setBorder(new javax.swing.border.MatteBorder(null));
        cartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartButtonMouseClicked(evt);
            }
        });

        orderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order_list.jpg"))); // NOI18N
        orderButton.setToolTipText("YOUR ORDERS");
        orderButton.setBorder(new javax.swing.border.MatteBorder(null));
        orderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderButtonMouseClicked(evt);
            }
        });

        jScrollPane2.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Bell MT", 2, 48)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\"Welcome to our E-commerce platform! Explore a wide range of products tailored to meet your needs. Use the search bar above to find your desired items, manage your cart with ease, and check out quickly. Our intuitive design ensures a seamless shopping experience. Start shopping today and enjoy the convenience of online retail!\"");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jTextArea1.setFocusable(false);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addComponent(profilePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cartButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(profile)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(cartButton)
                        .addGap(57, 57, 57)
                        .addComponent(orderButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jMenuBar1.setForeground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(74, 40));
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseEntered(evt);
            }
        });

        account.setText("Account   |   ");
        account.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        account1.setText("Settings");
        account1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        updateProfile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        updateProfile.setText("Update profile");
        updateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfileActionPerformed(evt);
            }
        });
        account1.add(updateProfile);

        deleteAccount.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        deleteAccount.setText("Delete account");
        deleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountActionPerformed(evt);
            }
        });
        account1.add(deleteAccount);

        account.add(account1);
        account.add(jSeparator1);

        exit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        exit.setText("logout");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        account.add(exit);

        jMenuBar1.add(account);

        apps.setText("Apps   |   ");
        apps.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        apps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appsActionPerformed(evt);
            }
        });

        calculator.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        calculator.setText("Calculator");
        calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorActionPerformed(evt);
            }
        });
        apps.add(calculator);

        chrome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        chrome.setText("Chrome");
        chrome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chromeActionPerformed(evt);
            }
        });
        apps.add(chrome);
        apps.add(jSeparator3);

        shutdown.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        shutdown.setText("ShutDown");
        shutdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutdownActionPerformed(evt);
            }
        });
        apps.add(shutdown);

        jMenuBar1.add(apps);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfileActionPerformed
        new UpdateProfile().setVisible(true);
    }//GEN-LAST:event_updateProfileActionPerformed

    private void deleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountActionPerformed
        new DeleteAccount().setVisible(true);
    }//GEN-LAST:event_deleteAccountActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
        new Welcome().setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void calculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorActionPerformed

        Runtime r=Runtime.getRuntime();
        try
        {
            r.exec("calc");
        }
        catch (IOException ex)
        {
            Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_calculatorActionPerformed

    private void chromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chromeActionPerformed
        try
        {
            Runtime r=Runtime.getRuntime();
            r.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_chromeActionPerformed

    private void shutdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutdownActionPerformed
        try
        {
            Runtime r=Runtime.getRuntime();
            r.exec("shutdown -r -t 0");
            System.exit(0);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_shutdownActionPerformed

    private void appsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appsActionPerformed

    }//GEN-LAST:event_appsActionPerformed

    private void jMenuBar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseEntered

    }//GEN-LAST:event_jMenuBar1MouseEntered

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        
    }//GEN-LAST:event_profileActionPerformed

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        profileWindow.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        profileWindow.setText(" " + UserLogin.userName + "\n " + UserLogin.mob + "\n " + UserLogin.gMail + "\n\n " + UserLogin.addrs + "\n\n " + UserLogin.cTy + "\n " + UserLogin.dateOfRegister);
    }//GEN-LAST:event_profileMouseClicked

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        profileWindow.setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));
        profileWindow.setText("");
    }//GEN-LAST:event_profileMouseEntered

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        searchProducts();
    }//GEN-LAST:event_searchButtonMouseClicked

    private void searchButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchButtonKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            searchProducts();
        }
    }//GEN-LAST:event_searchButtonKeyPressed

    private void cartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseClicked
        new Cart().setVisible(true);
    }//GEN-LAST:event_cartButtonMouseClicked

    private void orderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderButtonMouseClicked
        new Orders().setVisible(true);
    }//GEN-LAST:event_orderButtonMouseClicked

    static String pName;
    private void searchProducts()
    {
        pName = searchBar.getText();
        
        if(pName.length() != 0)
        {
            new ViewProducts().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Enter the Product name", "Information", JOptionPane.INFORMATION_MESSAGE);
            searchBar.requestFocus();
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            String nprofile = null;
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, nprofile);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu account;
    private javax.swing.JMenu account1;
    private javax.swing.JMenu apps;
    private javax.swing.JMenuItem calculator;
    private javax.swing.JLabel cartButton;
    private javax.swing.JMenuItem chrome;
    private javax.swing.JMenuItem deleteAccount;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel orderButton;
    private javax.swing.JButton profile;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JTextArea profileWindow;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JMenuItem shutdown;
    private javax.swing.JMenuItem updateProfile;
    // End of variables declaration//GEN-END:variables
}
