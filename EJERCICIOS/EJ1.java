/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJSegEncuentro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida dos números enteros por teclado y calcule
        la suma de los dos. El programa deberá después mostrar el resultado de la suma*/
        
       System.out.println("Escribe 2 numeros enteros");
       int num1;
       int num2;
       Scanner leer = new Scanner (System.in);
       num1 = leer.nextInt();
       num2 = leer.nextInt();
       int suma = num1 + num2; 
       System.out.println("El resultado de la suma de ambos numeros es " + suma);
       
               
        
    }
    
}
