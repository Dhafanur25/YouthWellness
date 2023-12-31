package swing;

import java.awt.*;
import javax.swing.JTextArea;

public class RoundTextArea extends JTextArea {

    public RoundTextArea() {
        setBackground(new Color(217, 217, 217));
        setForeground(Color.BLACK);
        setEditable(true);
    }
    @Override
    protected void paintComponent(Graphics g) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        super.paintComponent(g);
    }
}
