package com.mycompany.diu_entrega_5;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Logo extends JPanel{
    private BufferedImage logo;

    public Logo() {
        try {
            logo = ImageIO.read(new File("src/main/java/images/logo_100.png"));
        } catch (IOException ex) {}
    }
    
    public BufferedImage getLogo() {
        return logo;
    }

    public void setLogo(BufferedImage logo) {
        this.logo = logo;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(logo, this.getPreferredSize().width - logo.getWidth(), 0, null);

    }
    
}
