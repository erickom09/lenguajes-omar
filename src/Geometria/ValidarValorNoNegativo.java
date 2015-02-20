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
public class ValidarValorNoNegativo {
    public static/*es una palabra reservada para */ void
         validar(float valor)/*se valida el valor flotante del cuadrado*/throws/*es la posibilidad de lanzar*/
            NumeroNoNegativoException{//se puede mandar a llamar la insrucción  NumeroNoNegativoException
        if(valor<0)throw new NumeroNoNegativoException();//si el valor es menor a 0 manda a llamar a NumeroNoNegativoException
        
    }
    
}
