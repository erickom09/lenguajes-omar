/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia;

/**
 *
 * @author T-203
 */
public class EdadNoNegativa extends Exception{
    public EdadNoNegativa(){
        super("no acepto edades negativas");
    }
    
}
