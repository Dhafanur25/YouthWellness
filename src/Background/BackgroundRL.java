package Background;

import addOns.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import com.twelvemonkeys.image.ImageUtil;

// Kelas ini digunakan untuk menampilkan latar belakang dengan efek blur.
public class BackgroundRL extends JComponent {

    // Inisialisasi variabel
    private Icon image;
    private BufferedImage bufferedImage;
    private String pic = "bgLogReg.jpg";
    private Component blur;

    
    // Konstruktor untuk inisialisasi dengan gambar latar belakang default "bgLogReg.jpg".
    public BackgroundRL() {
        image = new ImageIcon(getClass().getResource(pic));
    }

    // Getter method untuk blur
    public Component getBlur() {
        return blur;
    }

    // Mengatur komponen blur dan memperbarui tampilan
    public void setBlur(Component blur) {
        this.blur = blur;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createImage();
                repaint();
            }
        });
    }

   
    // Getter method untuk image
    public Icon getImage() {
        return image;
    }

    // Getter method untuk bufferedImage
    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    // Mengatur nama file gambar latar belakang dan memuat gambar.
    public void setPic(String pic) {
        this.pic = pic;
        loadImage();
        repaint();
    }

    // Getter method untuk pic
    public String getPic() {
        return pic;
    }

    // Memuat gambar dari resource
    public void loadImage() {
        image = new ImageIcon(getClass().getResource(pic));
        createImage();
    }

    // Membuat gambar dari ImageIcon dan mengatur BufferedImage
    public void createImage() {
        if (image != null) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2 = bufferedImage.createGraphics();

                // Mengatur kualitas render
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Mendapatkan area gambar yang diatur sesuai aspect ratio
                Rectangle rec = getAutoSize(image);
                g2.drawImage(((ImageIcon) image).getImage(), rec.x, rec.y, rec.width, rec.height, null);
                if (blur != null) {
                    createBlurImage(g2);
                }
                g2.dispose();
            }
        }
    }

    // Membuat gambar blur pada area yang diatur
    public void createBlurImage(Graphics2D g) {
        int x = blur.getX();
        int y = blur.getY();
        int width = blur.getWidth();
        int height = blur.getHeight();
        int shadow = 8;
        if (width > 0 && height > 0) {
            BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Shape shape = new FancyBorderRadius(width, height, "26% 74% 51% 49% / 49% 18% 82% 51%").getShape();
            g2.fill(shape);
            g2.setComposite(AlphaComposite.SrcIn);
            g2.drawImage(ImageUtil.blur(bufferedImage.getSubimage(x, y, width, height), 30f), 0, 0, null);
            g2.setComposite(AlphaComposite.SrcOver);
            g2.setColor(new Color(255, 255, 255, 20));
            g2.fill(shape);
            g2.dispose();
            g.drawImage(new ShadowRenderer(shadow, 0.3f, new Color(0, 0, 0)).createShadow(img), (int) (x - shadow * 0.8f), (int) (y - shadow * 0.8f), null);
            g.drawImage(img, x, y, null);
        }
    }

    // Menggambar komponen
    @Override
    protected void paintComponent(Graphics grphcs) {
        if (bufferedImage != null) {
            BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fillRect(0, 0, getWidth(), getHeight()); 
            g2.setComposite(AlphaComposite.SrcIn);
            g2.drawImage(bufferedImage, 0, 0, null);
            g2.dispose();
            grphcs.drawImage(img, 0, 0, null);
        }
        super.paintComponent(grphcs);
    }

    // Mengatur batas komponen dan memperbarui tampilan
    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createImage();
                repaint();
            }
        });
    }

    // Mendapatkan area gambar yang diatur sesuai rasio aspek
    public Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        if (width < 1) {
            width = 1;
        }
        if (height < 1) {
            height = 1;
        }
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }
}
