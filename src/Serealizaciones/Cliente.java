/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serealizaciones;
import java.io.Serializable;
/**
 *
 * @author Usuario
 */
public class Cliente implements Serializable{
    private String nombre;
   private float sueldo;
   private Dirreccion dirreccion;

    public Cliente(String nombre, float sueldo, Dirreccion dirreccion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.dirreccion = dirreccion;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public Dirreccion getDirreccion() {
        return dirreccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setDirreccion(Dirreccion dirreccion) {
        this.dirreccion = dirreccion;
    }

   
}
