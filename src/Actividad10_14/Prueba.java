
package Actividad10_14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author cyn
 */
public class Prueba {
    
    public static void main(String[] args) {
       
        String nombreFichero="carta.txt";
        
        //conteo para caracteres, líneas y palabras
        int numCaracteres = 0;
        int numLineas = 0;
        int numPalabras = 0;

        try (BufferedReader escritura= new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            //leer linea a linea del archivo
            while ((linea = escritura.readLine()) != null) {
                //contar las lineas mientras escritura encuentre lineas en el fichero
                numLineas++;        
                //contar los caracteres de la línea 
                numCaracteres += linea.length(); //.length nos daria la cantidad por linea
                
                //contar palabras por línea
                if (!linea.trim().isEmpty()) { 
                    String palabras[] = linea.trim().split("\\s+");
                    numPalabras += palabras.length;
                }
            }
        } catch (IOException ex) {
           
            System.out.println(ex.getMessage());
        }

        System.out.println("Conteo total");
        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Número de líneas: " + numLineas);
        System.out.println("Número de palabras: " + numPalabras);
    }
}

