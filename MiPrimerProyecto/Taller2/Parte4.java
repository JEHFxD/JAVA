package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parte4 {

	public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserte el codigo: ");
        int code = Integer.parseInt(input.readLine());
        if (code == 1) {
            System.out.println("Lunes");
        } else if (code == 2) {
            System.out.println("Martes");
        } else if (code == 3) {
            System.out.println("Miercoles");
        } else if (code == 4) {
            System.out.println("Jueves");
        } else if (code == 5) {
            System.out.println("Viernes");
        } else if (code == 6) {
            System.out.println("Sabado");
        } else if (code == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Codigo invalido");
        }
    }
}
