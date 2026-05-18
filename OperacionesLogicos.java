public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operador AND (&&): Da true SOLO si ambos lados son verdaderos
        System.out.println("Operador AND (&&):");
        System.out.println( true && true );   // true
        System.out.println( true && false );  // false
        System.out.println( false && true );  // false
        System.out.println( false && false ); // false
        System.out.println();

        // Operador OR (||): Da true si AL MENOS UNO de los lados es verdadero
        System.out.println("Operador OR (||):");
        System.out.println( true || true );   // true
        System.out.println( true || false );  // true
        System.out.println( false || true );  // true
        System.out.println( false || false ); // false
        System.out.println();

        // Operador NOT (!): Invierte el valor (true se vuelve false y viceversa)
        System.out.println("Operador NOT (!):");
        System.out.println( !true );          // false
        System.out.println( !false );         // true
    } // Fin del método main
} // Fin de la clase OperadoresLogicos