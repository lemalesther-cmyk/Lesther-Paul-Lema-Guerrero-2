/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int suma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j];
            }
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Suma total de los elementos: " + suma);

        sc.close();
    }
}
