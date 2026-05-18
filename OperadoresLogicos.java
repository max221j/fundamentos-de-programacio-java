1  public class OperadoresLogicos {
2      public static void main(String[] args) {
3          System.out.println("Operador AND (&&):");
4          System.out.println( true && true );   // Imprime: true
5          System.out.println( true && false );  // Imprime: false
6          System.out.println( false && true );  // Imprime: false
7          System.out.println( false && false ); // Imprime: false
8          System.out.println();
9  
10         System.out.println("Operador OR (||):");
11         System.out.println( true || true );   // Imprime: true
12         System.out.println( true || false );  // Imprime: true
13         System.out.println( false || true );  // Imprime: true
14         System.out.println( false || false ); // Imprime: false
15         System.out.println();
16 
17         System.out.println("Operador NOT (!):");
18         System.out.println( !true );          // Imprime: false
19         System.out.println( !false );         // Imprime: true
20     } // Fin del método main
21 } // Fin de la clase OperadoresLogicos