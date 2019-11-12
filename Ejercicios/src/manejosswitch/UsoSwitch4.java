/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena que empiece con una vocal");
        String nombre = entrada.nextLine();
        char valor = nombre.charAt(0);
                
        switch(valor){
            case 'a':
            case 'e':
            case 'o':    
            case'A':
                System.out.printf("Nombre con inicial (%s) - vocal %s - %s\n", 
                       valor, "abierta", nombre.toUpperCase());
                break;
            
            case 'i':
            case 'u':
                System.out.printf("Nombre con inicial (%s) - vocal %s - %s\n", 
                        valor, "cerrada", nombre.toLowerCase());
                break;    
            
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
