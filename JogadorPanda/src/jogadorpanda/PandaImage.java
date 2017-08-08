/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogadorpanda;

import interfaces.IImage;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author flavi
 */
public class PandaImage implements IImage{

    @Override
    public BufferedImage carregar() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getClassLoader().getResource("images/panda.png"));
        } catch (IOException ex) {
            Logger.getLogger(PandaImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return image;
    }
    
}
