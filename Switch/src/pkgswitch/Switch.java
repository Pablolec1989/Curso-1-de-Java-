package pkgswitch;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        //Declaracion de variables
        int dia;
        String nombreDia;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 7: ");
        dia = teclado.nextInt();
                
        switch (dia) {
            case 1 -> nombreDia = "Lunes";
            case 2 -> nombreDia = "Martes";
            case 3 -> nombreDia = "Miercoles";
            case 4 -> nombreDia = "Jueves";
            case 5 -> nombreDia = "Viernes";
            case 6 -> nombreDia = "Sabado";
            case 7 -> nombreDia = "Domingo";
            default -> nombreDia = "INCORRECTO!";
        }
        System.out.println("El dia de la semana es: " + nombreDia);
        
        

    }
    
}
