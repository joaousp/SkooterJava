package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Auxiliar.Posicao;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class BlocoMovedorDireita extends Elemento implements Serializable{
    
    
    public BlocoMovedorDireita(Posicao posicao) {
        super("SetaBlocoDireita.png");
        this.pPosicao=posicao;
        this.bTransponivel = true;
        this.moverDireita=true;
        this.pNaoRemovivel=true;
    }

    
}
