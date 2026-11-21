/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;

        for (int i = 1; i < 15; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("Posición del mayor: " + posMayor);
        System.out.println("Posición del menor: " + posMenor);

        sc.close();
    }
}
