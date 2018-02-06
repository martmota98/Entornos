import java.util.Scanner;
import java.util.Arrays;
public class digitos2 {
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
        int cont=0;
        String[] array = contarpalabras(frase);
        int num;
        for (int i = 0; i < array.length; i++){
          for (int j=0; j< array[i].length(); j++) {
            if (!Character.isDigit(array[i].charAt(j))){
              cont++;
              break;
              }
        }
      }
        num = array.length - cont;
        System.out.println("Hay "+num+" números");

}
}
