package Components;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class SearchInfoButton extends JButton {
    
    private final Image img;
    private final Dimension imageSize = new Dimension(15, 15);

    public SearchInfoButton() {
        setContentAreaFilled(false);
        setBorder(null);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        img = new ImageIcon(getClass().getResource("/Icons/infoSearch.png")).getImage();
    }
        
    @Override
     public void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        int width = getWidth();
        int height = getHeight();
        int x = (width - imageSize.width) / 2;
        int y = (height - imageSize.height) / 2;
        g2.drawImage(img, x, y, imageSize.width, imageSize.height, null);
        g2.dispose();
        super.paintComponent(grphcs);
    }
}