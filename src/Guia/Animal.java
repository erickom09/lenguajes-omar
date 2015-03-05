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
public class Animal {
           private String nombre;
    private int edad;
    public Animal(){
        
    }
    public Animal(String nombre,int edad) throws EdadNoNegativa{
        ValidarEdad.validar(edad);
         this.nombre = nombre;
        this.edad = edad;
    }
public void setNombre(String nombre){
    this.nombre=nombre;
}    
public void setEdad(int edad){
    this.edad=edad;
}
public String getNombre(){
    return nombre;
}
public int getEdad(){
    return edad;
}
}
