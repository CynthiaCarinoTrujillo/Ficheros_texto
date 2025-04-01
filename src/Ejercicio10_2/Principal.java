
package Ejercicio10_2;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cynthia.cartru
 */
public class Principal {
    public static void main(String[] args) {
        String texto="";
        FileReader fichero=null;
        
        try {
            fichero=new FileReader("comidasfavoritas.txt");
            //leer el fichero agregado
            int lecturaf= fichero.read();
            while (lecturaf!=-1){
                texto=texto + (char)lecturaf;
                lecturaf=fichero.read();
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        } finally {
            if (fichero != null){
                try {
                    fichero.close();
                } catch (IOException ex){
                    System.out.println(ex);
                }
            }
        }
            
        System.out.println(texto);
    }
}
