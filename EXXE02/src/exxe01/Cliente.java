/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exxe01;

import java.io.*;
import java.net.*;
/**
 *
 * @author berro
 */
public class Cliente {
    static final String HOST = "localhost";
  //static final int PUERTO=6030;
  DataInputStream in;
  DataOutputStream out;
  DataOutputStream out2;    
  String resultado = ""; 
  public void Cliente(String pa, int PUERTO) {

    try{

      Socket skCliente = new Socket( HOST , PUERTO );

    
     
      in = new DataInputStream(skCliente.getInputStream());
      out = new DataOutputStream(skCliente.getOutputStream());

      //LO QUE MANDO 
      out.writeUTF(pa);  
      resultado = in.readUTF();
      System.out.println("RECIBE EL RESULTADO PRRO: " + resultado);
      

      skCliente.close();

    } catch( Exception e ) {

      System.out.println( e.getMessage() );

    }
  }

  public String RESULTADO()
  {
      return resultado; 
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cliente c = new Cliente();
        //String pa = ""; 
        //c.Cliente(String pa); 
        
    }
    
}


