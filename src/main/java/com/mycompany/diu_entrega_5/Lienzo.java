package com.mycompany.diu_entrega_5;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Lienzo extends JPanel{
    private BufferedImage imagen = null;

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    public Lienzo() {
        try {
            imagen = ImageIO.read(new File("src/main/java/images/supermario.png"));
            
        } catch (IOException ex) {}
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, imagen.getWidth()/2, imagen.getHeight()/2, null);
    }
    
}
