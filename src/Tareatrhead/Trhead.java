/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareatrhead;

/**
 *
 * @author Usuario
 */
public class Trhead {
    public static void main(String[] arg){
        Thread josue=new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException e){}
              System.out.println("josue");  
            }
        }
        );
        Thread Robinson=new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException e){}
                System.out.println("Robinson");
            }
        }
        );
        Thread Charly=new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    Thread.sleep(9000);
                }catch(InterruptedException e){}
                System.out.println("Charly");
            }
        }); 
        josue.start();
        Robinson.start();
        Charly.start();
    }
}
