/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle.pkgfor;

/**
 *
 * @author LECCESE
 */
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int suma = 0;
        
        for(int contador=0; contador<10; contador++){
            System.out.println("Estoy en la vuelta numero " + contador);
            
            suma= 5 + contador;
            
            //Cortar bucle anticipadamente.
            if(suma>=7){
                contador=11;
            }
        }

    }

}
