
package Actividad10_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author cyn
 */
public class Principal {
    public static void main(String[] args) {
        FileInputStream flujo=null;
        
        try {
            flujo= new FileInputStream("Enteros.txt");
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        
        Scanner entradaDatos=new Scanner(flujo);
        int contador=0;
        int suma=0;
        while (entradaDatos.hasNext()){
            int num=entradaDatos.nextInt();
            System.out.println(num + " ");
            suma+=num;
            contador++;
        }
        double media=(double)suma/contador;
        System.out.println("Suma: "+ suma + " media: "+ media);
    }
}
