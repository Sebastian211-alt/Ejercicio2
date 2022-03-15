/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
