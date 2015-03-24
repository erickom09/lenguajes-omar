/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paca.barrio;

/**
 *
 * @author T-107
 */
import java.util.*;
public class ModeloGaleria {
    public static ArrayList<Galeria> generarGaleria(){
       ArrayList<Galeria> arreglo=new ArrayList<Galeria>();
       Galeria g1=new Galeria("Titulo 1","Mi descripcion 1","/paca/barrio/1.jpg");
       Galeria g2=new Galeria("Titulo 2","Descripcion 2","/paca/barrio/2.jpg");
       Galeria g3=new Galeria("Titulo 3","Descipcion 3","/paca/barrio/3.jpg");
       arreglo.add(g1);
       arreglo.add(g2);
       arreglo.add(g3);
       return arreglo;
    }
    
}
