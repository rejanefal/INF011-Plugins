/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogogelo;

import interfaces.IBloco;
import interfaces.ICenario;
import interfaces.IChao;
import interfaces.IPlanoDeFundo;
import interfaces.IPlugin;

/**
 *
 * @author flavi
 */
public class JogoGelo implements ICenario,IPlugin{

    @Override
    public IBloco createBloco() {
        return new BlocoGelo();
    }

    @Override
    public IChao createChao() {
        return new ChaoGelo();
    }

    @Override
    public IPlanoDeFundo createPlanoDeFundo() {
        return new PlanoFundoGelo();
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
