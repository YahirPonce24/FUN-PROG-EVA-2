/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_21_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        int valor
                /*Asegura que al menos una vez se ejecuten las instucciones dentro del ciclo*/;
        do{
            System.out.println("Introduce un valor: "); 
            valor =Sc.nextInt();
        }while ( valor  != 100 );
        
        
    }
    
}
