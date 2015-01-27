/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.java.cap1;

/**
 *
 * @author T-107
 */
public class AplicacionImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // primero creamo un objeto de tipo IMC
        Imc xxx= new Imc();
        //  referncia= instancia tambien se le conoce como constructor
        Float resultado=xxx.calcular(1.73f, 66);
                   //(selepone f por que es un flotante,)
      System.out.println("tu imc es :"+resultado);
    }
    
}
