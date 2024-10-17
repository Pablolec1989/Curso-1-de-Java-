package ejercitacion1;

import java.util.Scanner;

public class Ejercitacion1 {

    public static void main(String[] args) {
        //Creamos un programa para que, segun la edad del alumno,
        //el sistema informe el horario que le corresponde.

        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("***** BIENVENIDOS A ENGLISH SCHOOL *****");
        System.out.println("Ingrese la edad del alumno: ");
        edad = teclado.nextInt();

        if (edad >= 4 && edad <= 6) {
            System.out.println("El horario del grupo 'Kinder' es Lunes y Miercoles de 16 a 17hs");
        } else {
            if (edad >= 7 && edad <= 8) {
                System.out.println("El horario del grupo '1st Year' es Martes y Jueves de 16.30 a 17.30hs");
            } else {
                if (edad >= 9 && edad <= 10) {
                    System.out.println("El horario del grupo '2nd Year' es Martes y Jueves de 17.30 a 19hs");
                } else {
                    if (edad >= 11 && edad <= 13) {
                        System.out.println("El horario del grupo '3rd Year' es Lunes y Miercoles de 17 a 18.30");
                    } else {
                        System.out.println("Ingreso una edad no válida");
                    }
                }
            }
        }

    }

}
