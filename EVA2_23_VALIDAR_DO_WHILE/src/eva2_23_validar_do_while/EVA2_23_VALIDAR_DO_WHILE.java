/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_23_validar_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_23_VALIDAR_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner Sc = new Scanner (System.in);
             
             String valor;
             do {
                 System.out.println("Introduce un valor entero: ");
                    valor = Sc.nextLine(); 
                    if (valor.matches("[0-9]{1,10}")){ /*El if comprueba si el numero introducido esta entre 0,1,2,3,4,5,6,7,8,9 con los corchetes
                                                            Los parentesis compueban que el numero sea una cifra de 1 a 10 dijitos*/
                    int numero = Integer.parseInt(valor);
                        System.out.println("El numero introducido es "+numero);
                        break;
                    }
                    else {

                        System.out.println("intenta de nuevo con un numero entero :D ");
                        System.out.println("------------------------------------------");
                    }
                    }while (true);
             
             
        
    }
    
}
