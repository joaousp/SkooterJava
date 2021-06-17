/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Auxiliar.Posicao;
import Modelo.BlocoMovedorBaixo;
import Modelo.BlocoMovedorCima;
import Modelo.BlocoMovedorEsquerda;
import Modelo.BlocoMovedorDireita;
import Modelo.Elemento;
import Modelo.FrutaColecionavel;
import Modelo.Hero;
import Modelo.QuadradoVerde;
import Modelo.QuadradoVerdeLiso;
import Modelo.QuadradoVermelho;
import Modelo.QuadradoVermelhoLosango;
import Modelo.RecompensaFase2;
import Modelo.RecompensaFase3;
import Modelo.RecompensaFase4;
import Modelo.RoboAmarelo;
import Modelo.RoboAzul;
import Modelo.RoboVerde;
import Modelo.RoboVermelho;
import java.util.ArrayList;

/**
 *
 * @author joaom
 */
public class Fase extends ArrayList<Elemento>{

    Fase(int iSize) {
        super(iSize);
    }
    public void setFase1(Hero umHero){
        this.clear();
        this.add(umHero);
        //fazendo a bordinha
        this.add(new QuadradoVerde(new Posicao(0,0)));
        this.add(new QuadradoVerde(new Posicao(0,12)));
        this.add(new QuadradoVerde(new Posicao(12,0)));
        this.add(new QuadradoVerde(new Posicao(12,12)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(i,0)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(i,12)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(0,i)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(12,i)));
        
        
        //adicionando as frutas
        
        this.add(new FrutaColecionavel(new Posicao(1,1)));
        this.add(new FrutaColecionavel(new Posicao(1,11)));
        this.add(new FrutaColecionavel(new Posicao(11,1)));
        this.add(new FrutaColecionavel(new Posicao(11,11)));
        
        //this.add(new QuadradoVerde(new Posicao(0,0)));
        
        //adicionar os blocos vermelhos
        for(int j=2;j<11;j=j+2)
            for(int i=2;i<11;i=i+2)
                this.add(new QuadradoVermelho(new Posicao(i,j)));
        

        //adicionando os blocos verdes
        this.add(new QuadradoVerde(new Posicao(4,1)));
        this.add(new QuadradoVerde(new Posicao(10,1)));
        
        this.add(new QuadradoVerde(new Posicao(1,2)));
        this.add(new QuadradoVerde(new Posicao(3,2)));
        this.add(new QuadradoVerde(new Posicao(5,2)));
        
        this.add(new QuadradoVerde(new Posicao(2,3)));
        this.add(new QuadradoVerde(new Posicao(6,3)));
        this.add(new QuadradoVerde(new Posicao(10,3)));
        
        this.add(new QuadradoVerde(new Posicao(9,4)));
        
        this.add(new QuadradoVerde(new Posicao(1,6)));
        this.add(new QuadradoVerde(new Posicao(3,6)));
        this.add(new QuadradoVerde(new Posicao(7,6)));
        
        this.add(new QuadradoVerde(new Posicao(6,7)));
        this.add(new QuadradoVerde(new Posicao(10,7)));
        
        this.add(new QuadradoVerde(new Posicao(7,8)));
        this.add(new QuadradoVerde(new Posicao(11,8)));
        
        this.add(new QuadradoVerde(new Posicao(2,9)));
        this.add(new QuadradoVerde(new Posicao(4,9)));
        this.add(new QuadradoVerde(new Posicao(8,9)));
        this.add(new QuadradoVerde(new Posicao(10,9)));
        
        this.add(new QuadradoVerde(new Posicao(5,10)));
        this.add(new QuadradoVerde(new Posicao(9,10)));
        
        
        this.add(new QuadradoVerde(new Posicao(2,11)));
        this.add(new QuadradoVerde(new Posicao(8,11)));
        
        
        
        //adicionar os robos no fim
        
        this.add(new RoboVermelho(new Posicao(1,10)));
        this.add(new RoboVerde(new Posicao(11,10)));
        this.add(new RoboAzul(new Posicao(11,2)));     
        this.add(new RoboAmarelo(new Posicao(3,1)));
        
    }
    //---------------------------------------------------------
    
