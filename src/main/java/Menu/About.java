package Menu;

import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class About extends javax.swing.JPanel {
    
    private ImageIcon logo, javaIcon, gitLogo, TrelloLogo, gitLogo2;
    
    /** 
    * Class constructor.
    * 
    */
    public About() {
        initComponents();
        setOpaque(false);
        logo = iconRender("/Icons/logo.png", 800, 290);
        javaIcon = iconRender("/Icons/java.png", 20, 20);
        gitLogo = iconRender("/Icons/github.png", 15, 15);
        gitLogo2 = iconRender("/Icons/github.png", 18, 18);
        TrelloLogo = iconRender("/Icons/trello_icon.png", 15, 15);
        logoLabel.setIcon(logo);
        gitLabelSP.setIcon(gitLogo);
        gitLabelSP1.setIcon(TrelloLogo);
        javaLabel.setIcon(javaIcon);
        jLabel9.setIcon(gitLogo2);
    }
    
    private ImageIcon iconRender(String path, int w, int h){
        ImageIcon tempIcon = new ImageIcon(getClass().getResource(path));
        Image img = tempIcon.getImage();
        Image newimg = img.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        return newIcon;        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        javaLabel = new javax.swing.JLabel();
        gitLabelSP = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gitLabelSP1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        logoLabel.setFont(new java.awt.Font("AppleGothic", 0, 36)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(200, 200, 200));
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 220, 220));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dimitris Kafasis");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 220, 220));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Built With Java Swing");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(220, 220, 220));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aggelos Kaptanis");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 220, 220));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Made By");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(220, 220, 220));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Stefanos Pizanias");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(220, 220, 220));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Version");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(220, 220, 220));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("1.0.0");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaLabel.setText(" ");
        javaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                javaLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                javaLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                javaLabelMouseExited(evt);
            }
        });

        gitLabelSP.setFont(new java.awt.Font("Avenir Next", 0, 10)); // NOI18N
        gitLabelSP.setForeground(new java.awt.Color(0, 115, 230));
        gitLabelSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gitLabelSP.setText("https://github.com/Pizanias-S/Java_Meteo_EAP/tree/main");
        gitLabelSP.setIconTextGap(8);
        gitLabelSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gitLabelSPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gitLabelSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gitLabelSPMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(220, 220, 220));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Data from wttr.in API");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 19));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 19));
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 19));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setMaximumSize(new java.awt.Dimension(3, 16));
        jLabel9.setMinimumSize(new java.awt.Dimension(3, 16));
        jLabel9.setPreferredSize(new java.awt.Dimension(3, 16));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(220, 220, 220));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Project GitHub");
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setMaximumSize(new java.awt.Dimension(60, 19));
        jLabel10.setMinimumSize(new java.awt.Dimension(60, 19));
        jLabel10.setPreferredSize(new java.awt.Dimension(60, 19));

        gitLabelSP1.setFont(new java.awt.Font("Avenir Next", 0, 10)); // NOI18N
        gitLabelSP1.setForeground(new java.awt.Color(0, 115, 230));
        gitLabelSP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gitLabelSP1.setText("https://trello.com/b/yHaaGp7J/project-java-meteo");
        gitLabelSP1.setIconTextGap(8);
        gitLabelSP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gitLabelSP1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gitLabelSP1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gitLabelSP1MouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(220, 220, 220));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Project Trello");
        jLabel11.setToolTipText("");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setMaximumSize(new java.awt.Dimension(60, 19));
        jLabel11.setMinimumSize(new java.awt.Dimension(60, 19));
        jLabel11.setPreferredSize(new java.awt.Dimension(60, 19));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gitLabelSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gitLabelSP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(javaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gitLabelSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gitLabelSP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(javaLabel)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gitLabelSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitLabelSPMouseClicked
        // action for projects GitHub URL
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/Pizanias-S/Java_Meteo_EAP/tree/main"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_gitLabelSPMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // action for wttr.in GitHub URL
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/chubin/wttr.in"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // action to change the mouse type when hovering button
           setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // action to reset the mouse to default when not hovering the button
           setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel9MouseExited

    private void javaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaLabelMouseClicked
        // action to open URL of javadoc when clicked
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://javadoc.scijava.org/Java17/java.desktop/javax/swing/package-summary.html"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_javaLabelMouseClicked

    private void javaLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaLabelMouseEntered
        // action to change the mouse type when hovering button
           setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_javaLabelMouseEntered

    private void javaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_javaLabelMouseExited
        // action to reset the mouse to default when not hovering the button
           setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_javaLabelMouseExited

    private void gitLabelSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitLabelSPMouseEntered
        // action to change the mouse type when hovering button
           setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_gitLabelSPMouseEntered

    private void gitLabelSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitLabelSPMouseExited
        // action to reset the mouse to default when not hovering the button
           setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_gitLabelSPMouseExited

    private void gitLabelSP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitLabelSP1MouseClicked
        // action to open URL of tello when clicked
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://trello.com/b/yHaaGp7J/project-java-meteo"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_gitLabelSP1MouseClicked

    private void gitLabelSP1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitLabelSP1MouseEntered
        // action to change the mouse type when hovering button
           setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_gitLabelSP1MouseEntered

    private void gitLabelSP1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitLabelSP1MouseExited
        // action to reset the mouse to default when not hovering the button
           setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_gitLabelSP1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gitLabelSP;
    private javax.swing.JLabel gitLabelSP1;
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
    private javax.swing.JLabel javaLabel;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables
}
