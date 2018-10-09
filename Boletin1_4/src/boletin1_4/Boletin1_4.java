/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

import java.util.Scanner;
/**
 *
 * @author aparcerozas
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1, num2, suma, resta, cociente, producto;
        System.out.println("Introduzca un número:");
        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextFloat();
        System.out.println("Introduzca otro número:");
        num2 = teclado.nextFloat();
        suma = num1 + num2;
        resta = num1 - num2;
        cociente = num1 / num2;
        producto = num1 * num2;
        System.out.println("Suma = " + suma + "\nResta = " + resta + 
                "\nCociente = " + cociente + "\nProducto = " + producto);
    }
    
}
