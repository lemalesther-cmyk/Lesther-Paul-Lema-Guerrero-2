/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- MATRIZ INGRESADA ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
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
