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
public class QuadradoVerdeLiso extends Elemento {

    public QuadradoVerdeLiso(Posicao umaPosicao) {
        super("quadradoVerdeLiso.png");
        this.setPosicao(umaPosicao);
        bTransponivel=true;
        pMovivel=false;
    }

     public void autoDesenho(){


        if(!Desenhador.getTelaDoJogo().ehPosicaoValidaRelativaAUmPersonagem(this)){
            //TODO apagar aqui;
           Desenhador.getTelaDoJogo().removeElemento(this);
        }

        super.autoDesenho();
    }







} 