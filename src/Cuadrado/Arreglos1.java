/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadrado;

/**
 *
 * @author T-301
 */
public class Arreglos1 {
    public static void main (String args[]){
        //correcto
        int x[]=new int[3];
        int []y=new int[3];
        int z[]={1,-200,45};
        //incorrecto
        //int w=new int[];//la w tiene que llevar corchetes
        //int j[3]=new int[];//la segunda nesecita ser declarada un valor
        //int m[4]=new int[4];//no pueden ser los mismos valores del corchete
        //int []n={1,4.5,3);//tiene un dato flotante
        x[0]=127;
        x[1]=200;
        x[2]=-23;
        //X[3]=12;
        //Iterar es buscar
        for(int i=0;i<x.length;i++){//para que sepa el tamañodel arreglo
            System.out.println(x[i]);
        }
        for(int algo:x){
            System.out.println(algo);
        }
    }
    
}
