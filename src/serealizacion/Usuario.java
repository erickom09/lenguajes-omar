/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizacion;

import java.io.Serializable;
/**
 *
 * @author T-107
 */
public class Usuario implements Serializable{
    String nombre;
    float sueldo;
    String email;
public Usuario (){
}
    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
