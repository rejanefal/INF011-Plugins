/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeserto;

import interfaces.IBloco;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class BlocoDeserto implements IBloco {

    @Override
    public BufferedImage carregar() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getClassLoader().getResource("images/blocoDeserto.png"));
        } catch (IOException ex) {
            Logger.getLogger(BlocoDeserto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return image;
    }

    

    
    
}
