/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercitacion3;

import java.util.Scanner;

/**
 *
 * @author LECCESE
 */
public class Ejercitacion3 {
    
    //Realizar un programa que ponga un limite numerico y muestre por pantalla
    //todos los numeros hasta ese limite (empezando por 1)
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero limite: ");
        numero = teclado.nextInt();
        
        for (int i = 0; i < numero; i++) {
            System.out.println("Voy en la vuelta.." + (i+1));
        }
    }
    
}
