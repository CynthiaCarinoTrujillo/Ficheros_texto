
package Ejercicio10_11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author cyn
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner entradaDatos=new Scanner(System.in);
        
        //solicitar el archivo
        System.out.print("Ingrese el nombre del archivo | presione enter para usar el fichero predeterminado (prueba.txt): ");
        String nombreFichero= entradaDatos.nextLine().trim();
        
        //si el usuario pulsa enter se debe usar el fichero prueba.txt
        if (nombreFichero.isEmpty()) { //el nombre del fichero al "estar vacio" se le asigna el nombre "prueba"
            nombreFichero = "prueba.txt";
           
        }
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) { //intentara leer el archivo
            System.out.println("Fichero: " + nombreFichero );
            String linea;
            //bucle que ira leyendo cada línea del fichero
            while ((linea = reader.readLine()) != null) { //mientras linea sea diferente a null, imprimira
                System.out.println(linea);
            }
        } catch (IOException ex) {
            //excepción en caso de que el archivo no se pueda leer
            System.err.println("Error (en catch)" + ex.getMessage());
        } finally {
            
            entradaDatos.close();
        }
    }
}
        
        
   