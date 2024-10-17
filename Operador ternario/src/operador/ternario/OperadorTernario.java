
package operador.ternario;
import java.util.Scanner;


public class OperadorTernario {
    
    public static void main(String[] args) {
        //Creamos un programa que dependiendo del promedio del alumno
        //nos indique si aprobo o no.
        
        //Desclaracion de variables
        double promedio;
        String condicionFinal;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el promedio del alumno: ");
        
        promedio = teclado.nextDouble();
        
        condicionFinal = (promedio>=6) ? "Aprobado" : "Desaprobado"; //Aplicacion de operador ternario.
        
        System.out.println("La condicion final del alumno es: " + condicionFinal);
        
        
    }
    
}
