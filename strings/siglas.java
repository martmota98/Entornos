import java.util.Scanner;
public class siglas {
	static Scanner inputValue = new Scanner(System.in);
	  public static String leerCadena(String mensaje){
	      System.out.println(mensaje);
	      return inputValue.nextLine();
	  	}
	  public static String[] contarpalabras(String frase){
	      String[] palabras;
	      frase = frase.trim();
	      frase = frase.replaceAll(" +"," ");
	      palabras = frase.split(" ");
	      return palabras;
	  	}
	  public static String siglas(String[] palabras) {
		  String sigla= "";
	       
		  for (int i = 0; i < palabras.length; i++){
			  if (Character.isUpperCase(palabras[i].charAt(0))){
				  sigla= sigla + palabras[i].charAt(0);
				  
		}
	  } return sigla;
  }

	public static void main(String[] args) {
				
		String frase = leerCadena("Introduce una frase");
        String[] cadena = contarpalabras(frase);
        String sigla = siglas(cadena);
        System.out.println(sigla);

            
        }

	}
