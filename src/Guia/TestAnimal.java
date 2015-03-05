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
public class TestAnimal {
  public static void main(String[] args) {
        
        try{
    
    for(Animal a:GenrarAnimales.generaranimales()){
            System.out.println(a.getNombre());
        }
    
   
    }
    catch(Exception e){
        System.out.println(e.getMessage());
       
    }
    
       
    }
    
}