    public void setFase2(Hero umHero){
        this.clear();
        this.add(umHero);
        //fazendo a bordinha
        this.add(new QuadradoVerde(new Posicao(0,0)));
        this.add(new QuadradoVerde(new Posicao(0,12)));
        this.add(new QuadradoVerde(new Posicao(12,0)));
        this.add(new QuadradoVerde(new Posicao(12,12)));
        
        //borda vermelha
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(i,0)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(i,12)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(0,i)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(12,i)));
        
        //estrutura vermelha fase
        for(int i=4;i<9;i=i+4)
            this.add(new QuadradoVermelho(new Posicao(2,i)));
        for(int i=4;i<9;i=i+4)
            this.add(new QuadradoVermelho(new Posicao(6,i)));
        for(int i=4;i<9;i=i+4)
            this.add(new QuadradoVermelho(new Posicao(10,i)));
        for(int i=2;i<11;i=i+2)
            this.add(new QuadradoVermelho(new Posicao(4,i)));
        for(int i=2;i<11;i=i+2)
            this.add(new QuadradoVermelho(new Posicao(8,i)));
        
        //colocar os robos
        
        this.add(new RoboVermelho(new Posicao(1,10)));
        this.add(new RoboVerde(new Posicao(11,10)));
        this.add(new RoboAzul(new Posicao(11,2)));     
        this.add(new RoboAmarelo(new Posicao(3,1)));
        
        //colocando a recompensa da fase 2
        
        this.add(new RecompensaFase2(new Posicao(2,6)));
        this.add(new RecompensaFase2(new Posicao(10,6)));
        this.add(new RecompensaFase2(new Posicao(6,2)));
        this.add(new RecompensaFase2(new Posicao(6,10)));
        
        //criar blocos que apontam para cima
        
        this.add(new BlocoMovedorCima(new Posicao(4,1)));
        this.add(new BlocoMovedorCima(new Posicao(5,1)));
        this.add(new BlocoMovedorCima(new Posicao(6,1)));
        this.add(new BlocoMovedorCima(new Posicao(7,1)));
        this.add(new BlocoMovedorCima(new Posicao(8,1)));
        
        
        this.add(new BlocoMovedorCima(new Posicao(4,7)));
        this.add(new BlocoMovedorCima(new Posicao(8,7)));
        
        this.add(new BlocoMovedorCima(new Posicao(8,9)));
        this.add(new BlocoMovedorCima(new Posicao(8,11)));
        
        this.add(new BlocoMovedorCima(new Posicao(4,9)));
        this.add(new BlocoMovedorCima(new Posicao(5,9)));
        
        //------------------------------
        //bloco down
        this.add(new BlocoMovedorBaixo(new Posicao(4,3)));
        this.add(new BlocoMovedorBaixo(new Posicao(8,3)));
        
        this.add(new BlocoMovedorBaixo(new Posicao(4,5)));
        this.add(new BlocoMovedorBaixo(new Posicao(3,5)));
        this.add(new BlocoMovedorBaixo(new Posicao(8,5)));
        
        this.add(new BlocoMovedorBaixo(new Posicao(4,11)));
        
        //-----------------------------------------------
        //bloco esquerda
        this.add(new BlocoMovedorEsquerda(new Posicao(11,4)));
        this.add(new BlocoMovedorEsquerda(new Posicao(3,6)));
        this.add(new BlocoMovedorEsquerda(new Posicao(3,7)));
        this.add(new BlocoMovedorEsquerda(new Posicao(3,8)));
        
        this.add(new BlocoMovedorEsquerda(new Posicao(7,8)));
        
        this.add(new BlocoMovedorEsquerda(new Posicao(5,10)));
        this.add(new BlocoMovedorEsquerda(new Posicao(5,11)));
        
        //------------------------------------------------
        //bloco direita
        
        this.add(new BlocoMovedorDireita(new Posicao(1,4)));
        this.add(new BlocoMovedorDireita(new Posicao(3,4)));
        this.add(new BlocoMovedorDireita(new Posicao(5,4)));
        this.add(new BlocoMovedorDireita(new Posicao(7,4)));
        this.add(new BlocoMovedorDireita(new Posicao(9,4)));
        
                
        this.add(new BlocoMovedorDireita(new Posicao(1,8)));
        this.add(new BlocoMovedorDireita(new Posicao(5,8)));
        this.add(new BlocoMovedorDireita(new Posicao(9,8)));
        this.add(new BlocoMovedorDireita(new Posicao(11,8)));
        
        
        
        
        
        
        
    }
    public void setFase3(Hero umHero){
        this.clear();
        this.add(umHero);
        //fazendo a bordinha
        this.add(new QuadradoVerde(new Posicao(0,0)));
        this.add(new QuadradoVerde(new Posicao(0,12)));
        this.add(new QuadradoVerde(new Posicao(12,0)));
        this.add(new QuadradoVerde(new Posicao(12,12)));
                
        this.add(new RecompensaFase3(new Posicao(6,1)));
        this.add(new RecompensaFase3(new Posicao(6,3)));
        this.add(new RecompensaFase3(new Posicao(6,9)));
        this.add(new RecompensaFase3(new Posicao(6,11)));
         
         
        //borda vermelha
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(i,0)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(i,12)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(0,i)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(12,i)));
        
        for(int i=3;i<=10;i++)
            this.add(new QuadradoVermelhoLosango(new Posicao(i,2)));
        for(int i=3;i<10;i++)
            this.add(new QuadradoVermelhoLosango(new Posicao(i,10)));
        for(int i=2;i<=10;i++)
            this.add(new QuadradoVermelhoLosango(new Posicao(2,i)));
        for(int i=3;i<=10;i++)
            this.add(new QuadradoVermelhoLosango(new Posicao(10,i)));
        
        for(int i=5;i<=8;i++)
            this.add(new QuadradoVermelhoLosango(new Posicao(i,4)));
        for(int i=5;i<8;i++)
            this.add(new QuadradoVermelhoLosango(new Posicao(i,8)));
        for(int i=4;i<=8;i++)
            this.add(new QuadradoVermelhoLosango(new Posicao(4,i)));
        for(int i=5;i<=8;i++)
            this.add(new QuadradoVermelhoLosango(new Posicao(8,i)));
        this.add(new RoboAzul(new Posicao(7,1)));
        this.add(new RoboAmarelo(new Posicao(7,3)));
        this.add(new RoboVerde(new Posicao(5,9)));
        this.add(new RoboVermelho(new Posicao(5,11)));
        
        
    }
    
    public void setFase4(Hero umHero){
        this.clear();
        this.add(umHero);

        //fazendo a bordinha
        this.add(new QuadradoVerde(new Posicao(0,0)));
        this.add(new QuadradoVerde(new Posicao(0,12)));
        this.add(new QuadradoVerde(new Posicao(12,0)));
        this.add(new QuadradoVerde(new Posicao(12,12)));

        //borda vermelha
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(i,0)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(i,12)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(0,i)));
        for(int i=1;i<12;i++)
            this.add(new QuadradoVermelho(new Posicao(12,i)));

        // Quadrados Vermelhos
        this.add(new QuadradoVermelho(new Posicao(1,4)));
        this.add(new QuadradoVermelho(new Posicao(1,8)));
        this.add(new QuadradoVermelho(new Posicao(2,1)));
        this.add(new QuadradoVermelho(new Posicao(2,9)));
        this.add(new QuadradoVermelho(new Posicao(3,6)));
        this.add(new QuadradoVermelho(new Posicao(4,3)));
        this.add(new QuadradoVermelho(new Posicao(4,11)));
        this.add(new QuadradoVermelho(new Posicao(6,3)));
        this.add(new QuadradoVermelho(new Posicao(6,9)));
        this.add(new QuadradoVermelho(new Posicao(7,4)));
        this.add(new QuadradoVermelho(new Posicao(8,1)));
        this.add(new QuadradoVermelho(new Posicao(9,2)));
        this.add(new QuadradoVermelho(new Posicao(9,8)));
        this.add(new QuadradoVermelho(new Posicao(9,11)));
        this.add(new QuadradoVermelho(new Posicao(11,2)));

       // Quadrados Verdes
       this.add(new QuadradoVerdeLiso(new Posicao(2,2)));
       this.add(new QuadradoVerdeLiso(new Posicao(2,4)));
       this.add(new QuadradoVerdeLiso(new Posicao(2,6)));
       this.add(new QuadradoVerdeLiso(new Posicao(2,8)));
       this.add(new QuadradoVerdeLiso(new Posicao(2,10)));
       this.add(new QuadradoVerdeLiso(new Posicao(3,3)));
       this.add(new QuadradoVerdeLiso(new Posicao(3,5)));
       this.add(new QuadradoVerdeLiso(new Posicao(3,7)));
       this.add(new QuadradoVerdeLiso(new Posicao(3,9)));
       this.add(new QuadradoVerdeLiso(new Posicao(4,2)));
       this.add(new QuadradoVerdeLiso(new Posicao(4,4)));
       this.add(new QuadradoVerdeLiso(new Posicao(4,6)));
       this.add(new QuadradoVerdeLiso(new Posicao(4,8)));
       this.add(new QuadradoVerdeLiso(new Posicao(4,10)));
       this.add(new QuadradoVerdeLiso(new Posicao(5,3)));
       this.add(new QuadradoVerdeLiso(new Posicao(5,5)));
       this.add(new QuadradoVerdeLiso(new Posicao(5,7)));
       this.add(new QuadradoVerdeLiso(new Posicao(5,9)));
       this.add(new QuadradoVerdeLiso(new Posicao(6,2)));
       this.add(new QuadradoVerdeLiso(new Posicao(6,4)));
       this.add(new QuadradoVerdeLiso(new Posicao(6,6)));
       this.add(new QuadradoVerdeLiso(new Posicao(6,8)));
       this.add(new QuadradoVerdeLiso(new Posicao(6,10)));
       this.add(new QuadradoVerdeLiso(new Posicao(7,3)));
       this.add(new QuadradoVerdeLiso(new Posicao(7,5)));
       this.add(new QuadradoVerdeLiso(new Posicao(7,7)));
       this.add(new QuadradoVerdeLiso(new Posicao(7,9)));
       this.add(new QuadradoVerdeLiso(new Posicao(8,2)));
       this.add(new QuadradoVerdeLiso(new Posicao(8,4)));
       this.add(new QuadradoVerdeLiso(new Posicao(8,6)));
       this.add(new QuadradoVerdeLiso(new Posicao(8,8)));
       this.add(new QuadradoVerdeLiso(new Posicao(8,10)));
       this.add(new QuadradoVerdeLiso(new Posicao(9,3)));
       this.add(new QuadradoVerdeLiso(new Posicao(9,5)));
       this.add(new QuadradoVerdeLiso(new Posicao(9,7)));
       this.add(new QuadradoVerdeLiso(new Posicao(9,9)));
       this.add(new QuadradoVerdeLiso(new Posicao(10,2)));
       this.add(new QuadradoVerdeLiso(new Posicao(10,4)));
       this.add(new QuadradoVerdeLiso(new Posicao(10,6)));
       this.add(new QuadradoVerdeLiso(new Posicao(10,8)));
       this.add(new QuadradoVerdeLiso(new Posicao(10,10)));

       // Adicionando Robos
       this.add(new RoboVermelho(new Posicao(11,6)));
       this.add(new RoboVerde(new Posicao(6,1)));
       this.add(new RoboAzul(new Posicao(6,11)));     
       this.add(new RoboAmarelo(new Posicao(1,6)));

       // Adicionando Colecionaveis
       this.add(new RecompensaFase4(new Posicao(1,1)));
       this.add(new RecompensaFase4(new Posicao(11,11)));
       this.add(new RecompensaFase4(new Posicao(1,11)));
       this.add(new RecompensaFase4(new Posicao(11,1))); 
    }

    
}
