/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
          int cant;
          int[] califas;//aqui el arreglo no existe
          System.out.println("Cualtas calificaciónes quieres capturar?: ");
          cant = sc.nextInt();
          // ya que sabemos cuantas califas necesitamos, creamos el arreglo
          califas = new int [cant];// creamos el arreglo
          
          for (int i = 0; i < cant ; i++) {
              System.out.println("Introduce la calificación: ");
              califas[i] = sc.nextInt();
            
        }
          for (int i = 0; i < cant ; i++) {

              System.out.print("["+califas[i]+"]");
            
        }
          
          
    }
    
}
