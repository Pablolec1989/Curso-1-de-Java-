package ejercicio.arrays;
import java.util.Scanner;

/**
 *
 * @author LECCESE
 */
public class EjercicioArrays {

    public static void main(String[] args) {
        
        int numeros [] = new int[8];
        Scanner teclado = new Scanner(System.in);
        
        /*numeros[0]=15;
        numeros[1]=35;
        numeros[2]=22;
        numeros[3]=14;
        numeros[4]=64;
        numeros[5]=61;
        numeros[6]=91;
        numeros[7]=13;*/
        
        //Bucle de lectura de datos en Array.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Estoy en el indice: "+i+" y el valor es: "+ numeros[i]);
        }
        
        //Bucle de carga de datos en Array.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor para el indice: "+i);
            numeros[i] = teclado.nextInt();
        }
        
        System.out.println("Los valores ingresados fueron: ");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("En el indice "+i+" el dato corresponde a: " + numeros[i]);
        }
    }
    
}
