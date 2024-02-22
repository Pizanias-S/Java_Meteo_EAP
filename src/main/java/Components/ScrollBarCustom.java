package Components;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollbarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(200, 136, 55));
        setBackground(new Color(30, 30, 30));
    }
}