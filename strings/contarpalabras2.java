import java.util.Scanner;
import java.util.Arrays;
public class contarpalabras2 {
  static Scanner inputValue = new Scanner(System.in);
  public static String leerCadena(String mensaje){
      System.out.println(mensaje);
      return inputValue.nextLine();
}
public static void main(String[] args){
        String cadena = leerCadena("Introduce una cadena");
        int cont=0;

        if (cadena.charAt(0) !=' ') {
          cont++;
        }

        for (int i = 0; i < cadena.length() -1; i++){
          if (cadena.charAt(i) == ' ' && cadena.charAt(i + 1) != ' '){
            cont++;
          }
        }
        System.out.println("Hay " +cont +" palabra(s)");
  }
}
