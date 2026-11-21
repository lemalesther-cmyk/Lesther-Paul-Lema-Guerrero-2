/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- DIAGONAL PRINCIPAL ---");
        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento [" + i + "][" + i + "]: " + matriz[i][i]);
            sumaDiagonal += matriz[i][i];
        }
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);

        sc.close();
    }
}
