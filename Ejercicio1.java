/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número de la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\n--- VALORES ALMACENADOS ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        sc.close();
    }
}
