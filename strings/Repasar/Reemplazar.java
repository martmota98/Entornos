package Repasar;
import java.util.Scanner;
	public class Reemplazar {
			static Scanner inputValue = new Scanner(System.in);
			public static String leerCadena(String mensaje){
			    System.out.println(mensaje);
			    return inputValue.nextLine();
			}
			public static void main(String[] args) {
			
				String frase1 = leerCadena("Introduce una frase");
		

			frase1=	frase1.replace("f", "d");
				
				System.out.println(frase1);
			}

		}
