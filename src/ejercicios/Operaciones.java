/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;


// EJERCICIO 5


public class Operaciones {
    public static void main(String[] args) {
        // Operación 1: 3 + 8 * 5 - 6 / 3
        double resultado1 = 3 + 8 * 5 - 6 / 3;
        System.out.println("Resultado 1: " + resultado1);

        // Operación 2: 2.5 * 2 * 3 - 4 / 2 + 8
        double resultado2 = 2.5 * 2 * 3 - 4 / 2 + 8;
        System.out.println("Resultado 2: " + resultado2);

        // Operación 3: 2 * (6 - 2.5) / 3
        double resultado3 = 2 * (6 - 2.5) / 3;
        System.out.println("Resultado 3: " + resultado3);

        // Operación 4: 25 > 18
        boolean resultado4 = 25 > 18;
        System.out.println("Resultado 4: " + resultado4);

        // Operación 5: 3 + 2.5 * 4 / 3 != 4 * 5.2 - 3.8
        boolean resultado5 = 3 + 2.5 * 4 / 3 != 4 * 5.2 - 3.8;
        System.out.println("Resultado 5: " + resultado5);

        // Operación 6: (8.5 / 3.2 + 6.5 - 2.3 * 5 / 6 >= 15.8) && (21.4 < 81 / 4 + 2)
        boolean resultado6 = (8.5 / 3.2 + 6.5 - 2.3 * 5 / 6 >= 15.8) && (21.4 < 81 / 4 + 2);
        System.out.println("Resultado 6: " + resultado6);
    }
}
