import java.util.Scanner;

public class Comparaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Ingrese un número entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese otro número entero: ");
        numero2 = entrada.nextInt();

        // Comparación: Mayor que (>)
        System.out.print(numero1 + " es mayor a " + numero2 + ": ");
        System.out.println(numero1 > numero2);

        // Comparación: Menor que (<)
        System.out.print(numero1 + " es menor a " + numero2 + ": ");
        System.out.println(numero1 < numero2);

        // Comparación: Mayor o igual que (>=)
        System.out.print(numero1 + " es mayor o igual a " + numero2 + ": ");
        System.out.println(numero1 >= numero2);

        // Comparación: Menor o igual que (<=)
        System.out.print(numero1 + " es menor o igual a " + numero2 + ": ");
        System.out.println(numero1 <= numero2);

        // Comparación: Igualdad (==)
        System.out.print(numero1 + " es igual a " + numero2 + ": ");
        System.out.println(numero1 == numero2);

        // Comparación: Diferente de / No es igual a (!=)
        System.out.print(numero1 + " no es igual a " + numero2 + ": ");
        System.out.println(numero1 != numero2);

        // Buena práctica: cerrar el Scanner
        entrada.close();
    } // Fin del método main
} // Fin de la clase Comparaciones