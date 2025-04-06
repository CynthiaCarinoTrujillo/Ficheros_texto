
package ejercicio10_12;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cyn
 */
public class principal {
    public static void main(String[] args) {
        
        Scanner entradaDatos= new Scanner(System.in);

        //datos del usuario, nombre y edad
        System.out.print("Ingresa tu nombre: ");
        String nombre = entradaDatos.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad = entradaDatos.nextInt();

        //fichero donde se guardaran los datos del usuario
        String nombreFichero = "datos.txt";

        //ahora debemos escribir los datos en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero, true))) {
            //escribir datos en una linea
            writer.write("Nombre: "+ nombre + " Edad: " + edad + "\n");
//            writer.newLine(); //linea despues de los datos
            System.out.println("Datos guardados");
        } catch (IOException ex) {
            System.err.println("Error en catch " + ex.getMessage());
        } finally {
            entradaDatos.close();
        }
    }
}
 