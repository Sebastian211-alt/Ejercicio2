/**
Modifica el programa anterior para que además se muestre tu dirección y
tu número de teléfono. Asegúrate de que los datos se muestran en líneas
separadas.
*/

package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */

public class Ejercio2 {

    public static void main(String[] args) {

        Scanner Lector = new Scanner(System.in);

        System.out.println("Ingrese su Nombre: ");
        String Nombre = Lector.nextLine();

        System.out.println("Ingrese su edad: ");
        String Edad = Lector.nextLine();

        System.out.println("Su nombre es: " + Nombre + " , " + "Su edad es: " + Edad);

        System.out.println("===============================================================");
        
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Ingrese su Direccion: ");
        String Direccion = Entrada.nextLine();
        
        System.out.println("Su Direccion es: " + Direccion);
        
        System.out.println("===============================================================");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(" Introduce su Numero de Telefono: ");
        String Numero = teclado.nextLine();
        
        System.out.println("Su Numero de Telefono es: " + Numero);
        
       
    }
}
