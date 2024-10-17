package ejercitacion4;

import java.util.Scanner;

/**
 *
 * @author LECCESE
 */
public class Ejercitacion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String palabra = "";
        Scanner teclado = new Scanner(System.in);
        palabra = teclado.nextLine();
        System.out.println("Ingrese la palabra: ");

        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("Tu palabra es: ");
        }
        System.out.println("Gracias por usar el programa");

    }

}
