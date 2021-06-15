/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Desenhador;
import Auxiliar.Posicao;
import java.util.Random;

/**
 *
 * @author joaom
 */
public class RoboAzul extends Elemento {
    public RoboAzul(Posicao umaPosicao){
        super("robo_azul.png");
        this.setPosicao(umaPosicao);
        bTransponivel=false;
         bMortal=true;
    }
    public void autoDesenho(){
        Random r=new Random();
        int iDirecao=r.nextInt(4);
        switch(iDirecao){
            case 0:
                this.moveUp();
                break;
            case 1:
                this.moveDown();
                break;
            case 2:
                this.moveLeft();
                break;
            case 3:
                this.moveRight();
                break;
                
        }
        
        if(!Desenhador.getTelaDoJogo().ehPosicaoValidaRelativaAUmPersonagem(this)){
            this.getPosicao().volta();
        }

        super.autoDesenho();
    }
}
