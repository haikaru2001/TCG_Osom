/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcg_osom;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author KuroNeko
 */
public class Menu extends javax.swing.JFrame {

    String account_id;
    int level, gold, gems, exp;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form Menu
     */
    
    public Menu() {
        
        initComponents();
        setLocationRelativeTo(null);
        logged();
    }
    
    private void logged(){
        account_id = tcg_osom.Database.getUserId();
        txtNick.setText(tcg_osom.Database.getNickname());
        conn = Database.config();
        String query = "select * from account where account_id = ?";
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, account_id);
            rs = pst.executeQuery();
            
            if (rs.next()) {
                level = rs.getInt("level");
                txtLv.setText(String.valueOf("level "+level));
                
                exp = rs.getInt("exp");
                ProgresExp.setValue(exp);
                
                gold = rs.getInt("gold");
                txtGold.setText(String.valueOf(gold));
                
                gems = rs.getInt("gems");
                txtGem.setText(String.valueOf(gems));
                        
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
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

        Menu = new javax.swing.JPanel();
        btnDeck = new javax.swing.JButton();
        btnGuide = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        TopPanel = new javax.swing.JPanel();
        imgProfile = new javax.swing.JLabel();
        txtGem = new javax.swing.JLabel();
        txtExp = new javax.swing.JLabel();
        txtLv = new javax.swing.JLabel();
        txtNick = new javax.swing.JLabel();
        ProgresExp = new javax.swing.JProgressBar();
        txtNick2 = new javax.swing.JLabel();
        txtGold = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Main = new javax.swing.JPanel();
        btnPlay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(51, 51, 51));
        Menu.setPreferredSize(new java.awt.Dimension(1024, 90));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDeck.setBackground(new java.awt.Color(51, 51, 51));
        btnDeck.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeck.setForeground(new java.awt.Color(255, 255, 255));
        btnDeck.setText("My Deck");
        btnDeck.setBorder(null);
        btnDeck.setBorderPainted(false);
        btnDeck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeckMouseExited(evt);
            }
        });
        btnDeck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeckActionPerformed(evt);
            }
        });
        Menu.add(btnDeck, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 150, 40));

        btnGuide.setBackground(new java.awt.Color(51, 51, 51));
        btnGuide.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGuide.setForeground(new java.awt.Color(255, 255, 255));
        btnGuide.setText("Guide");
        btnGuide.setBorder(null);
        btnGuide.setBorderPainted(false);
        btnGuide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuideMouseExited(evt);
            }
        });
        btnGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuideActionPerformed(evt);
            }
        });
        Menu.add(btnGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 150, 40));

        btnAbout.setBackground(new java.awt.Color(51, 51, 51));
        btnAbout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setText("About");
        btnAbout.setBorder(null);
        btnAbout.setBorderPainted(false);
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
        });
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        Menu.add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 150, 40));

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        Menu.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 150, 40));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1024, 140));

        TopPanel.setBackground(new java.awt.Color(51, 51, 51));
        TopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ColGrid/Grid1.png"))); // NOI18N
        TopPanel.add(imgProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        txtGem.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtGem.setForeground(new java.awt.Color(255, 255, 255));
        txtGem.setText("Gems");
        TopPanel.add(txtGem, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 90, -1));

        txtExp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtExp.setForeground(new java.awt.Color(255, 255, 255));
        txtExp.setText("0/100");
        TopPanel.add(txtExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 65, 140, -1));

        txtLv.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtLv.setForeground(new java.awt.Color(255, 255, 255));
        txtLv.setText("Level 1");
        TopPanel.add(txtLv, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, -1));

        txtNick.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtNick.setForeground(new java.awt.Color(255, 255, 255));
        txtNick.setText("Nickname");
        TopPanel.add(txtNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, -1));
        TopPanel.add(ProgresExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        txtNick2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtNick2.setForeground(new java.awt.Color(255, 255, 255));
        txtNick2.setText("img");
        TopPanel.add(txtNick2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 20, 20));

        txtGold.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtGold.setForeground(new java.awt.Color(255, 255, 255));
        txtGold.setText("Gold");
        TopPanel.add(txtGold, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 90, -1));

        getContentPane().add(TopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 90));

        Main.setLayout(null);

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonNormal.png"))); // NOI18N
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPlayMouseExited(evt);
            }
        });
        Main.add(btnPlay);
        btnPlay.setBounds(410, 780, 200, 100);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Menu.png"))); // NOI18N
        Main.add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 772);

        jLayeredPane1.add(Main);
        Main.setBounds(0, 40, 1030, 600);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseEntered
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover.png")));
    }//GEN-LAST:event_btnPlayMouseEntered

    private void btnPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseExited
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonNormal.png")));
    }//GEN-LAST:event_btnPlayMouseExited

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        this.dispose();
        GameFrame game = new GameFrame();
        game.setVisible(true);
    }//GEN-LAST:event_btnPlayMouseClicked

    private void btnDeckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeckActionPerformed
        this.dispose();
        DeckCard col = new DeckCard();
        col.setVisible(true);
        
    }//GEN-LAST:event_btnDeckActionPerformed

    private void btnDeckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeckMouseEntered
        btnDeck.setBackground(new java.awt.Color(15, 15, 15));
    }//GEN-LAST:event_btnDeckMouseEntered

    private void btnDeckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeckMouseExited
        btnDeck.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btnDeckMouseExited

    private void btnGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuideActionPerformed
        this.dispose();
        Tutorial1 guide = new Tutorial1();
        guide.setVisible(true);
    }//GEN-LAST:event_btnGuideActionPerformed

    private void btnGuideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuideMouseEntered
        btnGuide.setBackground(new java.awt.Color(15, 15, 15));
    }//GEN-LAST:event_btnGuideMouseEntered

    private void btnGuideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuideMouseExited
       btnGuide.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btnGuideMouseExited

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed

    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        AboutUs abott = new AboutUs();
        abott.setVisible(true);
    }//GEN-LAST:event_btnAboutMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Menu;
    private javax.swing.JProgressBar ProgresExp;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnDeck;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuide;
    private javax.swing.JLabel btnPlay;
    private javax.swing.JLabel imgProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel txtExp;
    private javax.swing.JLabel txtGem;
    private javax.swing.JLabel txtGold;
    private javax.swing.JLabel txtLv;
    private javax.swing.JLabel txtNick;
    private javax.swing.JLabel txtNick2;
    // End of variables declaration//GEN-END:variables

}
