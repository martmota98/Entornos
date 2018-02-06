import java.util.Scanner;
import java.util.Arrays;
public class digitos {
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
  public static void main(String[] args){
/*Escribe un programa que muestre la cantidad de dígitos que aparecen en una cadena.
Por ejemplo, la cadena "un 1 y un 20", tiene 3 dígitos*/

        String frase = leerCadena("Introduce una frase");
        int cont=0;
        
        for (int i = 0; i < frase.length(); i++){

            if (Character.isDigit(frase.charAt(i))){
              cont++;
              }
        }

        System.out.println("Hay "+cont+" dígitos");

}
}
