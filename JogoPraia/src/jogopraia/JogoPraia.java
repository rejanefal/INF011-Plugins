package jogopraia;

import interfaces.IBloco;
import interfaces.ICenario;
import interfaces.IChao;
import interfaces.IPlanoDeFundo;
import interfaces.IPlugin;

public class JogoPraia implements ICenario,IPlugin{ 

    @Override
    public IBloco createBloco() {
        return new BlocoPraia();
    }

    @Override
    public IChao createChao() {
        return new ChaoPraia();
    }

    @Override
    public IPlanoDeFundo createPlanoDeFundo() {
        return new PlanoFundoPraia();
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
