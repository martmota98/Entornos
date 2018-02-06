import java.util.Scanner;
import java.util.Arrays;
public class invertid {
  static Scanner inputValue = new Scanner(System.in);
  public static String leerCadena(String mensaje){
      System.out.println(mensaje);
      return inputValue.nextLine();
    }
  public static int leerEntero(String mensaje){
      System.out.println(mensaje);
      return inputValue.nextInt();
    }
  public static String[] contarpalabras(String frase){
      String[] palabras;
      frase = frase.trim();
      frase = frase.replaceAll(" +"," ");
      palabras = frase.split(" ");
      return palabras;
  	}
  
  public static String invertir(String[] palabras) {
	  String invertido = "";
	  for (int i = palabras.length-1; i >= 0; i= i-1) {
		invertido = invertido + palabras[i];
	} 
	  return invertido;
  }
  
  public static void main(String[] args){

        String frase = leerCadena("Introduce una frase");
        String[] cadena = contarpalabras(frase);
        
        System.out.println(invertir(cadena));
}
}
