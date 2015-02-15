/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    private int ladoMayor;
    private int ladoMenor;
    public void setLadoMayor(int ladoMayor){
        this.ladoMayor=ladoMayor;
    }
    public void setLadoMenor(int ladoMenor){
        this.ladoMenor=ladoMenor;
    }
    public int getLadoMayor(){
    return ladoMayor;
}
    public int getLadoMenor(){
        return ladoMenor;
    }
    public Rectangulo(){
    }
    public Rectangulo(int LadoMayor,int LadoMenor){
        this.ladoMayor=ladoMayor;
        this.ladoMenor=ladoMenor;
    }
}
