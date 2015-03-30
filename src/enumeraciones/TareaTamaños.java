/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

/**
 *
 * @author Usuario
 */
public class TareaTamaños {
   public static void main(String[] args) {
       TiposDeTamaños tamaño=new TiposDeTamaños();
        tamaño.setTamaños(Tamaños.GRANDE);
        System.out.println("El Tipo de vaso es: "+tamaño.getTamaños());
    } 
}
