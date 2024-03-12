package Components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 * Custom bg for popup dialogs.
 * 
 */
public class PopupBackground extends JPanel {

    public PopupBackground() {
        init();
    }

    private void init() {
        setOpaque(false);
        setBackground(new Color(40, 40, 40));
        setForeground(new Color(220, 220, 220));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();
        Area area = new Area(new Rectangle2D.Double(x, y, width, height - y));
        g2.setColor(getBackground());
        g2.fill(area);
        g2.dispose();
        super.paintComponent(g);
    }
}
