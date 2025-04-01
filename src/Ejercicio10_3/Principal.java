package Ejercicio10_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cynthia.cartru
 */
public class Principal {

    public static void main(String[] args) {
        String texto = "";
        BufferedReader in = null;

        try {
            //crear objeto y pasarle al constructor un objeto filereader
            in = new BufferedReader(new FileReader("comidasfavoritas.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto = texto + linea + '\n';
                linea = in.readLine();
            }
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
        System.out.println(texto);
    }
}
