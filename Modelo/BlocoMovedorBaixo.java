package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Auxiliar.Posicao;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class BlocoMovedorBaixo extends Elemento implements Serializable{
    
    
    public BlocoMovedorBaixo(Posicao posicao) {
        super("SetaBlocoBaixo.png");
        this.pPosicao=posicao;
        this.bTransponivel = true;
        this.moverBaixo=true;
        this.pNaoRemovivel=true;
    }

    
}
