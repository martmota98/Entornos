import java.util.Scanner;
public class pasatiempos {
	static Scanner inputValue = new Scanner(System.in);
	  public static String leerCadena(String mensaje){
	      System.out.println(mensaje);
	      return inputValue.nextLine();
	  	}
	public static void main(String[] args) {
		int letra;
		String frase = leerCadena("Introduce una frase");
			
			for (int i = 0; i < frase.length(); i++) {
				letra=frase.charAt(i);
				
					switch(letra) {
						case 'a':
						case 'e':
						case 'i':
						case 'o':
						case 'u':
							System.out.print(".");
						break;
						default:
							System.out.print(frase.charAt(i));
					}
		}
	}

}
