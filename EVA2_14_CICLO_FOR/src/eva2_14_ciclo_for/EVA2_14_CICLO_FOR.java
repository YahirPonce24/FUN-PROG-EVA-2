/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_ciclo_for;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* TODO code application logic here
         for --> DESDE
         SE EJECUTA DESDE UN PUNTO HASTA OTRO
         for (punto de inicio; condición para el termino; manera de avanzar (o retroceder)
         ++ (operador de incremento en 1) le suman uno a la variable;
        int variable = 10;
        variable ++;
        System.out.println("variable");
         -- (operador de decremento en 1) le restan uno a la variable;
         += (operador de incremento en N) le suman N a la variable;
         -= (operador de decremento en N) le restan N a la variable;
        

        */
        
        for (int i = 0; i < 10; i++) 
            System.out.println(i);
        
        System.out.println("-----------------------");
        for (int i = 9; i >= 0 ; i--) 
            System.out.println(i);
        
        /*
        ---------------------------------
        NUMEROS PARES DE 0 A 100
        */
        for (int i = 0; i <= 100; i += 2)
            System.out.print(i + " - ");
    }
    
}
