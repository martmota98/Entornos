import java.util.Scanner;
import java.util.Arrays;
public class contarpalabras1 {
static Scanner inputValue = new Scanner(System.in);
public static String leerCadena(String mensaje){
System.out.println(mensaje);
return inputValue.nextLine();
}
public static void main(String[] args){
        String cadena1 = leerCadena("Introduce una cadena");
        String [] array= new String[30];

        cadena1 = cadena1.trim();
        cadena1 = cadena1.replaceAll(" +"," ");
        array=cadena1.split(" ");

        System.out.println(array.length);






}
}
