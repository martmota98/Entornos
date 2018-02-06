package Repasar;
import java.util.Scanner;
public class LeerCadena {

	static Scanner inputValue = new Scanner(System.in);
	public static String leerCadena(String mensaje){
	    System.out.println(mensaje);
	    return inputValue.nextLine();

	    }
public static void main(String[] args) {
	
	String frase = leerCadena("Introduce una frase");
	System.out.println("Frase leida: "+frase);
	
	

	}
}