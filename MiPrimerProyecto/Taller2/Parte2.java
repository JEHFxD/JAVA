package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parte2 {
	
	 public static void main(String[] args) throws IOException {
	        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        
	        //Actividad
	        
	        System.out.print("Ingrese un numero: ");
	        int n = Integer.parseInt(input.readLine());
	        if (n > 0) {
	            System.out.println("El numero es mayor a 0");
	        } else {
	            if (n < 0) {
	                System.out.println("El numero es menor a 0");
	            } else {
	                System.out.println("El valor es igual a 0");
	            }
	        }
	        //Ejercicio 1
	        
	        int n1, n2;
	        System.out.print("Ingrese el primer numero: ");
	        n1 = Integer.parseInt(input.readLine());
	        System.out.print("Ingrese el segundo numero: ");
	        n2 = Integer.parseInt(input.readLine());
	        if (n1 > n2) {
	            System.out.println("El primer valor es mayor que el segundo");
	        } else {
	            if (n2 > n1) {
	                System.out.println("El segundo valor es mayor que el primero");
	            } else {
	                System.out.println("Ambos valores son iguales");
	            }
	        }
	        
	        //Ejercicio 2
	        
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
	            System.out.println("El estudiante "+nombre+" ha reporbado "+materia+" con una nota final de "+notaFinal);
	            if (notaFinal > 2.5) {
	                System.out.println("El estudiante "+nombre+" puede recuperar "+materia);
	            } else {
	                System.out.println("El estudiante "+nombre+" perdió la materia "+materia+".");
	            }
	        } else {
	            System.out.println("El estudiante "+nombre+" ha aprobado "+materia+" con una nota final de "+notaFinal);
	        }
	        
	        //Ejercicio 3
	        
	        System.out.print("Ingrese el nombre: ");
	        nombre = input.readLine();
	        System.out.print("Ingrese la materia: ");
	        materia = input.readLine();
	        System.out.print("Ingrese la edad: ");
	        age = Integer.parseInt(input.readLine());
	        System.out.print("Ingrese la primera nota: ");
	        nota1 = Integer.parseInt(input.readLine());
	        if (nota1 >= 0 && nota1 <= 5) {
	            System.out.print("Ingrese la segunda nota: ");
	            nota2 = Integer.parseInt(input.readLine());
	            if (nota2 >= 0 && nota2 <= 5) {
	                System.out.print("Ingrese la tercera nota: ");
	                nota3 = Integer.parseInt(input.readLine());
	                if (nota3 >= 0 && nota3 <= 5) {
	                    notaFinal = (nota1+nota2+nota3) / 3;
	                    if (notaFinal < 3.5) {
	                        System.out.println("El estudiante "+nombre+" ha reporbado "+materia+" con una nota final de "+notaFinal);
	                        if (notaFinal > 2.5) {
	                            System.out.println("El estudiante "+nombre+" puede recuperar "+materia);
	                        } else {
	                            System.out.println("El estudiante "+nombre+" perdió la materia "+materia+".");
	                        }
	                    } else {
	                        System.out.println("El estudiante "+nombre+" ha aprobado "+materia+" con una nota final de "+notaFinal);
	                    }
	                } else {
	                    System.out.println("Valor invaldo, debe estar en el rango 0 a 5.");
	                }
	            } else {
	                System.out.println("Valor invaldo, debe estar en el rango 0 a 5.");
	            }
	        } else {
	            System.out.println("Valor invaldo, debe estar en el rango 0 a 5.");
	        }
	        
	        //Ejercicio 4
	        
	        System.out.print("Ingrese el sueldo: ");
	        double wage = Double.parseDouble(input.readLine());
	        System.out.print("Ingrese los años de antiguedad: ");
	        int years = Integer.parseInt(input.readLine());
	        if (wage < 500) {
	            if (years >= 10) {
	                wage = (wage / 100) * 120;
	            } else {
	                wage = (wage / 100) * 105;
	            }
	        }
	        System.out.println("El sueldo es de: "+wage+"$");
	    }

}
