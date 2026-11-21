/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];

        for (int i = 0; i < 12; i++) {
            int n;
            do {
                System.out.print("Ingrese un número positivo para la posición " + i + ": ");
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("El número debe ser positivo. Intente de nuevo.");
                }
            } while (n <= 0);
            numeros[i] = n + i;
        }

        System.out.println("\n--- ARREGLO MODIFICADO ---");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        sc.close();
    }
}
