 import java.util.Scanner; // Importamos la librería para leer datos del teclado
 public class InstruccionIf {
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in); 
         System.out.print("Ingrese una edad: ");
         int edad = entrada.nextInt(); // El programa se detiene aquí esperando un número
 
          if (edad >= 18) {
             System.out.println("Mayor de edad"); // Solo se ejecuta si la edad es 18 o más
         }
        System.out.println("Adiós!"); // Se ejecuta SIEMPRE, sin importar la edad
    } // Fin del método main
} // Fin de la clase InstruccionIf