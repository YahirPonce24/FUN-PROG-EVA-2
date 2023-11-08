/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_27_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_27_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaramos un arreglo que almacena 10 enteros
        // Acceso a los arreglo es aleatorio.
        // Se accede a los valores a través de un INDICE
        // Los valores almacenados tienen una dirección:
        // el primer elemento esta en la posición 0
        // el último en la posición N-1, donde N es el tamaño del arreglo
        int[] arregloEnteros = new int[10];
        //ACCEDER VALORES EN UN ARREGLO
        arregloEnteros[0]=100;
        arregloEnteros[1]=200;
        arregloEnteros[2]=300;
        arregloEnteros[3]=400;
        arregloEnteros[4]=500;
        arregloEnteros[5]=600;
        arregloEnteros[6]=700;
        arregloEnteros[7]=800;
        arregloEnteros[8]=900;
        arregloEnteros[9]=1000;
        
        System.out.println("Valor en posición 0: "+arregloEnteros[0]);
        
       /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Que arreglo deseas investigar? ");
        int i = sc.nextInt();
        System.out.println("El valor en la posición "+i+" es: "+arregloEnteros[i]);
        */
        
        String[] arregloCade = new String[5];
        
        arregloCade[0]="Hola";
        arregloCade[1]=" ";
        arregloCade[2]="Mundo";
        arregloCade[3]=" ";
        arregloCade[4]="Cruel !!!";
        
        /*Srting[] arregloCade={"Hola"," ","mundo"," ","Cruel"}*/
        
    }
    
}
