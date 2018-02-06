package Repasar;
import java.util.Scanner;
	public class PosicionUltimo{
			static Scanner inputValue = new Scanner(System.in);
			public static String leerCadena(String mensaje){
			    System.out.println(mensaje);
			    return inputValue.nextLine();
			}
			public static void main(String[] args) {
			
				String frase1 = leerCadena("Introduce una frase");
				String frase2 = leerCadena("Introduce la segunda frase");

				if (frase1.lastIndexOf(frase2)<0) {
					System.out.println("No esta");

				}
				else {
					System.out.println(frase1.lastIndexOf(frase2));
				}
			}

		}
