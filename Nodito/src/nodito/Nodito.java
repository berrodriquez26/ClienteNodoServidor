/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodito;
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
class Nodito extends Thread{

  //static final int PUERTO=6030;
  DataInputStream in;
  DataOutputStream out;
  DataInputStream in2;
  Charset charset = StandardCharsets.UTF_8;
  String op = "";
  String operacion = "";
  int port1 = 0;
  int port2=8000; 
  int portS = 0; 
  int jj = 0; 
  String resul = "";
  String numero = ""; 
  String aa = "";
  public void Servidor(int PUERTO){
	  int [] a = new int [3]; 
	  ServerSocket skServidor = null; 
      int b = 0;
    try {

      skServidor = new ServerSocket( PUERTO );

      System.out.println("Escucho el puerto " + PUERTO );
      
    
          
      
  while(true)
      {
             Socket skCliente = skServidor.accept(); // Crea objeto

        
            in = new DataInputStream(skCliente.getInputStream());
            out = new DataOutputStream(skCliente.getOutputStream());  
           out.writeUTF(operacion);
           String s = this.convertA(in, charset); 
           op = s; 
           skServidor.close();
          
      }
        
      	

    } catch( Exception e ) {

      System.out.println( e.getMessage() );

    }
    
    


  }
  

public void OP(String se)
    {
        this.operacion = se; 
    }


  @Override
  public void run()
{
    String arr[] = new String [10]; 
    int i = 0; 
   
     Nodito s = new Nodito(); 
    do {
        String op = "";
    s = new Nodito(); 
    Cliente c = new Cliente();
    ClienteNodo c1 = new ClienteNodo();
    //Cliente c2 = new Cliente(); 
    //RECIBE LA OPERACIÓN 
    s.Servidor(port1);
    
    //MANDA EL RESULTADO AL SERVIDOR PARA QUE HAGA LA OPEACIÖN 
    c.GetOP(s.Regresar());
    resul = s.Regresar();
    c.Cliente(portS);
    
    //c2.Cliente(8000);
    System.out.println("LA OPERACIÖN A MANDAR ES: " + s.Regresar());
    System.out.println(c.Resultado());
    
    //MANDA EL RESULTADO AL CLIENTE (CALCULADORA)
    s.OP(c.Resultado());    
    
    s.Servidor(port1);
    c1.Cliente(port2, s.Regresar(), c.Resultado());
    portS++; 
    port1++; 
    port2++;
    } while (s.Regresar() != "");
    
      
    
    
    
    //MANDA EL RESULTADO AL CLIENTE (CALCULADORA)
}
  
 
  
  public void Puertos(int a, int c)
  {
      this.port1 = a;
      this.portS = c;
        
  }
  
  public String Resul()
  {
      return op; 
  }
  
  public String Numero()
  {
      return numero; 
  }
  public static void main( String[] arg ) {
      
      
   Nodito n = new Nodito(); 
     Nodito n1 = new Nodito();
     Cliente c = new Cliente(); 
 String num = "";
      int port1 = 6030;
      int port2 = 9030;
     String aux = "";
     n.Puertos(port1,7000);
     n1.Puertos(port2, 7050);
       n.start();
       n1.start(); 
       System.out.println("VALOR " + port1);

       
     // port1++;
   
     
     
  //Scanner scn = new Scanner(System.in);
  //String palabra = "";
     //n1.Puertos(6031, 6021, 7001);
   
         
        
       
         
          
          
          //n1.start(); 
    
     //n1.start();  
   
      
   
  
      
  }
  

  public String Regresar()
  {
      return op; 
  }

public String convertA(InputStream inputStream, Charset charset) throws IOException {
 
	try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, charset))) {
		return br.lines().collect(Collectors.joining(System.lineSeparator()));
	}
}

}
