/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva15_promedio_califa;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA15_PROMEDIO_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantCali;
        
        int sumaCalifa = 0;

        
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce el número de calificaciones a capturar");
        cantCali = Sc.nextInt();
            
            //ACOMULADOR
        
        for (int i = 0; i < cantCali; i++) {
            System.out.println("Introduce la calificación: ");
            int califa = Sc.nextInt();
            sumaCalifa = sumaCalifa + califa;
        }
        double promedio = sumaCalifa / (cantCali * 1.0) ;
        System.out.println("LA SUMATORIA ES = "+sumaCalifa);
        System.out.println("El promedio de calificaciones es = "+promedio);
        
    }
    
}
