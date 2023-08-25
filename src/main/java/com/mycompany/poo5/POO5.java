/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo5;

/**
 *
 * @author Juliana
 */
//EJERCICIO RESUELTO #5
public class POO5 {
    public static void main(String[] args) {
        double suma, x, y;
        suma = 0; //valor inicial de la suma
        x = 20; //valor inicial de x
        suma = suma + x;
        y = 40; //valor de y
        x = x + Math.pow(y, 2);
        suma = suma + (x/y); //valor final de la suma
        System.out.println("El valor de la suma es: " + suma);
    }
}
