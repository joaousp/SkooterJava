/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Posicao;

/**
 *
 * @author joaom
 */
public class RecompensaFase4 extends Elemento{
     public RecompensaFase4(Posicao umaPosicao){
        super("limao.png");
        this.setPosicao(umaPosicao);
        bTransponivel=true;
    }
}