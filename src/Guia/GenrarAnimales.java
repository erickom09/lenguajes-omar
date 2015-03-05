/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia;
import java.util.*;
/**
 *
 * @author T-203
 */
public class GenrarAnimales {
        public static ArrayList<Animal> generaranimales() throws EdadNoNegativa{
        ArrayList<Animal> animales = new ArrayList<Animal>();
        
        Animal a1 = new Animal("Leon",-2);
        Animal a2 = new Animal("Delfin",6);
        
        animales.add(a1);
        animales.add(a2);
        
    return animales;
    }
    
}
