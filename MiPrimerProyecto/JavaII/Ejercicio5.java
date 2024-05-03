package JavaII;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, i, j, k, l;
        System.out.print("Inserte el primer valor (?/X+X-X+X*X*X-X/X+X-X*X): ");
        a = input.nextInt();
        System.out.print("Inserte el segundo valor ("+a+"/?+X-X+X*X*X-X/X+X-X*X): ");
        b = input.nextInt();
        System.out.print("Inserte el tercer valor ("+a+"/"+b+"+?-X+X*X*X-X/X+X-X*X): ");
        c = input.nextInt();
        System.out.print("Inserte el cuarto valor ("+a+"/"+b+"+"+c+"-?+X*X*X-X/X+X-X*X): ");
        d = input.nextInt();
        System.out.print("Inserte el quinto valor ("+a+"/"+b+"+"+c+"-"+d+"+?*X*X-X/X+X-X*X): ");
        e = input.nextInt();
        System.out.print("Inserte el sexto valor ("+a+"/"+b+"+"+c+"-"+d+"+"+e+"*?*X-X/X+X-X*X): ");
        f = input.nextInt();
        System.out.print("Inserte el sexto valor ("+a+"/"+b+"+"+c+"-"+d+"+"+e+"*"+f+"*?-X/X+X-X*X): ");
        g = input.nextInt();
        System.out.print("Inserte el sexto valor ("+a+"/"+b+"+"+c+"-"+d+"+"+e+"*"+f+"*"+g+"-?/X+X-X*X): ");
        h = input.nextInt();
        System.out.print("Inserte el sexto valor ("+a+"/"+b+"+"+c+"-"+d+"+"+e+"*"+f+"*"+g+"-"+h+"/?+X-X*X): ");
        i = input.nextInt();
        System.out.print("Inserte el sexto valor ("+a+"/"+b+"+"+c+"-"+d+"+"+e+"*"+f+"*"+g+"-"+h+"/"+i+"+?-X*X): ");
        j = input.nextInt();
        System.out.print("Inserte el sexto valor ("+a+"/"+b+"+"+c+"-"+d+"+"+e+"*"+f+"*"+g+"-"+h+"/"+i+"+"+j+"-?*X): ");
        k = input.nextInt();
        System.out.print("Inserte el sexto valor ("+a+"/"+b+"+"+c+"-"+d+"+"+e+"*"+f+"*"+g+"-"+h+"/"+i+"+"+j+"-"+k+"*?): ");
        l = input.nextInt();
        System.out.println(a/b+c-d+e*f*g-h/i+j-k*l);
    }

}
