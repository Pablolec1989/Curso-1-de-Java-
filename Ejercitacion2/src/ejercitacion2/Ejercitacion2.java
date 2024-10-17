
package ejercitacion2;
import java.util.Scanner;


public class Ejercitacion2 {

    public static void main(String[] args) {
        
        //*** Gestion de Merceria mayorista *** 
        
        //1ra consigna: 
        //Menos de 5 paquetes ---> no vende.
        //Entre 5 y 15 paquetes ---> 10 USD de envio.
        //Mayor a 15 ---> Envio gratis.
        
        //2da consigna:
        //https://youtu.be/qxXcI56NfnE?t=10249
        
        //Desclaracion de variables
        int cantPaquetes;
        double montoTotal, diferencia,descuento,totalconDesc;
        
        Scanner teclado = new Scanner(System.in);
        
        //Consulta al usuario la cantidad de paquetes
        System.out.println("Ingrese la cantidad de paquetes: ");
        cantPaquetes = teclado.nextInt();
        
        
        if(cantPaquetes<5){
            if(cantPaquetes<0){
                System.out.println("No se permiten compras con valores negativos");
            }else{
                System.out.println("No se permiten ventas minoristas menores a 5");
            }
        }else{
                //Solicito al usuario el monto:
                System.out.println("Ingrese el monto total de la compra: ");
                teclado = new Scanner(System.in);
                montoTotal = teclado.nextDouble();
                
            if(cantPaquetes>=5 && cantPaquetes<=15){
                System.out.println("El costo del envio es de 10USD");
                montoTotal = + 10;
            }else{
                System.out.println("El envío es gratis");
            }
            if(montoTotal < 100){
                diferencia = 100-montoTotal;
                System.out.println("El monto es menor a 100 ud no posee promociones, "
                        + "necesita comprar: $USD "+ diferencia + ". más para entrar en Promo");
            }else{
                if(montoTotal>=100 && montoTotal<=300){
                    descuento = montoTotal*0.05;
                    totalconDesc = montoTotal - descuento;
                    System.out.println("Por su compra tiene un 5% de descuento que corresponde a: $USD " + descuento + " El monto total con descuento es de: $USD" + totalconDesc);
                }else{
                    descuento = montoTotal*0.10;
                    totalconDesc = montoTotal - descuento;
                    System.out.println("Por su compra tiene un 10% de descuento que corresponde a: $USD " + descuento + " El monto total con descuento es de: $USD" + totalconDesc);
                }
            }
        }
    }
    
}
