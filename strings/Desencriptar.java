import java.util.Scanner;
public class Desencriptar {
	static Scanner inputValue = new Scanner(System.in);
	  public static String leerCadena(String mensaje){
	      System.out.println(mensaje);
	      return inputValue.nextLine();
	  	}
	  public static int leerCadena2(String mensaje){
	      System.out.println(mensaje);
	      return inputValue.nextInt();
	  	}
	  public static String desencriptar(String frase, int posi) {
			int posiAct=0;
			int posiEncript=0;
			String cadenaDesncriptada = "";
				
			for (int i = 0; i < frase.length(); i++) {
				
				if (Character.isDigit(frase.charAt(i))) {
					posiAct = frase.charAt(i)-48;
					
					posiEncript= posiAct - posi;
					
					if (posiEncript<0) {
						posiEncript= posiEncript+10;
						cadenaDesncriptada  = cadenaDesncriptada  + posiEncript;
					}else {
					
						cadenaDesncriptada  = cadenaDesncriptada  + posiEncript;
					}
				}else if(Character.isUpperCase(frase.charAt(i))) {
					posiAct = frase.charAt(i);
					
					posiEncript= posiAct - posi;
					
						if (posiEncript<65) {
							posiEncript= posiEncript+26;
							cadenaDesncriptada  = cadenaDesncriptada  + (char)posiEncript;
						}else {
					
							cadenaDesncriptada  = cadenaDesncriptada  + (char)posiEncript;
						}
				}else {
					posiAct = frase.charAt(i);
					
					posiEncript= posiAct - posi;
						
						if (posiEncript<97) {
							posiEncript= posiEncript+26;
							cadenaDesncriptada  = cadenaDesncriptada  + (char)posiEncript;
						}else {
					
							cadenaDesncriptada  = cadenaDesncriptada  + (char)posiEncript;
						}
				}					
			}		 
			return cadenaDesncriptada;
	  }

	public static void main(String[] args) {
		
		String frase = leerCadena("Introduce la frase a encriptar");
		int posi = leerCadena2("Introduce la posici�n");
		String fraseDesncriptada = desencriptar(frase, posi);
		System.out.println("Frase desencriptada: "+fraseDesncriptada);
	}
}
