package Repasar;
import java.util.Scanner;
public class Concatenar {
	static Scanner inputValue = new Scanner(System.in);
	public static String leerCadena(String mensaje){
	    System.out.println(mensaje);
	    return inputValue.nextLine();
	}
	public static void main(String[] args) {
	
		String frase1 = leerCadena("Introduce la primera frase");
		String frase2 = leerCadena("Introduce la segunda frase");

			System.out.println(frase1.concat(frase2));
	}

}
