
package Actividad10_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author cyn
 */
public class Prueba {
    public static void main(String[] args) {
        BufferedReader in=null; //variable para leer el fichero
        
        try { //si algo falla, pasara a catch
            in =new BufferedReader(new FileReader("Numeros.txt"));
            Scanner entradaDatos;
            double num;
            double suma=0;
            String linea=in.readLine();
            while (linea!=null){
                entradaDatos=new Scanner(linea).useLocale(Locale.US);
                if (entradaDatos.hasNextDouble()){
                    num=entradaDatos.nextDouble(); //almacena cada número decimal
                    suma+=num; //se acumula la suma de los numeros decimales
                }
                linea=in.readLine(); //lee las lineas del archivo
            } //fin del bucle
            System.out.println("suma " + suma);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException ex){
                    System.out.println(ex);
                }
            }
        }
    }
}
