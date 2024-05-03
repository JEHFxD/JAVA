package JavaIII;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio8 {
	
	 public static void main(String[] args) throws IOException {
	        int boughtItems;
	        float price, totalPrice;
	        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Ingrese la cantidad de items comprados: ");
	        boughtItems = Integer.parseInt(input.readLine());
	        System.out.print("Ingrese el precio de los items individuales: ");
	        price = Float.parseFloat(input.readLine());
	        totalPrice = boughtItems * price;
	        if (totalPrice > 50000) {
	            totalPrice = (totalPrice / 100) * 110;
	        }
	        System.out.println("Precio final: "+totalPrice+"$");
	    }

}
