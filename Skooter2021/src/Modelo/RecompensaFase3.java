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
public class RecompensaFase3 extends Elemento{
     public RecompensaFase3(Posicao umaPosicao){
        super("uva.png");
        this.setPosicao(umaPosicao);
        bTransponivel=true;
    }
}