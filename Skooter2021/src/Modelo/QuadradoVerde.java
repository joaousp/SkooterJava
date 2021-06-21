/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Desenhador;
import Auxiliar.Posicao;

/**
 *
 * @author joaom
 */
public class QuadradoVerde extends Elemento {
    
    
    public QuadradoVerde(Posicao umaPosicao) {
        super("quadradoVerde.png");
        this.setPosicao(umaPosicao);
        bTransponivel=false;
        pMovivel=true;
    }
    
     public void autoDesenho(){
        
        
        if(!Desenhador.getTelaDoJogo().ehPosicaoValidaRelativaAUmPersonagem(this)){
            //TODO apagar aqui;
            //setPosicao(new Posicao(0,0));
            Desenhador.getTelaDoJogo().removeElemento(this);
            
            
        }

        super.autoDesenho();
    }
     
     
     
    
    
    
    
}
