import java.util.Scanner;

class Lectura {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer datos de la consola
        Scanner entrada = new Scanner(System.in);

        // Solicitud del primer número
        System.out.print("Ingrese un valor entero: ");
        int numero1 = entrada.nextInt();

        // Solicitud del segundo número
        System.out.print("Ingrese otro valor entero: ");
        int numero2 = entrada.nextInt();

        // Operación de suma
        int suma = numero1 + numero2;

        // Mostrar el resultado en pantalla
        System.out.println("La suma es " + suma);
        
        // Buena práctica: cerrar el Scanner al terminar de usarlo
        entrada.close(); 
    } // Fin del método main
} // Fin de la clase Lectura