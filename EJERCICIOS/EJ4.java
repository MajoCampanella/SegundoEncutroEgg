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
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).*/
        System.out.println("Ingrese la temperatura en G Centrigrados");
        Scanner leer = new Scanner(System.in);
        float grado = leer.nextFloat();
       float F = 32 + (9 * grado / 5);
        System.out.println("Equivale a " + F + "grados Fahrenheit");
        
        
    }
    
}
