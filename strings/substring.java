import java.util.Scanner;
public class substring {
static Scanner inputValue = new Scanner(System.in);
public static String leerCadena(String mensaje){
System.out.println(mensaje);
return inputValue.nextLine();
}
public static void main(String[] args){
        String cadena1 = leerCadena("Introduce una cadena");
        
        int pos1;
        int pos2;

        System.out.println("¿Que posición quieres extraer?");

        Scanner inputValue;
                  inputValue=new Scanner(System.in);
                  pos1 = inputValue.nextInt();


        System.out.println("¿Cual más?");

                  inputValue=new Scanner(System.in);
                  pos2 = inputValue.nextInt();



          System.out.println(cadena1.substring(pos1,pos2));






}
}
