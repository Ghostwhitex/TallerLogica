package ejercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;


// EJERCICIO 3


public class PromedioProduccionCarbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;

        System.out.print("Ingrese la producción de carbón del mes 1: ");
        double podCarbon1 = scanner.nextDouble();
        suma += podCarbon1;

        System.out.print("Ingrese la producción de carbón del mes 2: ");
        double podCarbon2 = scanner.nextDouble();
        suma += podCarbon2;

        System.out.print("Ingrese la producción de carbón del mes 3: ");
        double podCarbon3 = scanner.nextDouble();
        suma += podCarbon3;

        System.out.print("Ingrese la producción de carbón del mes 4: ");
        double podCarbon4 = scanner.nextDouble();
        suma += podCarbon4;

        System.out.print("Ingrese la producción de carbón del mes 5: ");
        double podCarbon5 = scanner.nextDouble();
        suma += podCarbon5;

        System.out.print("Ingrese la producción de carbón del mes 6: ");
        double podCarbon6 = scanner.nextDouble();
        suma += podCarbon6;

        System.out.print("Ingrese la producción de carbón del mes 7: ");
        double podCarbon7 = scanner.nextDouble();
        suma += podCarbon7;

        System.out.print("Ingrese la producción de carbón del mes 8: ");
        double podCarbon8 = scanner.nextDouble();
        suma += podCarbon8;

        System.out.print("Ingrese la producción de carbón del mes 9: ");
        double podCarbon9 = scanner.nextDouble();
        suma += podCarbon9;

        System.out.print("Ingrese la producción de carbón del mes 10: ");
        double podCarbon10 = scanner.nextDouble();
        suma += podCarbon10;

        System.out.print("Ingrese la producción de carbón del mes 11: ");
        double podCarbon11 = scanner.nextDouble();
        suma += podCarbon11;

        System.out.print("Ingrese la producción de carbón del mes 12: ");
        double podCarbon12 = scanner.nextDouble();
        suma += podCarbon12;

        double promedio = suma / 12;

        System.out.println("El promedio anual de producción de carbnn ess: " + promedio);

        scanner.close();
    }
}
