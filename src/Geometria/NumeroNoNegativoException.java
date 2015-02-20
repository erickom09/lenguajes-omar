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
import java.lang.Exception;//importa java lang pero como el programa ya lo tiene no es necesario
public class NumeroNoNegativoException extends Exception {//Hereda la clase Exception
    public NumeroNoNegativoException(){
        super("Losiento pero no acepto valores negativos");
    }
    
}
