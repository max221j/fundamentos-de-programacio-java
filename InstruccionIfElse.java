import java.util.Scanner;

public class InstruccionIfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese una edad: ");
        int edad = entrada.nextInt();
        
        // Condición: Evalúa si la edad es mayor o igual a 18
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
        
        // Esta línea se ejecuta SIEMPRE, sin importar la edad ingresada
        System.out.println("Adiós!");
        
        entrada.close(); // Buena práctica para cerrar el Scanner
    } // Fin del método main
} // Fin de la clase InstruccionIfElse 