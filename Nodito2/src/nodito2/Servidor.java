/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodito2;

import java.io.* ;
import java.net.* ;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.*;
import java.nio.charset.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;



/**
 *
 * @author 
 */
class Servidor extends Thread{
	int PUERTO = 8000; 
String auxi = "";
  DataInputStream in;
  DataOutputStream out;
  DataInputStream in2;
  Charset charset = StandardCharsets.UTF_8;
  String [] arr = new String[3];
  
  public void ServidorA() {
    
      
	  ServerSocket skServidor = null; 
	  int i = 0;
      
    try {
         
    	String saux = "hola";
    	double num = 0;
    	
    	while(saux != "")
    	{
    	skServidor = new ServerSocket( PUERTO );
    	  
    
    		System.out.println("Escucho el puerto " + PUERTO ); 
           	
       		Socket skCliente = skServidor.accept(); // Crea objeto

            
     
             in = new DataInputStream(skCliente.getInputStream());
             out = new DataOutputStream(skCliente.getOutputStream());
             
           
         
             arr[i] = in.readUTF();
             saux = arr[i]; 
             System.out.println("NODITO 2 GUARDA: "+ saux);
             
             i++; 
             if(i == 20)
             {
                 saux = ""; 
             }
             //out.writeUTF(String.valueOf(num));
             PUERTO++; 
             
    	}

    System.out.println("Cerrado");
    
        /* for (int j = 0; j < arr.length; j++) {
            System.out.println("QUEPEDUKI: "+ arr[j]);
        } */
   

    } catch( Exception e ) {

      System.out.println( e.getMessage() );

    }
    


  }
  


  public static void main( String[] arg ) {

		 
    
  }
  


  
      /*  @Override
      public void run() 
      { 
        ServidorA(); 
        
      }  */
  
      public void Elementos(String [] a)
      {
          this.arr = a; 
      }
      
      public String[] Relementos()
      {
          return arr; 
      }

  



public void PUERTO(int puerto)
{
	this.PUERTO = puerto;
        
        
}




}
