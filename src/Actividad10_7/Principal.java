package Actividad10_7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cynthia.cartru
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        BufferedWriter escrituraEnFichero = null;
        //objeto que crea un flujo de salida de texto
        String archivo = "salida.txt";
        //informacion que queremos escribir
        String cadena1 = "En un lugar de la Macha,";

        try {
            escrituraEnFichero = new BufferedWriter(new FileWriter(archivo));

            //se escribe primera linea caracter a caracter hasta la coma
            for (int contador = 0; contador < cadena1.length(); contador++) {
                escrituraEnFichero.write(cadena1.charAt(contador));
            }
            System.out.println("Primera linea escrita");

            //segunda linea, se escribe en una sola sentencia
            cadena1 = "de cuyo nombre no quiero acordarme";
            escrituraEnFichero.newLine();
            escrituraEnFichero.write(cadena1); //escribe en el fichero una unica sentencia
            System.out.println("Segunda linea escrita");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (escrituraEnFichero != null) { //si es distinto a null contiene algo
                try { //si contiene algo, intenta cerrar 
                    escrituraEnFichero.close();
                } catch (IOException ex) { //si no puede cerrar se producira esta opcion
                    System.out.println(ex.getMessage());
                }
            }
        }

    }
}
