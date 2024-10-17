/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author LECCESE
 */
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 0;
        
        while(contador<10){
            System.out.println("Estoy en la vuelta " + contador);
            contador++;
        }
        
        //Bucle while con Centinela:
        
        //Declaracion de variables:
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        //Bucle:
        while (bandera == true) {
            System.out.println("El valor de mi bandera es " + bandera);
            System.out.println("Estas actualmente registrado?" + bandera);

            System.out.println("Queres salir del registro?");
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("si")) {
                bandera = false;
            }
        }
        
    }
    
}
