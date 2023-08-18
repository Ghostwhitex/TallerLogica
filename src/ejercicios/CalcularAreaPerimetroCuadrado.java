/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicios;
import java.util.Scanner;


// EJERCICIO 2


public class CalcularAreaPerimetroCuadrado {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectanggulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        scanner.close();
    }
}
