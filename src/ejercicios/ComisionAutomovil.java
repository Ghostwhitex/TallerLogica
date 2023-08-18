/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;
import java.util.Scanner;


// EJERCICIO 4

public class ComisionAutomovil {

    public static void main(String[] args) {
 
        int n; 
        double precio; 
        double total = 0; 
        double comision = 0; 
        double totalComision = 0; 
        Scanner sc = new Scanner(System.in); 
        
       
        System.out.println("Ingrese el númerRo de automoviles vendidos:");
        n = sc.nextInt();
        
        // Validar que n sea positivo
        if (n <= 0) {
            System.out.println("NUmero invalido. Debe ser mayor que cero.");
            return; // terminar el programa
        }
        
        // Bucle for para usar el programa varias veces
        
        for (int i = 1; i <= n; i++) {

            System.out.println("Ingrese el precio de la venta " + i + ":");
            precio = sc.nextDouble();
            
            // Validar que precio sea positivo
            if (precio <= 0) {
                System.out.println("Precio invalido. Debe ser mayor que cero.");
                return; // terminar el programa
            }
            
            // Calcular la comisión según el precio
            if (precio <= 100000) {
                comision = precio * 0.015; // 1.5% de comisión
            } else if (precio <= 250000) {
                comision = precio * 0.018; // 1.8% de comisión
            } else {
                comision = precio * 0.023; // 2.3% de comisión
            }
            
        
            total += precio;
            totalComision += comision;
        }
        
       
        System.out.println("El total de las ventas es: " + total);
        System.out.println("El tOtal de las comisiones es: " + totalComision);
    }
}
