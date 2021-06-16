/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Desenhador;
import Auxiliar.Posicao;
import java.io.Serializable;

/**
 *
 * @author joaom
 */
public class QuadradoVermelhoLosango extends Elemento implements Serializable{
    private int contador;
    public QuadradoVermelhoLosango(Posicao umaPosicao) {
        super("quadradoVermelhoLosango.png");
        this.setPosicao(umaPosicao);
        bTransponivel=false;
        pMovivel=true;
        pNaoRemovivel=true;
        contador=0;
    }
    
    public void autoDesenho(){

        if(!Desenhador.getTelaDoJogo().ehPosicaoValidaRelativaAUmPersonagem(this)){
            contador++;
            System.out.println("Nao rola patrao");
            System.out.println(this.getPosicao().getLinha()+" "+this.getPosicao().getColuna());
            System.out.println(contador);
            this.getPosicao().volta();
            
        }
       
       
        //setpMovivel(true);
        super.autoDesenho();
    }

}
