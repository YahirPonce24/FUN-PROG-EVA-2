/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_CICLOS_ANIDADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nume;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        nume = Sc.nextInt();
        
        for (int i = 1; i <= nume; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int k = nume; k >= 1; k--) {
            for (int l = k; l >= 1; l--) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
        
    }
    
}
