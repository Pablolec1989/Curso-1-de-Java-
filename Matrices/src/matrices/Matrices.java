
package matrices;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        
        int matriz [][] = new int [3][3];
        Scanner teclado = new Scanner(System.in);
        
        //Recorrido y carga de matrices.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para la fila: " +i+ " columna: " +j);
                matriz[i][j] = teclado.nextInt();                
            }
        }
        
        //Recorrido y carga de matrices.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Fila " +i+ " columna: " +j+ " Valor: " +matriz[i][j]);              
            }
        }
        
        
    }
    
}
