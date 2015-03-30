/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;
import java.util.*;
/**
 *
 * @author T-203
 */
public class GenerarSuperfices {
    public ArrayList<Superficies>obtenerFiguras()throws Exception{
        ArrayList<Superficies> figuritas= new ArrayList<Superficies>();
    Cuadrado cu1=new Cuadrado(12);
      Cuadrado cu2=new Cuadrado(14);
       Cuadrado cu3=new Cuadrado(13);
    //Crear un rectangulos
       Rectangulo rec1=new Rectangulo(10,8);
         
    //Crear dos trinagulos
       Triangulo tr1=new Triangulo(5,10);
       Triangulo tr2=new Triangulo(7,14);
       
    //Crear dos Circulos
       Circulo cir1=new Circulo(5);
        Circulo cir2=new Circulo(9);
        
        //Agregarlos al ArrayList
        figuritas.add(cu1);
        figuritas.add(cu2);
        figuritas.add(cu3);
        figuritas.add(rec1);
        figuritas.add(tr1);
        figuritas.add(tr2);
        figuritas.add(cir1);
        figuritas.add(cir2);
        
        return figuritas;
    }
    
}
