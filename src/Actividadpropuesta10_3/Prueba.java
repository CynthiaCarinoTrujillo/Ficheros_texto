package Actividadpropuesta10_3;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Locale;

/**
 *
 * @author cyn
 */
public class Prueba {

    public static void main(String[] args) {

        // Variables para sumar edades, estaturas y contar jugadores
        int sumaEdades = 0;
        double sumaEstaturas = 0.0;
        int cantidadJugadores = 0;

        try {
            //objeto que representa el archivo jugadores
            File archivo = new File("Jugadores.txt");
            Scanner lector = new Scanner(archivo).useLocale(Locale.US);
            //lector Scanner que se encargara de leer el archivo por eso se lo pasamos
            
            //mientras haya datos que leer en el archivo sigue en el bucle,
            while (lector.hasNext()) { //hasNext va comprobando si hay más datos
            //declaramos variables y en cada una, el scanner se encargara de almacenar segun el tipo de dato que sea
                String nombre = lector.next(); //lee el string del documento en este caso, los nombres
                int edad = lector.nextInt(); //lee la edad 
                double estatura = lector.nextDouble(); //lee la estatura que es en double
                
                //sacar los promedios
                sumaEdades=sumaEdades+ edad;
                sumaEstaturas=sumaEstaturas+ estatura;
                cantidadJugadores++;
            }
            
            lector.close(); //hasNext se cierra

                double promedioEdad = sumaEdades / cantidadJugadores;
                double promedioEstatura = sumaEstaturas / cantidadJugadores;
                System.out.println("Edad promedio: " + promedioEdad + " años");
                System.out.println("Estatura promedio: " + promedioEstatura + " metros");

        } catch (Exception ex) {
            System.out.println("error, esto es catch " + ex.getMessage());
        }
    }
}
