package Menu;

import Components.ScrollBarCustom;
import Database.Database;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import Swing.PopupDialogDelete;
import Swing.PopupDialogEdit;
import Swing.PopupDialogInfo;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;


public class CityList extends javax.swing.JPanel {
    
    private JFrame parentFrame;

    
    public CityList() {
        initComponents();
        parentFrame = (JFrame) this.getParent();
        setOpaque(false);
        
        // Fix table1
        tableDark1.setBackground(new Color(30,30,30));
        tableDark1.setFillsViewportHeight(true);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        Border border = new LineBorder(new Color(50,50,50), 3, true);
        jScrollPane1.setBorder(border);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 30, 30));
        jScrollPane1.setCorner(JScrollPane.UPPER_RIGHT_CORNER,panel);
        tableDark1.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        materialTabbedPane1.setTitleAt(0, "Meteo Data"); // change tab title
        
        // Fix table2
        tableDark2.setBackground(new Color(30,30,30));
        tableDark2.setFillsViewportHeight(true);
        jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        Border border1 = new LineBorder(new Color(50,50,50), 3, true);
        jScrollPane2.setBorder(border1);
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(30, 30, 30));
        jScrollPane2.setCorner(JScrollPane.UPPER_RIGHT_CORNER,panel1);
        tableDark2.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        materialTabbedPane1.setTitleAt(1, "City Searched Data"); // change tab title
        
        // Fix table3
        tableDark3.setBackground(new Color(30,30,30));
        tableDark3.setFillsViewportHeight(true);
        jScrollPane3.setVerticalScrollBar(new ScrollBarCustom());
        Border border2 = new LineBorder(new Color(50,50,50), 3, true);
        jScrollPane3.setBorder(border2);
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(30, 30, 30));
        jScrollPane3.setCorner(JScrollPane.UPPER_RIGHT_CORNER,panel2);
        tableDark3.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        materialTabbedPane1.setTitleAt(2, "Citys"); // change tab title
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialTabbedPane1 = new Components.MaterialTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new Swing.TableDark();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDark2 = new Swing.TableDark();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDark3 = new Swing.TableDark();
        pdfButton1 = new Components.PdfButton();
        comboBox1 = new Components.ComboBox();
        deleteButton1 = new Components.DeleteButton();
        editButton1 = new Components.EditButton();
        button1 = new Swing.Button();

        materialTabbedPane1.setForeground(new java.awt.Color(220, 220, 220));
        materialTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        materialTabbedPane1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N

        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "City", "Datetime", "Temperature", "Humidity", "Uv", "Wind Speed", "WeatherDesc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDark1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableDark1.setFillsViewportHeight(true);
        tableDark1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        tableDark1.setSelectionForeground(new java.awt.Color(220, 220, 220));
        tableDark1.setShowGrid(false);
        jScrollPane1.setViewportView(tableDark1);

        materialTabbedPane1.addTab("tab1", jScrollPane1);

        tableDark2.setForeground(new java.awt.Color(220, 220, 220));
        tableDark2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City", "Searched Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDark2.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(tableDark2);

        materialTabbedPane1.addTab("tab2", jScrollPane2);

        tableDark3.setForeground(new java.awt.Color(220, 220, 220));
        tableDark3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "City", "Region", "Country", "Latitude", "Longitude", "Appearance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDark3.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(tableDark3);

        materialTabbedPane1.addTab("tab3", jScrollPane3);

        pdfButton1.setForeground(new java.awt.Color(220, 220, 220));
        pdfButton1.setText("Convert to PDF");
        pdfButton1.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        pdfButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        pdfButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdfButton1MouseClicked(evt);
            }
        });

        comboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboBox1FocusGained(evt);
            }
        });

        deleteButton1.setForeground(new java.awt.Color(220, 220, 220));
        deleteButton1.setText("Delete");
        deleteButton1.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        deleteButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        editButton1.setForeground(new java.awt.Color(220, 220, 220));
        editButton1.setText("Edit  ");
        editButton1.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        editButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        editButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButton1MouseClicked(evt);
            }
        });

        button1.setBackground(new java.awt.Color(80, 80, 80));
        button1.setForeground(new java.awt.Color(220, 220, 220));
        button1.setText("Get");
        button1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pdfButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(materialTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(materialTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdfButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents



    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        // Initializing the delete button
        String selectedCity = String.valueOf(comboBox1.getSelectedItem());
        String IsNull = "null";
        if (selectedCity.equals(IsNull)){
            PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
            notification.init();
            notification.setInfo("Please select a city first");
            Timer timer = new Timer(1500, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    notification.setVisible(false);
                    notification.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();

            notification.setVisible(true);
        }else{
            try{
                tableDark1.getValueAt(0, 0);
                PopupDialogDelete obj = new PopupDialogDelete(parentFrame, selectedCity);
                obj.setVisible(true);

            } catch (Exception e) {
                PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
                notification.init();
                notification.setInfo("The city of "+selectedCity+" does not have any saved data");
                Timer timer = new Timer(2000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        notification.setVisible(false);
                        notification.dispose();
                    }
                });
                timer.setRepeats(false);
                timer.start();

                notification.setVisible(true);
            }

        }
    }//GEN-LAST:event_deleteButton1ActionPerformed

    private void editButton1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_editButton1MouseClicked
        // Initializing the Data editing process
        String selectedCity = String.valueOf(comboBox1.getSelectedItem());
        String IsNull = "null";
        if (selectedCity.equals(IsNull)){
            PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
            notification.init();
            notification.setInfo("Please select a city first");
            Timer timer = new Timer(1500, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    notification.setVisible(false);
                    notification.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();

            notification.setVisible(true);

            }else{
            try{
                tableDark1.getValueAt(0, 0);
                PopupDialogEdit obj = new PopupDialogEdit(parentFrame, selectedCity);
                obj.setVisible(true);
            } catch (Exception e) {
                PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
                notification.init();
                notification.setInfo("The city of "+selectedCity+" does not have any saved data");
                Timer timer = new Timer(2000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        notification.setVisible(false);
                        notification.dispose();
                    }
                });
                timer.setRepeats(false);
                timer.start();

                notification.setVisible(true);
            }

        }
    }//GEN-LAST:event_editButton1MouseClicked

    private void comboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboBox1FocusGained
        // Getting the city names for the comboBox from the db
        Database connectDB = Database.getConnectionInstance();
        List<String> cityLists = connectDB.selectAllCitys();
        Set<String> citySet = new TreeSet<>(cityLists);
        comboBox1.removeAllItems();
        for (String city : citySet) {
            comboBox1.addItem(city);
        }
    }//GEN-LAST:event_comboBox1FocusGained

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // Inserting data on tables Meteo Data, City Searched Data and City's
        String selectedCity = String.valueOf(comboBox1.getSelectedItem()); 
        String IsNull = "null";
        if (selectedCity.equals(IsNull)){
            PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
            notification.init();
            notification.setInfo("Please select a city first");
            Timer timer = new Timer(1500, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    notification.setVisible(false);
                    notification.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();

            notification.setVisible(true);
        }
        else{
        Database connectDB = Database.getConnectionInstance();
        List<List> DataList = connectDB.selectMeteoDataByCity(selectedCity);
        String[] columnNames1 = {"City", "Datetime", "Temperature", "Humidity", "Uv", "Wind Speed", "WeatherDesc"};

        DefaultTableModel tableModel1 = new DefaultTableModel(columnNames1, 0);
        tableDark1.setModel(tableModel1);
        tableDark1.setDefaultEditor(Object.class, null);
        for (List DataTable : DataList) {
            Object[] objectDataTable = DataTable.toArray(new Object[0]);
            tableModel1.addRow(objectDataTable);
        }
        List<List> SearchList = connectDB.selectSerchedTimesByCity(selectedCity);
        String[] columnNames2 = {"City", "Searched Date"};
        DefaultTableModel tableModel2 = new DefaultTableModel(columnNames2, 0);
        tableDark2.setModel(tableModel2);
        tableDark2.setDefaultEditor(Object.class, null);
        for (List SearchTable : SearchList) {
            Object[] objectSearchTable = SearchTable.toArray(new Object[0]);
            tableModel2.addRow(objectSearchTable);
        }
        List<List> CitysList = connectDB.selectCitysbyAppearance();
        String[] columnNames3 = {"City", "Region", "Country", "Latitude", "Longitude", "Appearance"};
        DefaultTableModel tableModel3 = new DefaultTableModel(columnNames3, 0);
        tableDark3.setModel(tableModel3);
        tableDark3.setDefaultEditor(Object.class, null);
        for (List CitysTable : CitysList) {
            Object[] objectCitysTable = CitysTable.toArray(new Object[0]);
            tableModel3.addRow(objectCitysTable);
        }
        }
    }//GEN-LAST:event_button1MouseClicked

    private void pdfButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfButton1MouseClicked
        // PDF Creator
        String selectedCity = String.valueOf(comboBox1.getSelectedItem());
        String IsNull = "null";
        if (selectedCity.equals(IsNull)){
            PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
            notification.init();
            notification.setInfo("Please select a city first");
            Timer timer = new Timer(1500, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    notification.setVisible(false);
                    notification.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();

            notification.setVisible(true);
        }
        else{
            try {
                if (tableDark1.getValueAt(0, 0) != null) {

                    // Create PDF
                    Document doc = new Document(PageSize.A4);
                    PdfWriter.getInstance(doc, new FileOutputStream("WeatherWithUs_"+selectedCity+".pdf"));
                    doc.open();

                    // Create PDF Table
                    PdfPTable pdfTable1 = new PdfPTable(tableDark1.getColumnCount());
                    pdfTable1.setWidthPercentage(100);
                    PdfPTable pdfTable2 = new PdfPTable(tableDark2.getColumnCount());
                    pdfTable2.setWidthPercentage(100);
                    PdfPTable pdfTable3 = new PdfPTable(tableDark3.getColumnCount());
                    pdfTable3.setWidthPercentage(100);

                    // Greek language
                    BaseFont arialGreek = BaseFont.createFont("C:\\Windows\\Fonts\\arial.ttf", "CP1253", BaseFont.EMBEDDED);
                    Font arial = new Font(arialGreek, 14, Font.BOLD);
                    Font arial18 = new Font(arialGreek, 18, Font.BOLD);

                    // Table column name
                    for (int i = 0; i < tableDark1.getColumnCount(); i++) {
                        PdfPCell cell = new PdfPCell(new Paragraph(tableDark1.getColumnName(i)));
                        cell.setBackgroundColor(BaseColor.RED);
                        pdfTable1.addCell(cell);
                    }

                    // Add data for each table
                    for (int rows = 0; rows < tableDark1.getRowCount(); rows++) {
                        for (int cols = 0; cols < tableDark1.getColumnCount(); cols++) {
                            pdfTable1.addCell(tableDark1.getModel().getValueAt(rows, cols).toString());
                        }
                    }

                    for (int i = 0; i < tableDark2.getColumnCount(); i++) {
                        PdfPCell cell = new PdfPCell(new Paragraph(tableDark2.getColumnName(i)));
                        cell.setBackgroundColor(BaseColor.RED);
                        pdfTable2.addCell(cell);
                    }

                    for (int rows = 0; rows < tableDark2.getRowCount(); rows++) {
                        for (int cols = 0; cols < tableDark2.getColumnCount(); cols++) {
                            pdfTable2.addCell(tableDark2.getModel().getValueAt(rows, cols).toString());
                        }
                    }

                    for (int i = 0; i < tableDark3.getColumnCount(); i++) {
                        PdfPCell cell = new PdfPCell(new Paragraph(tableDark3.getColumnName(i)));
                        cell.setBackgroundColor(BaseColor.RED);
                        pdfTable3.addCell(cell);
                    }

                    for (int rows = 0; rows < tableDark3.getRowCount(); rows++) {
                        for (int cols = 0; cols < tableDark3.getColumnCount(); cols++) {
                            pdfTable3.addCell(tableDark3.getModel().getValueAt(rows, cols).toString());
                        }
                    }
                    // Add tables and spaces to the PDF
                    doc.add(new Paragraph("R4. Προβολή στατιστικών καιρικών δεδομένων σε αρχείο pdf ", arial18));
                    doc.add(Chunk.NEWLINE);
                    doc.add(new Paragraph("Προβολή στατιστικών καιρικών δεδομένων για την πόλη "+selectedCity, arial));
                    doc.add(Chunk.NEWLINE);
                    pdfTable1.setSpacingAfter(10);
                    doc.add(pdfTable1);
                    doc.add(new Paragraph("Προβολή ημερομηνιών που έγινε αναζήτηση της πόλης "+selectedCity, arial));
                    doc.add(Chunk.NEWLINE);
                    pdfTable2.setSpacingAfter(10);
                    doc.add(pdfTable2);
                    doc.add(new Paragraph("Προβολή όλως των πόλεων για τις οποίες έχει πραγματοποιηθεί αναζήτηση", arial));
                    doc.add(Chunk.NEWLINE);
                    doc.add(pdfTable3);
                    doc.close();

                    // Open PDF file
                    File myFile = new File("WeatherWithUs_"+selectedCity+".pdf");
                    Desktop.getDesktop().open(myFile);

                } else {
                    PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
                    notification.init();
                    notification.setInfo("Please press the Get button for data to appear in the tables");
                    javax.swing.Timer timer = new Timer(3000, new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            notification.setVisible(false);
                            notification.dispose();
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();

                    notification.setVisible(true);
                }
            } catch (Exception ex) {
                PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
                notification.init();
                notification.setInfo("There are no Meteo Data for the city of "+selectedCity);
                javax.swing.Timer timer = new Timer(3000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        notification.setVisible(false);
                        notification.dispose();
                    }
                });
                timer.setRepeats(false);
                timer.start();

                notification.setVisible(true);
            }
        }
    }//GEN-LAST:event_pdfButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button button1;
    private Components.ComboBox comboBox1;
    private Components.DeleteButton deleteButton1;
    private Components.EditButton editButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private Components.MaterialTabbedPane materialTabbedPane1;
    private Components.PdfButton pdfButton1;
    private Swing.TableDark tableDark1;
    private Swing.TableDark tableDark2;
    private Swing.TableDark tableDark3;
    // End of variables declaration//GEN-END:variables
}
