package JavaIII;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio10 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int edad;
        System.out.print("Inserte la edad: ");
        edad = Integer.parseInt(input.readLine());
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}
