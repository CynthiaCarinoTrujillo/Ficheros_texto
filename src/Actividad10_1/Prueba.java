
package Actividad10_1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cynthia.cartru
 */
public class Prueba {
    
    //metodo integer que pide un entero x consola y el teclado lo lee y devuelve
    static Integer leerEntero(){
         Scanner entradaDatos=new Scanner(System.in);
        Integer num;
        //mientras num sea distinto de un numero entero
            try {
                System.out.println("Introduzca un entero");
                num=entradaDatos.nextInt();
                entradaDatos.nextLine();
                
            } catch (InputMismatchException ex){
                System.out.println("Datos erroneos");
                num=leerEntero();
            }
        
        return num; 
    }
    
    public static void main(String[] args) {
        
        System.out.println("Introduce los datos");
        leerEntero();
        
    }
}
