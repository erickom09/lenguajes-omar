/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private int edad;
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setedad(int edad){
        this.edad=edad;
    }
    public String getnombre(){
        return nombre;
    }
    public int getedad(){
        return edad;
    }
    
}
