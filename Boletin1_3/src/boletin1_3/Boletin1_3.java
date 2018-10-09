/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.Scanner;
/**
 *
 * @author aparcerozas
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float euros, cambio, dolares;
        System.out.println("Introduzca los euros:");
        Scanner teclado = new Scanner(System.in);
        euros = teclado.nextFloat();
        System.out.println("Introduzca la tasa de cambio:");
        cambio = teclado.nextFloat();
        dolares = euros * cambio;
        System.out.println(euros + " euros = " + dolares + " dolares");
    }
    
}
