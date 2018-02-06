package Repasar;
import java.util.Scanner;
	public class AcabaCon {
			static Scanner inputValue = new Scanner(System.in);
			public static String leerCadena(String mensaje){
			    System.out.println(mensaje);
			    return inputValue.nextLine();
			}
			public static void main(String[] args) {
			
				String frase1 = leerCadena("Introduce la primera frase");
				String frase2 = leerCadena("Introduce la segunda frase");

				if (frase1.endsWith(frase2)) {
					System.out.println("Acaba con: "+frase2);
				}
				else {
					System.out.println("No acaba con: "+frase2);
				}
			}

		}
