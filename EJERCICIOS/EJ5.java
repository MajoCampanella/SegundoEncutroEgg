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
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().*/
        System.out.println("Ingrese un numero entero");
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3; 
        System.out.println( "El doble de su numero es " + doble +  " y el triple " + triple + " y su raiz cuadrada " + Math.sqrt(num)   );
        
    }
    
}
