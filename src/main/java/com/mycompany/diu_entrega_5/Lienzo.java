package com.mycompany.diu_entrega_5;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Lienzo extends JPanel {

    private BufferedImage imagen;
    private BufferedImage newImagen;


    public BufferedImage getNewImagen() {
        return newImagen;
    }

    public void setNewImagen(BufferedImage newImagen) {
        this.newImagen = newImagen;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    public Lienzo() {
        try {
            imagen = ImageIO.read(new File("./src/main/java/images/fondos.jpg"));
            newImagen = imagen;
        } catch (IOException ex) {

        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imageToBufferedImage(newImagen.getScaledInstance(this.getPreferredSize().width, this.getPreferredSize().height, Image.SCALE_SMOOTH)), 0, 0, null);
    }

    private static BufferedImage imageToBufferedImage(Image im) {
        BufferedImage bi = new BufferedImage(im.getWidth(null), im.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics bg = bi.getGraphics();
        bg.drawImage(im, 0, 0, null);
        bg.dispose();
        return bi;
    }
}
