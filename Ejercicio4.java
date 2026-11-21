/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantPares = 0;
        int cantImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                cantPares++;
                sumaPares += numeros[i];
            } else {
                cantImpares++;
                sumaImpares += numeros[i];
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cantidad de pares: " + cantPares);
        System.out.println("Cantidad de impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);

        sc.close();
    }
}
