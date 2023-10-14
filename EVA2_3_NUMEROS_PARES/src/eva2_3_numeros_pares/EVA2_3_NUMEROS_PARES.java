/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
   int valor,residuo;
   Scanner SC = new Scanner(System.in);
   
        System.out.println("Intoruce el valor a evaluar: ");
        valor = SC.nextInt();
        
        residuo = valor % 2; //módulo, calcula el residuo;
        
        if (residuo == 0)
        System.out.println("Tu número es par");
        else
        System.out.println("Tu número es impar");
          
        
    }
    
}
