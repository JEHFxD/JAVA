package JavaIII;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio6 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int x;
        System.out.print("Inserte un numero: ");
        x = Integer.parseInt(input.readLine());
        if (x < 0) {
            x=x*-1;
        }
        System.out.println("El numero es: "+x);
    }

}
