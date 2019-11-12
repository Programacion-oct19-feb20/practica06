/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjercicioUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        String provinciaOrigen;
        double costoMatricula;
        double valorRecargo;
        double costoFinalMatricula;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese provincia de origen");
        provinciaOrigen = entrada.nextLine();
        System.out.println("Ingrese costo de matricula");
        costoMatricula = entrada.nextDouble();
        
        if(provinciaOrigen.equals("Pichincha") | 
                provinciaOrigen.equals("Guayas")){
            // obtener el 12 % de la matricula
            valorRecargo = costoMatricula * 0.12;
            costoFinalMatricula = costoMatricula + valorRecargo;
            System.out.printf("Matricula de %s %s\ncon provincia de origen\n"
                    + "%s es:\n\tCosto Matrícula: %.2f\n"
                    + "\tValor recargo: %.2f\n"
                    + "\tCosto Final Matrícula: %.2f\n", 
                    nombre, apellido, provinciaOrigen, costoMatricula,
                    valorRecargo, costoFinalMatricula);
        }else{
            if(provinciaOrigen.equals("Loja") | 
                    provinciaOrigen.equals("Zamora Chinchipe")){
                // obtener el 5 % de la matricula
                valorRecargo = costoMatricula * 0.05;
                costoFinalMatricula = costoMatricula + valorRecargo;
                System.out.printf("Matricula de %s %s\ncon provincia de origen\n"
                    + "%s es:\n\tCosto Matrícula: %.2f\n"
                    + "\tValor recargo: %.2f\n"
                    + "\tCosto Final Matrícula: %.2f\n", 
                    nombre, apellido, provinciaOrigen, costoMatricula,
                    valorRecargo, costoFinalMatricula);
            }else{
                // agregar 10 dólares fijos
                valorRecargo = 10;
                costoFinalMatricula = costoMatricula + valorRecargo;
                System.out.printf("Matricula de %s %s\ncon provincia de origen\n"
                    + "%s es:\n\tCosto Matrícula: %.2f\n"
                    + "\tValor recargo: %.2f\n"
                    + "\tCosto Final Matrícula: %.2f\n", 
                    nombre, apellido, provinciaOrigen, costoMatricula,
                    valorRecargo, costoFinalMatricula);
            }
        }
        
        
        
    }
}
