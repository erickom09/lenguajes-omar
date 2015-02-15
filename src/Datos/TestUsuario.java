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
public class TestUsuario {
    public static void main(String args[]){
      Usuario xxx=new Usuario();  
      xxx.setnombre("omar");
      xxx.setedad(21);
      System.out.println(xxx.getnombre());
      System.out.println(xxx.getedad());
    }
}
