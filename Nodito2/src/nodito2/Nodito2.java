/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodito2;

/**
 *
 * @author berro
 */
public class Nodito2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String [] arr = new String[4];
        Servidor s = new Servidor(); 
        
		//Servidor s1 = new Servidor(); 
		int puerto = 8000;
		s.PUERTO(puerto);   
                
     s.ServidorA();    
     arr = s.Relementos();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("OPERACIÓN " + (i+1) + "-> " + arr[i]);
        }
        
    
    
        //arr = s.RR();
       /*  System.out.println("HILO CERRADO");
               arr = s.Relementos(); 
		System.out.println(arr.length);	
                String [][] bidi = new String[arr.length][2];
                int k = 0;
                String aux = "";
                
                for (int i = 0; i < arr.length; i++) {
                    k=0;
                    for (int j = 0; j < arr[i].length(); j++) {
                        
                         if(arr[i].charAt(j)=='=')
                          {
                              bidi[i][k] = aux; 
                              k++;
                              aux = "";
                          }
                         else
                         {
                             aux = aux + arr[i].charAt(j);
                             
         
                         }
                          
                    }
                    bidi[i][k] = aux; 
                          aux = "";
        }
                
                System.out.println("OPERACION   /   RESULTADO");
		      for (int i = 0; i < arr.length; i++) {
                        
                        for (int j = 0; j < 2; j++) {
                            System.out.print(bidi[i][j]+ "         ");  
                        }
                          System.out.println("");
                    }     
     
   */
  	
    }
}