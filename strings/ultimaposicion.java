import java.util.Scanner;
public class ultimaposicion {
static Scanner inputValue = new Scanner(System.in);
public static String leerCadena(String mensaje){
System.out.println(mensaje);
return inputValue.nextLine();
}
public static void main(String[] args){
        String cadena1 = leerCadena("Introduce una cadena");
        String cadena2 = leerCadena("Introduce una cadena");
        int cadena3;

      cadena3=cadena1.lastIndexOf(cadena2);

          System.out.println(cadena3);






}
}
