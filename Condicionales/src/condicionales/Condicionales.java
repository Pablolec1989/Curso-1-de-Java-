package condicionales;
import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        edad = teclado.nextInt();
        
        if(edad >18){
            System.out.println("Sos mayor de edad!");
        }else{
            if(edad==18){
                System.out.println("Tenes 18 años!");
            }else{
                System.out.println("Sos menor de edad");
            }
        }
    }
}
