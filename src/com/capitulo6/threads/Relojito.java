/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.threads;
import java.util.*;
/**
 *
 * @author T-301
 */
public class Relojito extends Thread{
    public void run(){
        while(true){
        try{
            Calendar cal=Calendar.getInstance();//crea una instancia o un objeto de tipo calendario
            int hora=cal.get(Calendar.HOUR_OF_DAY);
            int minuto=cal.get(Calendar.MINUTE);
            int segundo=cal.get(Calendar.SECOND);
            System.out.println("La hora es:"+hora+":"+minuto+":"+segundo);
            Thread.sleep(1000);
        }catch(Exception e){}
        } 
     }
}
