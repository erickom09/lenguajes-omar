/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarSerealizado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u=new Usuario();
        u.setEmail("redplic@gmail.com");
        u.setNombre("Juan Carlos");
        u.setSueldo(40000);
        //lo guardamos
        PersisteciaUsuario per=new PersisteciaUsuario();
        try {
            per.guardar(u);
            System.out.println("Usuario guardado con exito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
 
}
