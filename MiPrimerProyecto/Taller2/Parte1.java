package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parte1 {
	public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        //Ejercicio 1
        int n, i, n2, n1;
        do {
            System.out.print("Ingrese un numero: ");
            n = Integer.parseInt(input.readLine());
        } while (n != 5);
        
        //Ejercicio 2
        System.out.print("Ingrese una cantidad de veces: ");
        n = Integer.parseInt(input.readLine());
        i = 0;
        do {
            System.out.print("Inserte un numero: ");
            n2 = Integer.parseInt(input.readLine());
            if (n2 < 0)
                n2 = -n2;
            System.out.println("El numero es: "+n2);
            i++;
        } while (i<n);
        
        //Ejercicio 3
        System.out.print("Ingrese un nuevo numero: ");
        n = Integer.parseInt(input.readLine());
        i = 0;
        do {
            i++;
            if (i % 2 == 0)
                System.out.println(i);
        } while (i<n);
        
        //Ejercicio 4
        System.out.print("Ingrese la cantidad de personas a validar: ");
        n = Integer.parseInt(input.readLine());
        i = 0;
        String name;
        while (i<n) {
            System.out.print("Ingrese el nombre: ");
            name = input.readLine();
            System.out.println("Hola "+name);
            i++;
        }
        
        
        //Ejercicio 5
        i = 0;
        n2 = 0;
        String option;
        System.out.print("Ingrese la cantidad de estudiantes: ");
        n = Integer.parseInt(input.readLine());
        while (i<n) {
            System.out.print("Ingrese el nombre del estudiante: ");
            name = input.readLine();
            System.out.print("Dejas que "+name+" entre? (S/N): ");
            option = input.readLine().toLowerCase();
            if (option.equals("s"))
                n2++;
            i++;
        }
        System.out.println("Has dejado entrar a "+n2+"/"+n+" estudiantes");
        //Ejercicio 6
        System.out.println("\nOpciones calculadora:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Finalizar\n");
        n=0;
        while (n!=5) {
            System.out.print("Opción: ");
            n = Integer.parseInt(input.readLine());
            if (n == 5) {
                System.out.print("Ingrese el primer valor: ");
                n1 = Integer.parseInt(input.readLine());
                System.out.print("Ingrese el segundo valor: ");
                n2 = Integer.parseInt(input.readLine());
                System.out.print("El resultado es ");
                switch (n) {
                    case 1:
                        System.out.println(n1+n2);
                        break;
                    case 2:
                        System.out.println(n1-n2);
                        break;
                    case 3:
                        System.out.println(n1*n2);
                        break;
                    case 4:
                        System.out.println(n1/n2);
                        break;
                    default:
                        System.out.println("Opción no valida.");
                }
            }
        }
    }
}
