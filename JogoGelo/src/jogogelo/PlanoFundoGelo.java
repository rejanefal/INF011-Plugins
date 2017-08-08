/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogogelo;

import interfaces.IPlanoDeFundo;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PlanoFundoGelo implements IPlanoDeFundo{

    @Override
    public Image carregar() {
        return new ImageIcon(getClass().getClassLoader().getResource("images/fundoGelo.png")).getImage();
    }
    
}
