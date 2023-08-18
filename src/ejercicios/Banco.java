package ejercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;


// EJERCICIO 5



public class Banco {

    public static void main(String[] args) {
      
        double saldo = 1000000; // saldo del cliente
        int clave = 1234; // clave del cliente
        int opcion; // opción elegida por el cliente
        int destinatario; // nmero de cuenta del destinatario
        double monto; // monto de la transferencia o la donación
        int nuevaClave; // nueva clave del cliente
        int producto; // producto a bloquear
        Scanner sc = new Scanner(System.in); 
        
        // Usar un bucle while para repetir el proceso hasta que el usuario elija salir
        while (true) {
          
            System.out.println("Bienvenido al banco. Por favor, elija una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar transferencia");
            System.out.println("3. Cambiar clave");
            System.out.println("4. Bloquear producto");
            System.out.println("5. Realizar donación");
            System.out.println("6. Salir");
            
            // verificar que la opcion sea valida
            
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción inválida. Intente de nuevo.");
                continue; // volver al inicio del bucle
            }
            
         
            switch (opcion) {
                
                case 1: // Consultar saldo
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                    
                case 2: // Realizar transferencia
                    System.out.println("Ingrese el número de cuenta del destinatario:");
                    destinatario = sc.nextInt();
                    
                    System.out.println("Ingrese el monto a transferir:");
                    monto = sc.nextDouble();
                    
                    if (monto <= 0 || monto > saldo) {
                        System.out.println("Monto inválido. No se puede realizar la transferencia.");
                    } else {
                        System.out.println("Ingrese su clave:");
                        if (sc.nextInt() == clave) {
                            saldo -= monto; // restar el monto al saldo
                            System.out.println("Transferencia realizada conexito.");
                            System.out.println("Su nuevo saldo es: " + saldo);
                        } else {
                            System.out.println("Clave incorrecta. No se puede realizar la transferencia");
                        }
                    }
                    break;
                    
                case 3: // Cambiar clave
                    System.out.println("Ingrese su clave actual:");
                    if (sc.nextInt() == clave) {
                        System.out.println("Ingrese su nueva clave:");
                        nuevaClave = sc.nextInt();
                        if (nuevaClave == clave) {
                            System.out.println("La nueva clave no puede ser igual a la anterior.");
                        } else {
                            clave = nuevaClave; // asignar la nueva clave
                            System.out.println("Clave cambiada con éxito.");
                        }
                    } else {
                        System.out.println("Clave incorrecta. No se puede cambiar la clave (pista 12..)");
                    }
                    break;
                    
                case 4: // Bloquear producto
                    System.out.println("Ingrese el número del producto a bloquear:");
                    producto = sc.nextInt();
                    System.out.println("Ingrese su clave:");
                    if (sc.nextInt() == clave) {
                        System.out.println("Producto bloqueado con exito.");
                    } else {
                        System.out.println("Clave incorrecta. No se puede bloquear el producto (pista:12..).");
                    }
                    break;
                    
                case 5: // Realizar donación
                    System.out.println("Ingrese el monto a donar:");
                    monto = sc.nextDouble();
                    if (monto <= 0 || monto > saldo) {
                        System.out.println("Monto inválido. No se puede realizar la donación.");
                    } else {
                        System.out.println("Ingrese su clave:");
                        if (sc.nextInt() == clave) {
                            saldo -= monto; // restar el monto al saldo
                            System.out.println("Donación realizada con éxito.");
                            System.out.println("Su nuevo saldo es: " + saldo);
                        } else {
                            System.out.println("Clave incorrecta. No se puede realizar la donación(pista:12.. ");
                        }
                    }
                    break;
                    
                case 6: // Salir
                    System.out.println("Gracias por usar el banco. Hasta pronto.");
                    return; // terminar el programa
            }
        }
    }
}
