/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int califa;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la calificación: ");
        califa = sc.nextInt();
        
        if (califa >= 70){// if (expresion a evaluar)
            //Este bloque siempre es verdad!!!
            // Las llaves se usan cuando son más de una instrucción
            // dentro del id. si es una sola, no se usan
        System.out.println("Aprobado: viaje a Cancún");//pertenece al if
        System.out.println("Felicidades!!");// no le pertenece al if50
        } else //else --> si no. ES OPCIONAL!!!
            // ESTE BLOQUE SIEMPRE ES FALSO!!!
            System.out.println("NO ACREDITADO: A PICAR PIEDRA");
        
        System.out.println("FIN DEL PROGRAMA!!!");
    }
    
}
