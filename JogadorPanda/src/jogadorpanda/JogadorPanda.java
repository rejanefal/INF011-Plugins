/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogadorpanda;

import interfaces.IImage;
import interfaces.IJogador;
import interfaces.IPlugin;

/**
 *
 * @author flavi
 */
public class JogadorPanda implements IJogador,IPlugin{
    @Override
    public IImage createJogador() {
        return new PandaImage();
    }
    
    @Override
    public String msgPlugin() {
        return "Plugin " + this.getClass().getSimpleName();
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
    
}
