import java.util.Scanner;
import java.util.Arrays;
public class longitud {
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
        String frase = leerCadena("Introduce una frase");
        int caracter = leerEntero("¿De cuantas letras?");
        int cont=0;
        String[] cadena = contarpalabras(frase);



        for (int i = 0; i < cadena.length; i++){
        if (cadena[i].length()==caracter) {
          cont++;
      }
    }
    System.out.println("Hay " +cont +" palabra(s) con "+caracter+" letras");

  }
}
