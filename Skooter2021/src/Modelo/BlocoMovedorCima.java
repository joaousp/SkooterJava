package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Auxiliar.Posicao;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class BlocoMovedorCima extends Elemento implements Serializable{
    
    
    public BlocoMovedorCima(Posicao posicao) {
        super("SetaBlocoCima.png");
        this.pPosicao=posicao;
        this.bTransponivel = true;
        this.moverCima=true;
        this.pNaoRemovivel=true;
    }

    
}
