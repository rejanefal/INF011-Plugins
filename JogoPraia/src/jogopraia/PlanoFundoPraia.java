/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopraia;

import interfaces.IPlanoDeFundo;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author flavi
 */
public class PlanoFundoPraia implements IPlanoDeFundo {

    @Override
    public Image carregar() {
        
        return new ImageIcon(getClass().getClassLoader().getResource("images/fundoPraia.png")).getImage();
    }
    
}
