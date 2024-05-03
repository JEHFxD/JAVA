package JavaIII;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio9 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        float n1, n2;
        System.out.print("Inserte el primer numero: ");
        n1 = Float.parseFloat(input.readLine());
        System.out.print("Inserte el segundo numero: ");
        n2 = Float.parseFloat(input.readLine());
        if (n1 > n2) {
            System.out.println("El primer numero es mayor que el otro");
        } else if (n2 > n1) {
            System.out.println("El segundo numero es mayor que el otro");
        } else {
            System.out.println("Ambos valores son iguales");
        }
    }
}
