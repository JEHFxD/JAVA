package Ejercicios;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class taller3 {
	
	public static void main(String[] args) throws IOException {
		
        //Ejercicio 1
        int a = 2, b = 2;
        int resta = a + b;
        System.out.println("Resultado: "+resta);
        
        //Ejercicio 2 
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el nombre: ");
        String nombre = input.readLine();
        System.out.print("Ingrese la edad: ");
        int age = Integer.parseInt(input.readLine());
        System.out.print("Ingrese la primera nota: ");
        int nota1 = Integer.parseInt(input.readLine());
        System.out.print("Ingrese la segunda nota: ");
        int nota2 = Integer.parseInt(input.readLine());
        System.out.print("Ingrese la tercera nota: ");
        int nota3 = Integer.parseInt(input.readLine());
        double notaFinal = (nota1+nota2+nota3) / 3;
        System.out.println("Nota final de "+nombre+": "+notaFinal);
        
        //Ejercicio 3
        System.out.print("Ingrese un valor: ");
        double v = Double.parseDouble(input.readLine());
        System.out.println("El 15% es: "+((v / 100) * 15));
        
        //Ejercicio 4
        final int wageHour=2000, tax=10;
        System.out.print("Ingrese las horas trabajadas: ");
        int hours = Integer.parseInt(input.readLine());
        int wage = (hours*wageHour) - (((hours*wageHour) / 100) * tax);
        System.out.println("Sueldo final: "+wage);
    }

}
