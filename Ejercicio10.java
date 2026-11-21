/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el número para [" + i + "][" + j + "]: ");
                int numero = sc.nextInt();
                matriz[i][j] = numero + (i * j);
            }
        }

        System.out.println("\n--- MATRIZ RESULTANTE ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
