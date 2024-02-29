package Menu;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Forecast extends javax.swing.JPanel {
    
    private ImageIcon c_icon, cur_con_icon, h_icn, ws_icn, uv_icn, fm_icn, fn_icn, fe_icn, fnt_icn;
    
        
    public Forecast() {
        initComponents();
        setOpaque(false);
        // City Label & Location Icon
        c_icon = iconRender("/Icons/location.png", 27, 27);
        city_icon.setIcon(c_icon);
        city.repaint();
        
        // Current Conditions icon
        cur_con_icon =  iconRender("/Icons/cur_partly_cloudy.png", 100, 100);
        cur_conditions.setIcon(cur_con_icon);
        
        // Humidity - Winspeed - UV icons
        h_icn = iconRender("/Icons/humidity.png", 25, 25);
        h_icon.setIcon(h_icn);
        ws_icn = iconRender("/Icons/windspeed.png", 25, 25);
        ws_icon.setIcon(ws_icn);
        uv_icn = iconRender("/Icons/uv.png", 25, 25);
        uv_icon.setIcon(uv_icn);
        
        // Morning Forecast
        fm_icn = iconRender("/Icons/sunny.png", 50, 50);
        fm_icon.setIcon(fm_icn);
        
        //Noon Forecast
        fn_icn = iconRender("/Icons/sunny.png", 50, 50);
        fn_icon.setIcon(fn_icn);
        
        //Evening Forecast
        fe_icn = iconRender("/Icons/partly_cloudy.png", 50, 50);
        fe_icon.setIcon(fe_icn);
        
        //Night Forecast
        fnt_icn = iconRender("/Icons/rainy.png", 50, 50);
        fnt_icon.setIcon(fnt_icn);
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

        cur_temp = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        city_icon = new javax.swing.JLabel();
        cur_conditions = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        ws_icon = new javax.swing.JLabel();
        h_icon = new javax.swing.JLabel();
        uv_icon = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        ws = new javax.swing.JLabel();
        uv = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        line1 = new javax.swing.JPanel();
        column = new javax.swing.JPanel();
        fm = new javax.swing.JLabel();
        fm_icon = new javax.swing.JLabel();
        fm_temp = new javax.swing.JLabel();
        fm_description = new javax.swing.JLabel();
        fm_h = new javax.swing.JLabel();
        fm_ws = new javax.swing.JLabel();
        fm_uv = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        column1 = new javax.swing.JPanel();
        fn_icon = new javax.swing.JLabel();
        fn_temp = new javax.swing.JLabel();
        fn_description = new javax.swing.JLabel();
        fn_h = new javax.swing.JLabel();
        fn_ws = new javax.swing.JLabel();
        fn_uv = new javax.swing.JLabel();
        fe = new javax.swing.JLabel();
        column2 = new javax.swing.JPanel();
        fe_icon = new javax.swing.JLabel();
        fe_temp = new javax.swing.JLabel();
        fe_description = new javax.swing.JLabel();
        fe_h = new javax.swing.JLabel();
        fe_ws = new javax.swing.JLabel();
        fe_uv = new javax.swing.JLabel();
        fnt = new javax.swing.JLabel();
        fnt_icon = new javax.swing.JLabel();
        fnt_temp = new javax.swing.JLabel();
        fnt_description = new javax.swing.JLabel();
        fnt_h = new javax.swing.JLabel();
        fnt_ws = new javax.swing.JLabel();
        fnt_uv = new javax.swing.JLabel();
        searchBar1 = new Components.SearchBar();

        cur_temp.setFont(new java.awt.Font("Avenir Next", 1, 48)); // NOI18N
        cur_temp.setForeground(new java.awt.Color(200, 200, 200));
        cur_temp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cur_temp.setText("20˚C");
        cur_temp.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cur_temp.setAlignmentX(1.5F);
        cur_temp.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        city.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        city.setForeground(new java.awt.Color(200, 200, 200));
        city.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        city.setText("City");
        city.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        description.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        description.setForeground(new java.awt.Color(220, 220, 220));
        description.setText("Partly Cloudy");

        ws_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        h_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        uv_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        h.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        h.setForeground(new java.awt.Color(200, 200, 200));
        h.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        h.setText("62%");

        ws.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        ws.setForeground(new java.awt.Color(200, 200, 200));
        ws.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ws.setText("2 Bft");

        uv.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        uv.setForeground(new java.awt.Color(200, 200, 200));
        uv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uv.setText("3");

        line.setBackground(new java.awt.Color(150, 150, 150));
        line.setForeground(new java.awt.Color(150, 150, 150));
        line.setToolTipText("");
        line.setMinimumSize(new java.awt.Dimension(100, 3));
        line.setPreferredSize(new java.awt.Dimension(100, 6));
        line.setSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        line1.setBackground(new java.awt.Color(150, 150, 150));
        line1.setForeground(new java.awt.Color(150, 150, 150));
        line1.setToolTipText("");
        line1.setMinimumSize(new java.awt.Dimension(100, 3));
        line1.setSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout line1Layout = new javax.swing.GroupLayout(line1);
        line1.setLayout(line1Layout);
        line1Layout.setHorizontalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line1Layout.setVerticalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        column.setBackground(new java.awt.Color(150, 150, 150));
        column.setToolTipText("");
        column.setMinimumSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout columnLayout = new javax.swing.GroupLayout(column);
        column.setLayout(columnLayout);
        columnLayout.setHorizontalGroup(
            columnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        columnLayout.setVerticalGroup(
            columnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        fm.setFont(new java.awt.Font("Avenir Next", 2, 12)); // NOI18N
        fm.setForeground(new java.awt.Color(220, 220, 220));
        fm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fm.setText("Morning");

        fm_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fm_temp.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        fm_temp.setForeground(new java.awt.Color(220, 220, 220));
        fm_temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fm_temp.setText("25˚C");

        fm_description.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        fm_description.setForeground(new java.awt.Color(220, 220, 220));
        fm_description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fm_description.setText("Sunny");

        fm_h.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fm_h.setForeground(new java.awt.Color(180, 180, 180));
        fm_h.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fm_h.setText("Humidity: 55%");

        fm_ws.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fm_ws.setForeground(new java.awt.Color(180, 180, 180));
        fm_ws.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fm_ws.setText("Windspeed: 4 Bft");

        fm_uv.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fm_uv.setForeground(new java.awt.Color(180, 180, 180));
        fm_uv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fm_uv.setText("UV: 8");

        fn.setFont(new java.awt.Font("Avenir Next", 2, 12)); // NOI18N
        fn.setForeground(new java.awt.Color(220, 220, 220));
        fn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn.setText("Noon");

        column1.setBackground(new java.awt.Color(150, 150, 150));
        column1.setToolTipText("");
        column1.setMinimumSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout column1Layout = new javax.swing.GroupLayout(column1);
        column1.setLayout(column1Layout);
        column1Layout.setHorizontalGroup(
            column1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        column1Layout.setVerticalGroup(
            column1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        fn_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fn_temp.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        fn_temp.setForeground(new java.awt.Color(220, 220, 220));
        fn_temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_temp.setText("23˚C");

        fn_description.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        fn_description.setForeground(new java.awt.Color(220, 220, 220));
        fn_description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_description.setText("Mostly Sunny");

        fn_h.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fn_h.setForeground(new java.awt.Color(180, 180, 180));
        fn_h.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_h.setText("Humidity: 58%");

        fn_ws.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fn_ws.setForeground(new java.awt.Color(180, 180, 180));
        fn_ws.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_ws.setText("Windspeed: 3 Bft");

        fn_uv.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fn_uv.setForeground(new java.awt.Color(180, 180, 180));
        fn_uv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_uv.setText("UV: 6");

        fe.setFont(new java.awt.Font("Avenir Next", 2, 12)); // NOI18N
        fe.setForeground(new java.awt.Color(220, 220, 220));
        fe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fe.setText("Evening");

        column2.setBackground(new java.awt.Color(150, 150, 150));
        column2.setToolTipText("");
        column2.setMinimumSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout column2Layout = new javax.swing.GroupLayout(column2);
        column2.setLayout(column2Layout);
        column2Layout.setHorizontalGroup(
            column2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        column2Layout.setVerticalGroup(
            column2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        fe_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fe_temp.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        fe_temp.setForeground(new java.awt.Color(220, 220, 220));
        fe_temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fe_temp.setText("20˚C");

        fe_description.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        fe_description.setForeground(new java.awt.Color(220, 220, 220));
        fe_description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fe_description.setText("Partly Cloudy");

        fe_h.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fe_h.setForeground(new java.awt.Color(180, 180, 180));
        fe_h.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fe_h.setText("Humidity: 62%");

        fe_ws.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fe_ws.setForeground(new java.awt.Color(180, 180, 180));
        fe_ws.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fe_ws.setText("Windspeed: 3 Bft");

        fe_uv.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fe_uv.setForeground(new java.awt.Color(180, 180, 180));
        fe_uv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fe_uv.setText("UV: 3");

        fnt.setFont(new java.awt.Font("Avenir Next", 2, 12)); // NOI18N
        fnt.setForeground(new java.awt.Color(220, 220, 220));
        fnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnt.setText("Night");

        fnt_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fnt_temp.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        fnt_temp.setForeground(new java.awt.Color(220, 220, 220));
        fnt_temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnt_temp.setText("16˚C");

        fnt_description.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        fnt_description.setForeground(new java.awt.Color(220, 220, 220));
        fnt_description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnt_description.setText("Rain");

        fnt_h.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fnt_h.setForeground(new java.awt.Color(180, 180, 180));
        fnt_h.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnt_h.setText("Humidity: 68%");

        fnt_ws.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fnt_ws.setForeground(new java.awt.Color(180, 180, 180));
        fnt_ws.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnt_ws.setText("Windspeed: 2 Bft");

        fnt_uv.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        fnt_uv.setForeground(new java.awt.Color(180, 180, 180));
        fnt_uv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnt_uv.setText("UV: 0");

        searchBar1.setForeground(new java.awt.Color(220, 220, 220));
        searchBar1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        searchBar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fm_temp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fm_description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fm_h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fm_ws, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(fm_uv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fm_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15)
                                .addComponent(column, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fn_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fn_temp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fn_description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fn_h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fn_ws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fn_uv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(column1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fe_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fe_temp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fe_description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fe_h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fe_ws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fe_uv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(column2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fnt_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fnt_temp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fnt_description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fnt_h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fnt_ws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fnt_uv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cur_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(city_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(h_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ws_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(uv_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(uv, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))))))
                        .addGap(20, 20, 20)
                        .addComponent(searchBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cur_conditions, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cur_conditions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cur_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(city_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(searchBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(h_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(ws_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uv_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uv, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fm_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fm_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fm_description)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fm_h)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fm_ws)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fm_uv))
                            .addComponent(column, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(fn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fn_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fn_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fn_description)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fn_h)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fn_ws)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fn_uv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(column1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(fnt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fnt_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fnt_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fnt_description)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fnt_h)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fnt_ws)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fnt_uv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fe_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fe_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fe_description)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fe_h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fe_ws)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fe_uv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(column2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBar1ActionPerformed

    }//GEN-LAST:event_searchBar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city;
    private javax.swing.JLabel city_icon;
    private javax.swing.JPanel column;
    private javax.swing.JPanel column1;
    private javax.swing.JPanel column2;
    private javax.swing.JLabel cur_conditions;
    private javax.swing.JLabel cur_temp;
    private javax.swing.JLabel description;
    private javax.swing.JLabel fe;
    private javax.swing.JLabel fe_description;
    private javax.swing.JLabel fe_h;
    private javax.swing.JLabel fe_icon;
    private javax.swing.JLabel fe_temp;
    private javax.swing.JLabel fe_uv;
    private javax.swing.JLabel fe_ws;
    private javax.swing.JLabel fm;
    private javax.swing.JLabel fm_description;
    private javax.swing.JLabel fm_h;
    private javax.swing.JLabel fm_icon;
    private javax.swing.JLabel fm_temp;
    private javax.swing.JLabel fm_uv;
    private javax.swing.JLabel fm_ws;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel fn_description;
    private javax.swing.JLabel fn_h;
    private javax.swing.JLabel fn_icon;
    private javax.swing.JLabel fn_temp;
    private javax.swing.JLabel fn_uv;
    private javax.swing.JLabel fn_ws;
    private javax.swing.JLabel fnt;
    private javax.swing.JLabel fnt_description;
    private javax.swing.JLabel fnt_h;
    private javax.swing.JLabel fnt_icon;
    private javax.swing.JLabel fnt_temp;
    private javax.swing.JLabel fnt_uv;
    private javax.swing.JLabel fnt_ws;
    private javax.swing.JLabel h;
    private javax.swing.JLabel h_icon;
    private javax.swing.JPanel line;
    private javax.swing.JPanel line1;
    private Components.SearchBar searchBar1;
    private javax.swing.JLabel uv;
    private javax.swing.JLabel uv_icon;
    private javax.swing.JLabel ws;
    private javax.swing.JLabel ws_icon;
    // End of variables declaration//GEN-END:variables
}
