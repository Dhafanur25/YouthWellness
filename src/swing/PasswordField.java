package swing;

import java.awt.*;
import java.util.Arrays;
import java.util.logging.*;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class PasswordField extends JTextField {

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
        repaint();
    }

    private String hint = "";
    private final Animator animator;
    private float animate;
    private boolean show = true;
    private boolean showPassword = false; 

    public PasswordField() {
        setOpaque(false);
        setBorder(new EmptyBorder(9, 1, 9, 1));
        setBackground(new Color(0, 0, 0, 0));
        setForeground(new Color(255, 255, 255));
        setSelectionColor(new Color(232, 232, 232));
        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    animate = fraction;
                } else {
                    animate = 1f - fraction;
                }
                repaint();
            }

            @Override
            public void end() {
                show = !show;
                repaint();
            }

        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    if (!getDocument().getText(0, getDocument().getLength()).equals("")) {
                        if (show) {
                            if (animator.isRunning() == false) {
                                stop();
                                animator.start();
                            }
                        } else if (animator.isRunning()) {
                            stop();
                            animator.start();
                        }
                    }
                } catch (BadLocationException ex) {
                    Logger.getLogger(PasswordField.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try {
                    if (getDocument().getText(0, getDocument().getLength()).equals("")) {
                        stop();
                        animator.start();
                    }
                } catch (BadLocationException ex) {
                    Logger.getLogger(PasswordField.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

    }

    private void stop() {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
    }

    public void showPassword() {
        showPassword = true;
        repaint();
    }

    public void hidePassword() {
        showPassword = false;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(new Color(255, 255, 255, 200));
        g2.drawLine(0, getHeight() - 3, getWidth(), getHeight() - 3);

        if (showPassword) {
            super.paint(g);
        } else {
            char[] text = {'0', '1'};
            try {
                text = getDocument().getText(0, getDocument().getLength()).toCharArray();
            } catch (BadLocationException ex) {
                Logger.getLogger(PasswordField.class.getName()).log(Level.SEVERE, null, ex);
            }
            int length = text.length;
            char[] hiddenText = new char[length];
            Arrays.fill(hiddenText, '•'); // Use a bullet character for hidden text
            String hiddenString = new String(hiddenText);
            FontMetrics fm = g2.getFontMetrics();
            int yOffset = getHeight() / 2 + fm.getAscent() / 2;
            g2.drawString(hiddenString, 6, yOffset);
        }

        if (!hint.equals("")) {
            int h = getHeight();
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            g2.setColor(new Color(232, 232, 232));
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f - animate));
            g2.drawString(hint, ins.left + (animate * 30), getHeight() / 2 + fm.getAscent() / 2 - 1);
        }

        g2.dispose();
    }

}

