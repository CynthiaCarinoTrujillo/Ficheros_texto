
package Actividad;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author cynthia.cartru
 */
public class Prueba {
    public static void main(String[] args) throws ExceptionEdadNegativa {
        try {
            Scanner entradaDatos=new Scanner(System.in);
            System.out.println("Introduzca una edad");
            int edad=entradaDatos.nextInt();
            if (edad < 0){
                //si la edad es menor a 0 lanzara la excepcion creada
                throw new ExceptionEdadNegativa(); //crea instancia
            } else { //si la edad es mayor que 0 imprimimos edad correcta
                System.out.println("Edad correcta: " + edad);
            }
            
        } catch (InputMismatchException ex) {
            System.out.println("Datos incorrectos");
        } catch (ExceptionEdadNegativa ex1){
            System.out.println(ex1);
        }
       
    }
}
