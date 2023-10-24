/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner (System.in);
        int califa;
        System.out.println("Cual fue tu calificación");
        califa = Sc.nextInt();
        
        if (califa < 0)
            System.out.println("Tu calificacion esta erronea no puedes tener un numero negativo");
        else if (califa < 60)
            System.out.println("F");
        else if (califa < 70)
            System.out.println("D");
        else if (califa < 80)
            System.out.println("C");
        else if (califa < 90)
            System.out.println("B");
        else if (califa <= 100)
            System.out.println("A");
        else if (califa > 100)
            System.out.println("Tu calificacion no puede ser mayor a 100");
        
        
        
        
        
        
    }
    
}
