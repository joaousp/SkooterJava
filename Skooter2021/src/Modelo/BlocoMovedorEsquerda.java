package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Auxiliar.Posicao;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class BlocoMovedorEsquerda extends Elemento implements Serializable{
    
    
    public BlocoMovedorEsquerda(Posicao posicao) {
        super("SetaBlocoEsquerda.png");
        this.pPosicao=posicao;
        this.bTransponivel = true;
        this.moverEsquerda=true;
        this.pNaoRemovivel=true;
    }

    
}
