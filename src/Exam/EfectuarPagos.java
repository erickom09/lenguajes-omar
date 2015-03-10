/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author T-107
 */
public class EfectuarPagos {
 public static ArrayList<Nomina>obtenerNominas(){
     Empleado e1= new Empleado("juan",28,"01-800");
     Nomina n1 =new Nomina(e1,7000,40);
     Empleado e2= new Empleado("Ana",25,"01-800");
     Nomina n2=new Nomina(e2,7000,40);
     Empleado e3= new Empleado("Teresa",30,"01-800");
     Nomina n3 =new Nomina(e3,700,43);
 }   
}
