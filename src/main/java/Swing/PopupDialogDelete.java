package Swing;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Database.Database;


public class PopupDialogDelete extends javax.swing.JDialog {

    private final JFrame frame;
    private final String city;
    private ImageIcon icon;
    
    public PopupDialogDelete(JFrame frame, String city) {
        super(frame, true);
        initComponents();
        this.frame = frame;
        this.city = city;
        setLocationRelativeTo(null);
        init();
    }
    
    private void init(){
       cancelButton.setColor1(Color.decode("#4d4d4d"));
       cancelButton.setColor2(Color.decode("#333333"));
       icon = iconRender("/Icons/warning.png", 40, 40);
       warningLabel.setIcon(icon);
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

        popupBackground2 = new Components.PopupBackground();
        jLabel3 = new javax.swing.JLabel();
        cancelButton = new Components.DialogButton();
        deleteButton = new Components.DialogButton();
        jPanel1 = new javax.swing.JPanel();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(10, 10, 10));
        setUndecorated(true);

        jLabel3.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(220, 220, 220));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>This action will permanently delete all data from the selected city. Do you want to proceed?</html> ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cancelButton.setForeground(new java.awt.Color(220, 220, 220));
        cancelButton.setText("CANCEL");
        cancelButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        deleteButton.setForeground(new java.awt.Color(220, 220, 220));
        deleteButton.setText("DELETE");
        deleteButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(20, 20, 20));

        warningLabel.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(239, 64, 76));
        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLabel.setText("WARNING");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout popupBackground2Layout = new javax.swing.GroupLayout(popupBackground2);
        popupBackground2.setLayout(popupBackground2Layout);
        popupBackground2Layout.setHorizontalGroup(
            popupBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupBackground2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(popupBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popupBackground2Layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        popupBackground2Layout.setVerticalGroup(
            popupBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popupBackground2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popupBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(popupBackground2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(popupBackground2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        Database connectDB = Database.getConnectionInstance();
        connectDB.DeleteDataByCity(city);
        dispose();
        System.out.println("Τα δεδομένα της πόλης " + city+ " διαγράφτηκαν από την βάση");
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.DialogButton cancelButton;
    private Components.DialogButton deleteButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private Components.PopupBackground popupBackground2;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
