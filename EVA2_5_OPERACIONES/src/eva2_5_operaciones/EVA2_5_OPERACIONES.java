/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_operaciones;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // OPERADIR -->SÍMBORLO QUE EJECUTA ALGUNA ACCÍON
        //SUMA --> +
        int suma, val1, val2;
        val1=100;
        val2=200;
        suma = val1 + val2;//suma aritmética
        System.out.println("SUMA---------------");
        System.out.println("la suma es = " + suma );// concatenación
        
        // resta --> -
        int resta;
        resta = val1 - val2;
        System.out.println("RESTA---------------");
        System.out.println("la resta es = "+resta);
        // multplicación --> *
        int multi;
        multi = val1 * val2;
        System.out.println("MULTIPLICACIÓN---------------");
        System.out.println("la multiplicación es =" +multi);
        //divición --> /
        int divi;
        divi = val2 / val1;
        System.out.println("DIVISIÓN---------------");
        System.out.println("La división es =" + divi);
        val1= 11;
        val2= 2;
        divi = val1 / val2;
        System.out.println("La división de 11/2 es "+divi );
        int residuo = val1 % val2;
        System.out.println("El residuo de 11/2 es =" + residuo );
        // ----
        double resu = val1 / val2;
        System.out.println("La división 11/2 = " + resu );
        double val2double = 2;
        resu = val1 / val2double;
        System.out.println("La división 11/2.0 = " + resu );
        resu = 11 / 2.0;
        //int resu2 = 11 / 2.0; //error por pérdida de información
        System.out.println("La división 11/2.0 = " + resu );
        // POTENCIA --> No hay operador de potencia
        double potencia = Math.pow(3, 3);
        System.out.println("3 elevado a la 3 es = "+potencia);
        // RAIZ --> NO HAY OPERADOR
        double raiz = Math.pow(100, 0.5);
        System.out.println("RAIZ----------------");
        System.out.println("La raiz cuadrada de 100 es ="+raiz);
        //precedencia de operadores:
        int resuOp, x = 3, y = 2, z = 5;
        resuOp = (x * z) + (x * y) / 2 - (y - z);
                //(15) + (6) / 2 - (-3)
                // 15 + 3 - (-3)
                // 15 + 3 + 3 = 21
        System.out.println("El resultado es = " + resuOp);
        // FORMULA GENERAL: 
        double resuForm, a = 3,b = 9,c = 3;
        resuForm = ((-b)- Math.pow((b*b-4*a*c), 0.5))/(2*a);
        System.out.println("El resultado es = " + resuForm);
    }
    
}
