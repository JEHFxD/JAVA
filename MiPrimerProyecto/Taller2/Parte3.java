package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parte3 {
	public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n, p, n2;
        
        //Ejercicio 1
        
        System.out.print("Ingrese un numero: ");
        n = Integer.parseInt(input.readLine());
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0)
                System.out.println(i+" es divisible por 3");
            else
                System.out.println(i+" no es divisible por 3");
        }
        
        //Ejercicio 2
        
        System.out.print("Ingrese la cantidad de estudiantes: ");
        n = Integer.parseInt(input.readLine());
        System.out.print("Ingrese la cantidad de pruebas: ");
        p = Integer.parseInt(input.readLine());
        double total, totalAverange = 0;
        for (int i = 0; i < n; i++) {
            total = 0;
            for (int i2 = 0; i2 < p; i2++) {
                System.out.print("Ingrese el valor de la nota "+(i2 + 1)+" del estudiante "+(i+1)+ ": ");
                total += Double.parseDouble(input.readLine());
            }
            System.out.println("El promedio del estudiante "+(i+1)+" es "+(total/p));
            totalAverange += total/p;
        }
        totalAverange = totalAverange / n;
        System.out.println("El promedio total de todos los estudiantes es: "+totalAverange);
        
        //Ejercicio 3
        
        System.out.print("Ingrese una cantidad de numeros: ");
        n = Integer.parseInt(input.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese un numero: ");
            n2 = Integer.parseInt(input.readLine());
            if (n2 < 0) {
                if (-n2 > 9) {
                    System.out.println("El numero "+n2+" es negativo y tiene más de un digito");
                } else {
                    System.out.println("El numero "+n2+" es negativo y tiene un digito");
                }
            } else {
                if (n2 > 9) {
                    System.out.println("El numero "+n2+" es positivo y tiene más de un digito");
                } else {
                    System.out.println("El numero "+n2+" es positivo y tiene un digito");
                }
            }
        }
    }
}
