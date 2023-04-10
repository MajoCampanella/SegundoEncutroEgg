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
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla*/
        System.out.println("Escribe tu nombre");
        String nombre;
        Scanner leer = new Scanner (System.in);
        nombre = leer.next();
        System.out.println("Tu nombre es " + nombre);
        
    }
    
}
