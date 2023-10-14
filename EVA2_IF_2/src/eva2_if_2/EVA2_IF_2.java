/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_if_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_IF_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1,valor2;
        Scanner Sc = new Scanner (System.in);
        System.out.println("introduce el valor 1");
        valor1 = Sc.nextInt();
        System.out.println("introduce el valor 2");
        valor2 = Sc.nextInt();

        if(valor1 > valor2) // verdad, siempre es olbigatorio
            System.out.println("El valor mas grande es "+valor1); // concatenar cadenas de texto
        else{ // cuando el resultado es falso
            if (valor1 == valor2)
                System.out.println("Ambos valores son iguales");
            else System.out.println("El valor mas grande es "+valor2);
            
            }
        
    }
    
}
