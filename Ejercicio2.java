/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número real " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        double promedio = suma / 10;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        sc.close();
    }
}
