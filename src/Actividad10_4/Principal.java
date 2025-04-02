package Actividad10_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cynthia.cartru
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("NumerosReales.txt"));
            String texto = in.readLine();
            String subcadenas[] = texto.split(" "); //patron que establece la separacion de los strings
            double suma = 0;
            for (int contador = 0; contador < subcadenas.length; contador++) {
                suma += Double.valueOf(subcadenas[contador]);
            }
            
            System.out.println("Suma " + suma + " media " + suma/subcadenas.length);
        }
            catch (IOException ex){
                    System.out.println(ex.getMessage());
             } finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
