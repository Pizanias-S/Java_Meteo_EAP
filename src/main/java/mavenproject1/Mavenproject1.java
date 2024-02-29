
package mavenproject1;
import Database.Database;
import Menu.EventMenu;
import Menu.Forecast;
import Menu.CityList;
import Menu.Form3;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Date;
import java.util.List;
import javax.swing.JComponent;

public class Mavenproject1 extends javax.swing.JFrame {

    
    public Mavenproject1() {
        Database connectDB = Database.getConnectionInstance();
        System.out.println(connectDB);
        connectDB.createTableCity();
        connectDB.createTableMeteoData();
        connectDB.insertNewCity("Athina", "Achaia", "Ptr", "1231231",
                        "52352352", "ptr", 1, Date.valueOf("2024-02-29"));
        connectDB.insertMeteoData("Patras", Date.valueOf("2024-02-29"), 30.2,
                65, "24", "Clear");
        List<String> city = connectDB.selectAllCitys();
        String main_city = city.get(0);
        initComponents();
        setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        init();
        mainPanel.setBackground(new Color(30,30,30));
        menu.addEvent(new EventMenu() {
            @Override
            public void menuSelected(int index) {
                if (index == 0) {
                    setForm(new Forecast(main_city));
                } else if (index == 1) {
                    setForm(new CityList());
                } else if (index == 2){
                    setForm(new Form3());
                } else if (index == 3){
                    System.exit(0);
                }
            }
          }); 
    }
    
    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com, BorderLayout.CENTER);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void init(){
        header.initMoving(this);
        header.initEvent(this, panelBackground1);
    }
            
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new Swing.PanelBackground();
        mainPanel = new javax.swing.JPanel();
        menu = new Menu.Menu();
        header = new Components.Header();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setUndecorated(true);

        panelBackground1.setToolTipText("");
        panelBackground1.setDoubleBuffered(false);

        mainPanel.setForeground(new java.awt.Color(100, 100, 100));
        mainPanel.setToolTipText("");
        mainPanel.setLayout(new java.awt.BorderLayout());

        menu.setBackground(new java.awt.Color(10, 10, 10));
        menu.setForeground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.getAccessibleContext().setAccessibleParent(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Mavenproject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mavenproject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mavenproject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mavenproject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mavenproject1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.Header header;
    private javax.swing.JPanel mainPanel;
    private Menu.Menu menu;
    private Swing.PanelBackground panelBackground1;
    // End of variables declaration//GEN-END:variables
}
