/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_25_continue;

/**
 *
 * @author invitado
 */
public class EVA2_25_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 1; i <= 15; i++) {
            
            if (i == 7 )
                continue;  // continue--> Interrumpe la interacción actual
            System.out.print(i + " - ");
            System.out.println("");
        }
        for (int i = 1; i <= 15; i++) {
            
            if (i == 7 )
                break;  // break--> Detiene por completo la ejecucion del ciclo
            System.out.print(i + " - ");
            System.out.println("");
        }
        for (int i = 1; i <= 20; i++) {
            if ((i % 2)!= 0)
                continue;
            System.out.print(i + " - ");
            
            
        }
        
    }
    
}
