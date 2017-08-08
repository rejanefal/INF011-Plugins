/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeserto;

import interfaces.IChao;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author flavi
 */
public class ChaoDeserto implements IChao {

    @Override
    public Image carregar() {
        return new ImageIcon(getClass().getClassLoader().getResource("images/chaoDeserto.png")).getImage();
    }
    
}
