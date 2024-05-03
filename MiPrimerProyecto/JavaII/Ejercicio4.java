package JavaII;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.DataInputStream;
import java.util.Scanner;

public class Ejercicio4 {
	
	 public static void main(String[] args) throws IOException {
	        final int percentage = 30;
	        float hours, wageHours, totalWage;
	        
	        BufferedReader Binput = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Inserte el sueldo por hora: ");
	        wageHours = Float.parseFloat(Binput.readLine());
	        System.out.print("Inserte las horas trabajadas: ");
	        hours = Float.parseFloat(Binput.readLine());
	        totalWage = wageHours * hours / 100 * (percentage + 100);
	        System.out.print("Sueldo total: "+totalWage+"$\n\n");
	        
	        DataInputStream Dinput = new DataInputStream(System.in);
	        System.out.print("Inserte el sueldo por hora: ");
	        wageHours = Float.parseFloat(Dinput.readLine());
	        System.out.print("Inserte las horas trabajadas: ");
	        hours = Float.parseFloat(Dinput.readLine());
	        totalWage = wageHours * hours / 100 * (percentage + 100);
	        System.out.print("Sueldo total: "+totalWage+"$\n\n");
	        
	        wageHours = Float.parseFloat(JOptionPane.showInputDialog("Inserte el suelo por hora: "));
	        hours = Float.parseFloat(JOptionPane.showInputDialog("Inserte las horas trabajadas: "));
	        totalWage = wageHours * hours / 100 * (percentage + 100);
	        System.out.print("Sueldo total: "+totalWage+"$\n\n");
	        
	        Scanner Sinput = new Scanner(System.in);
	        System.out.print("Inserte el suelo por hora: ");
	        wageHours = Sinput.nextFloat();
	        System.out.print("Inserte las horas trabajadas: ");
	        hours = Sinput.nextFloat();
	        totalWage = wageHours * hours / 100 * (percentage + 100);
	        System.out.print("Sueldo total: "+totalWage+"$\n\n");
	    }

}
