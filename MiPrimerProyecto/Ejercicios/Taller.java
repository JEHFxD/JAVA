package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taller {
	public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //Ejercicio 1
        System.out.print("Ingrese un numero: ");
        int n = Integer.parseInt(input.readLine());
        if (n > 0)
            System.out.println(n+" es positivo");
        else
            System.out.println(n+" es negativo");
        //Ejercicio 2
        System.out.print("Ingrese la edad: ");
        int year = Integer.parseInt(input.readLine());
        if (year > 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        //Ejercicio 3
        System.out.print("Ingrese el nombre: ");
        String nombre = input.readLine();
        System.out.print("Ingrese la materia: ");
        String materia = input.readLine();
        System.out.print("Ingrese la edad: ");
        int age = Integer.parseInt(input.readLine());
        System.out.print("Ingrese la primera nota: ");
        int nota1 = Integer.parseInt(input.readLine());
        System.out.print("Ingrese la segunda nota: ");
        int nota2 = Integer.parseInt(input.readLine());
        System.out.print("Ingrese la tercera nota: ");
        int nota3 = Integer.parseInt(input.readLine());
        double notaFinal = (nota1+nota2+nota3) / 3;
        if (notaFinal < 3.5) {
            System.out.println("El estudiante "+nombre+" ha reporbado "+materia);
        } else {
            System.out.println("El estudiante "+nombre+" ha aprobado "+materia);
        }
        // Ejercicio 4
        System.out.print("Ingrese el valor total de las compras hechas: ");
        double fullPrices = Double.parseDouble(input.readLine());
        if (fullPrices > 100000) {
            fullPrices = fullPrices / 2;
            System.out.println("Precio a pagar con descuento: "+fullPrices);
        } else {
            System.out.println("Precio a pagar: "+fullPrices);
        }
        // Ejercicio 5
        System.out.print("Ingrese un numero: ");
        n = Integer.parseInt(input.readLine());
        if (n % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}

