/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

/**
 *
 * @author T-107
 */
public class Rectangulo {
     private float ladoMayor;
     private float ladoMenor;

    public Rectangulo() {
    }

    public Rectangulo(float ladoMayor, float ladoMenor) {
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
public float calcularArea(){
    return ladoMayor*ladoMenor;
}
    /**
     * @return the ladoMayor
     */
    public float getLadoMayor() {
        return ladoMayor;
    }

    /**
     * @param ladoMayor the ladoMayor to set
     */
    public void setLadoMayor(float ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    /**
     * @return the ladoMenor
     */
    public float getLadoMenor() {
        return ladoMenor;
    }

    /**
     * @param ladoMenor the ladoMenor to set
     */
    public void setLadoMenor(float ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
    
}
