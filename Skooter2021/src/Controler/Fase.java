/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Auxiliar.Posicao;
import Modelo.Elemento;
import Modelo.FrutaColecionavel;
import Modelo.Hero;
import Modelo.QuadradoVerde;
import Modelo.QuadradoVermelho;
import Modelo.RecompensaFase2;
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
        //this.add(new FrutaColecionavel(new Posicao(1,1)));
        //this.add(new FrutaColecionavel(new Posicao(1,11)));
        //this.add(new FrutaColecionavel(new Posicao(11,1)));
        //this.add(new FrutaColecionavel(new Posicao(11,11)));
        
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
        
        
    }
    public void setFase3(Hero umHero){
        this.clear();
        this.add(umHero);
        //fazendo a bordinha
        this.add(new QuadradoVerde(new Posicao(0,0)));
        this.add(new QuadradoVerde(new Posicao(0,12)));
        this.add(new QuadradoVerde(new Posicao(12,0)));
        this.add(new QuadradoVerde(new Posicao(12,12)));
        //this.add(new FrutaColecionavel(new Posicao(1,1)));
        this.add(new FrutaColecionavel(new Posicao(1,2)));
        
    }
    
}
