/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_22_DO_WHILE {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        Scanner Sc = new Scanner (System.in);
        
        
        String usuario;
        String pwd;

         do{
             System.out.println("Introduce el usuario: ");
             usuario = Sc.nextLine();
             System.out.println("Introduce la contraseña: ");
             pwd = Sc.nextLine();
         } while((!usuario.equals(NOMBRE_USUARIO)) || (!pwd.equals(PASSWORD))); 
         
        System.out.println("Bienvenido al sistema!!");
        
    }
    
}
