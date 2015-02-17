/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

/**
 *
 * @author T-301
 */
public class Cuadrado {
      private float lado;
      /**
       * Este constructor tiene un argumento de tipo flotante
       * @param lado El parametro que debes ingresar es el valor
       * del lado de tu cuadrado
       * 
       */
      public Cuadrado(float lado){
          this.lado=lado;
       }
      public Cuadrado(){
          
      }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}


