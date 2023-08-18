/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;


// EJERCICIO 7

public class JuegoPoderVida {

  public static void main(String[] args) {
  
    Random random = new Random();

   
    Scanner sc = new Scanner(System.in);

    int poder = 0;
    int vida = 10;


    System.out.println("Bienvenido al juego de poder y vida.");

    // Repetir el juego hasta que la vida sea cero o el usuario quiera salir
    while (vida > 0) {
        
      // Generar un número aleatorio entre 1 y 10
      int numero = random.nextInt(10) + 1;


      System.out.println("El número generado es: " + numero);

      // Si el número es 5, incrementar el poder en 1
      if (numero == 5) {
        poder++;
        System.out.println("Has ganado un punto de poder. Tu poder actual es: " + poder);
      }

      // Si el número es 3, disminuir la vida en 1
      if (numero == 3) {
        vida--;
        System.out.println("Has perdido un punto de vida. Tu vida actual es: " + vida);
      }

      // Si el número no es ni 5 ni 3, no hacer nada
      if (numero != 5 && numero != 3) {
        System.out.println("No ha pasado nada.");
      }

 
      System.out.println("¿Quieres seguir jugando o salir? (S/N)");
      String respuesta = sc.nextLine();

      // Si la respuesta es N, salir del bucle
      if (respuesta.equalsIgnoreCase("N")) {
        break;
      }
    }

    // Mostrar un mensaje de despedida
    System.out.println("Gracias por jugar. Tu poder final es: " + poder + " y tu vida final es: " + vida);
  }
}
