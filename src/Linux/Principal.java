
package Linux;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author cyn
 */
public class Principal {
    public static void main(String[] args) {
        
        String nombreArchivo = "prueba.txt"; //inicializarlo..a prueba
        final int lineasTotales= 24; 
        int contadorLineasMostradas=0;

        try {
            //se le pasa el string del nombre del archivo
            File archivo = new File(nombreArchivo);
            Scanner lectorFichero = new Scanner(archivo);
            Scanner pausa=new Scanner(System.in);//scanner auxiliar para la pausa
            
            while (lectorFichero.hasNextLine()) { //linea a linea
                
                String linea = lectorFichero.nextLine();
                System.out.println(linea);
                contadorLineasMostradas++;

                //pausa después de mostrar 24 líneas
                if (contadorLineasMostradas == lineasTotales) {
                    System.out.println("-----");
                    System.out.println("Presione enter si quiere continuar...");
                    pausa.nextLine();
                    
                }
            }

            lectorFichero.close();
            pausa.close();

        } catch (Exception ex) {
            System.out.println("esto es catch" + ex.getMessage());
        }
    }
}

