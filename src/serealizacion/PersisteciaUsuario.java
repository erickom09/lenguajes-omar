/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizacion;

import java.io.*;//sirve para guardar y leer
public class PersisteciaUsuario {
  public void guardar(Usuario u)throws Exception{
      //paso 1 que es crear el archivo
      File file=new File("D:\\archivaldo.yo");//contructor de nombre FILE indica la ruta y el nombre del archivo
  //paso 2 sacarlo(write)
      FileOutputStream fos=new FileOutputStream(file/*se encadena con el primer paso*/);
      //paso 3 llenarlo con algo ese algo es esta caso va hacer el usuario
      ObjectOutputStream oos =new ObjectOutputStream(fos);
      oos.writeObject(u/* aqui se pasa al usuario*/);//sirve para guardar un objeto serealizado
      oos.close();//con este se cierra el objeto
  } 
  
  public Usuario leer() throws Exception{
      File file=new File("D:\\archivaldo.yo");
      FileInputStream fis=new FileInputStream(file);
      ObjectInputStream ois= new ObjectInputStream(fis);
      Usuario u=new Usuario();
      u= (Usuario)ois.readObject();
      return u;
  }
  
}
