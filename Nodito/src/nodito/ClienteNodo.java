/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodito;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author berro
 */
public class ClienteNodo {
    static final String HOST = "localhost";
  DataInputStream in;
  DataOutputStream out;
  DataOutputStream out2;    
  String s = "";
  String resultado = ""; 

  public void Cliente(int PUERTO, String send, String num) {
int i = 0;
    try{
        

    Socket skCliente = new Socket( HOST , PUERTO );
        
      in = new DataInputStream(skCliente.getInputStream());
      out = new DataOutputStream(skCliente.getOutputStream());

      //S ES LA OPERACION CON SIGNO
      out.writeUTF(send+"="+num);  
      
      //RESULTADO
      //resultado = in.readUTF();
      
     
      skCliente.close();
    } catch( Exception e ) {

      System.out.println( e.getMessage() );

    }
  }
  
public void GetOP(String aux)
{
    this.s = aux; 
}

public String Resultado()
{
    return this.resultado; 
}
}
