/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

/**
 *
 * @author T-301
 */
public class ProbarConstructores {
/*1 public static void main(String args[]){
byte b=2;
short s=2;
int i=2;
long l=2;
b=(byte)s;//marca error por que el short es una cantidad mas grande que el byte 
        s=b;//esta es correcta
i=s;
b=(byte) l;//castin explicito
l=i;//casting implicito
s=(short)i;
b=(byte)s;
s=(short)l;
l=s;
b=(byte)i;
b=(byte)s;
i=b;

        

                                        
}*/
    
    public static void main(String args[]){
        float f=45;
        //float f2=45.2;si usted pone en un decimal java lo convierte en double y entonces no cave por que double es mas grande
        //float f2=45.2f;es la solución del anterior
        double dedos=45.2;
        int i2=300;
        Cuadrado c=new Cuadrado((float)dedos);//se le pone un cating dentro para que acepte el dedos
    } 
           
}
