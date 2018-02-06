import java.util.Scanner;
import java.util.Arrays;
public class longitud3 {
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
        boolean cont=false;
        String[] cadena = contarpalabras(frase);



        for (int i = 0; i < cadena.length; i++){
        if (cadena[i].length()<=caracter) {
          cont=true;
      }else{
          cont=false;
          break;
      }
    }
      if (cont==true) {
        System.out.println("Todas las palabra(s) son cortas)");
      }else{
        System.out.println("Hay alguna(s) palabra(s) largas");
      }

  }
}
