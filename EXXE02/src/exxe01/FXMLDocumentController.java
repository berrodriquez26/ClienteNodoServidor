/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exxe01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author berro
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button uno;
    @FXML
    private Button dos;
    @FXML
    private Button tres;
    @FXML
    private Button seis;
    @FXML
    private Button cinco;
    @FXML
    private Button cuatro;
    @FXML
    private Button nueve;
    @FXML
    private Button ocho;
    @FXML
    private Button siete;
    @FXML
    private Button punto;
    @FXML
    private Button cero;
    @FXML
    private Button igual;
    @FXML
    private Button btn_suma;
    @FXML
    private Label resultado;
    @FXML
    private Button btn_resta;
    @FXML
    private Button btn_eliminar;
    @FXML
    private Button btn_enviar;
    @FXML
    private Button btnReset;
    @FXML
    private Button btn_stop;
    @FXML
    private Label labelresultado;
    @FXML
    private Label labelCH;
    @FXML
    private Button btn_multi;
    @FXML
    private Button btn_divi;
    @FXML
    private Button tres1;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
       
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void SUMA(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "+"; 
       resultado.setText(aux); 
    }
    
    String resul = "";
    @FXML //IGUAL 
    private void OP(ActionEvent event) {

       String s = resultado.getText();
       String aux = "";
       int j = 0;
       char operador = ' '; 
       double n =0; 
       double [] numeros = new double[2]; 
        for (int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
            {
                operador = s.charAt(i); 
                numeros[j] = Double.parseDouble(aux);
                j++; 
                aux = ""; 
            }
            else
            {
                aux = aux + s.charAt(i); 
            }
            
        }
        numeros[j]= Double.parseDouble(aux);
        
        switch ( operador) {
      case '+':
           n =  numeros[0] + numeros[1];
           break;
      case '-':
           n =  numeros[0] - numeros[1];
           break;
      case '*':
           n =  numeros[0] * numeros[1];
           break;
      case '/':
           n =  numeros[0] / numeros[1]; 
           break;
      }
        resultado.setText(Double. toString(n)); 
        resul = Double. toString(n); 
        

        
    }

    @FXML
    private void OPone(ActionEvent event) {
       String aux = resultado.getText(); 
       aux = aux + "1"; 
       resultado.setText(aux); 
       
    }

    @FXML
    private void OPtwo(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "2"; 
       resultado.setText(aux); 
    }

    @FXML
    private void RESTA(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "-"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPthree(ActionEvent event) {
       String aux = resultado.getText(); 
       aux = aux + "3"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPsix(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "6"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPfive(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "5"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPfour(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "4"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPnine(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "9"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPeight(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "8"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPseven(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "7"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPpunto(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "."; 
       resultado.setText(aux);
    }

    @FXML
    private void OPzero(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "0"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPdelete(ActionEvent event) {
        String aux = resultado.getText(); 
        if((aux != null) && (aux.length() > 0))
        {
           aux = aux.substring(0, aux.length() - 1); 
           resultado.setText(aux);
        }
        
        
    }
//CLIENTE
static final String HOST = "localhost";
static final int PUERTO=5001;
int nu = 1; 
Cliente c = new Cliente(); 
Cliente c1 = new Cliente(); 
int clicks = 9030;
int click = 0; 
String op [] = new String[10];
String res [] = new String[10]; 
    @FXML
    private void Enviar(ActionEvent event) throws InterruptedException {
       
        
       /*if(clicks == 0)
       {
      
       } */
     
             long startTime = new Date().getTime();
		 
                 c.Cliente(resultado.getText(),clicks);   
                 labelresultado.setText(c.RESULTADO());
		// ... the code being measured starts ...

		// sleep for 5 seconds
		TimeUnit.SECONDS.sleep(1);
             c.Cliente(resultado.getText(),clicks);   
            labelresultado.setText(c.RESULTADO());
		// ... the code being measured ends ... 
              op[click] = resultado.getText(); 
              res[click] = labelresultado.getText(); 
     click++; 
    clicks++; 


		
      
        
        

       /* if(clicks == 1)
       {
       c.Cliente(resultado.getText(),6031);
       c.Cliente(resultado.getText(),6021);
       labelresultado.setText(c.RESULTADO());
       } */
  
     
        System.out.println("CLICKS " + clicks);
    }

    @FXML
    private void OPreset(ActionEvent event) {
        resultado.setText(""); 
    }

    @FXML
    private void PARARCERRAR(ActionEvent event) {
        
      String [][] bidi = new String [click][7];
      int puertoc = 6030; 
      int puertos = 7000; 
      //CLIENTE //NODO RECIBE //NODO MANDA //SERVIDOR 
      String no = "";
      String cc = "";
      String ss = ""; 
           for (int i = 0; i < click; i++) {
            
            for (int j = 0; j < 7; j++) {
                
                if(j==0)
                {
                    no = String.valueOf(i+1);
                    bidi[i][j]=no;
                }
                if(j==1 || j ==2)
                {
                    cc = String.valueOf(puertoc); 
                     bidi[i][j]=cc;
                     
                }
                if(j==2)
                {
                    puertoc++; 
                }
                  if(j==3 || j==4)
                {
                    ss = String.valueOf(puertos);
                     bidi[i][j]=ss;
                    
                }
                  if(j==4)
                  {
                      puertos++; 
                  }
                  if(j==5)
                  {
                      bidi[i][j]= op[i]; 
                  }
                  
                  if(j==6)
                  {
                      bidi[i][j]= res[i]; 
                  }
               
            }
               
        }
        String aux = "";
         for (int i = 0; i < click; i++) {
            
            for (int j = 0; j < 7; j++) {
                aux = aux + bidi[i][j] + " | ";
                labelCH.setText(aux);
                
            }
            aux = aux + "\n";
            labelCH.setText(aux); 
        }
        System.out.println("CLICKS TOTAL "+ clicks);
        
    }

    @FXML
    private void OPmulti(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "*"; 
       resultado.setText(aux);
    }

    @FXML
    private void OPdivi(ActionEvent event) {
        String aux = resultado.getText(); 
       aux = aux + "/"; 
       resultado.setText(aux);
    }


    
}
