package gui_ecomm;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class UserHome extends javax.swing.JFrame {

    public UserHome() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        profile.setBackground(new java.awt.Color(204, 204, 255));
        profile.setForeground(new java.awt.Color(204, 204, 255));
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/advertisement1.gif"))); // NOI18N
        jLabel1.setFocusable(false);

        searchBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_icon1.png"))); // NOI18N
        searchButton.setBorder(null);
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(683, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profilePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(207, Short.MAX_VALUE))
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
    private javax.swing.JMenuItem chrome;
    private javax.swing.JMenuItem deleteAccount;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JButton profile;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JTextArea profileWindow;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JMenuItem shutdown;
    private javax.swing.JMenuItem updateProfile;
    // End of variables declaration//GEN-END:variables
}
