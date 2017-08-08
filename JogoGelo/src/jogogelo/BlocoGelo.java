package jogogelo;

import interfaces.IBloco;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class BlocoGelo implements IBloco{

    @Override
    public BufferedImage carregar() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getClassLoader().getResource("images/blocoGelo.png"));
        } catch (IOException ex) {
            Logger.getLogger(BlocoGelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return image;
    }

    
}
