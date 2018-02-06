package Repasar;
import java.util.Scanner;
public class CompararMays {
	static Scanner inputValue = new Scanner(System.in);
	public static String leerCadena(String mensaje){
	    System.out.println(mensaje);
	    return inputValue.nextLine();

	    }
	public static void main(String[] args) {
		
		String frase1 = leerCadena("Introduce la primera frase");
		String frase2 = leerCadena("Introduce la segunda frase");

		int fras= frase1.compareToIgnoreCase(frase2);
		
		if (fras<0) {
			System.out.println("La frase: "+frase2+" Es la mayor.");
		}
		else if (fras>0) {
				System.out.println("La frase: "+frase1+" Es la mayor.");
			}
		else {
			System.out.println("Son iguales");
		}
		
	}

}