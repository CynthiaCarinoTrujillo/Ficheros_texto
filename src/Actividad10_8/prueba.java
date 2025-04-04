package Actividad10_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cynthia.cartru
 */
public class prueba {

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        /*escribir un programa que duplique el contenido de un fichero
        cuyo nombre se pide al usuario. EL fichero copia tendra el mismo nombre
        con prefijo copia_de_
         */
        System.out.println("Escriba el nombre del fichero a copiar ");

        String ficherosolicitado = entradaDatos.nextLine().trim();
        //tenemos el nombre del fichero, ahroa debemos crear la copia
        String nombreCopia = "Copia_de_" + ficherosolicitado;
//        System.out.println(nombreCopia);

        try {
            BufferedReader lectura = new BufferedReader(new FileReader(ficherosolicitado));
            BufferedWriter nuevo = new BufferedWriter(new FileWriter(nombreCopia));
            //leer el fichero original linea a linea
            lectura.read();
          
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
