import java.util.Scanner;
import java.util.Arrays;
public class parentesis {
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
/*Escribe un programa que muestre la cantidad de números que aparecen en una cadena.
Por ejemplo, la cadena "un 1, un 20 y un 234", tiene 3 números*/

        String frase = leerCadena("Introduce una frase");
        double cont=0;
        for (int i = 0; i < frase.length(); i++){

            if (frase.charAt(i) == '('){
              cont++;
            }else if (frase.charAt(i) == ')') {
              cont= cont-1;
            }

          }

      if (cont==0) {
        System.out.println("Están bien los parentesis.");
      }else{
        System.out.println("Están mal los parentesis");

      }
}
}
