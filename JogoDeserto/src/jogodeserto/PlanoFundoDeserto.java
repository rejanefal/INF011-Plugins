/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeserto;

import interfaces.IPlanoDeFundo;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PlanoFundoDeserto implements IPlanoDeFundo {

    @Override
    public Image carregar() {
        return new ImageIcon(getClass().getClassLoader().getResource("images/fundoDeserto.png")).getImage();
    }
    
}
