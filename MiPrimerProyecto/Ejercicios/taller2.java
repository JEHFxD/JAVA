package Ejercicios;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class taller2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Ejercicio 1
        System.out.print("Ingrese un numero: ");
        int n = Integer.parseInt(input.readLine());
        if (n > 0)
            System.out.println(n+" es positivo");
        // Ejercicio 2
        System.out.print("Ingrese la edad: ");
        int year = Integer.parseInt(input.readLine());
        if (year > 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        // Ejercicio 3
        System.out.print("Ingrese un numero: ");
        n = Integer.parseInt(input.readLine());
        if (n < 0)
            n = -n;
        System.out.print("Valor absoluto: "+n);
    }
}

