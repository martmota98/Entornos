import java.util.Scanner;
public class desencriptar {
	static Scanner inputValue = new Scanner(System.in);
	  public static String leerCadena(String mensaje){
	      System.out.println(mensaje);
	      return inputValue.nextLine();
	  	}
	  public static int leerCadena2(String mensaje){
	      System.out.println(mensaje);
	      return inputValue.nextInt();
	  	}
	public static void main(String[] args) {
		String frase = leerCadena("Introduce la frase a encriptar");
		int posi = leerCadena2("Introduce la posici�n");
		int posiAct=0;
		int posiEncript=0;
		
			
			for (int i = 0; i < frase.length(); i++) {
				
					if (frase.charAt(i)>46 && frase.charAt(i)<58) {
						posiAct = frase.charAt(i)-48;
						
						posiEncript= posiAct - posi;
						
							if (posiEncript<0) {
								posiEncript= posiEncript+10;
								System.out.print(posiEncript);
							}else {
						
						System.out.print(posiEncript);
							}
					}
					
					else if(frase.charAt(i)>64 && frase.charAt(i)<91) {
						posiAct = frase.charAt(i);
						
						posiEncript= posiAct - posi;
						
							if (posiEncript<65) {
								posiEncript= posiEncript+26;
								System.out.print((char)posiEncript);
							}else {
						
								System.out.print((char)posiEncript);
							}
					}
					
					else {
						posiAct = frase.charAt(i);
						
						posiEncript= posiAct - posi;
							
							if (posiEncript<97) {
								posiEncript= posiEncript+26;
								System.out.print((char)posiEncript);
							}else {
						
								System.out.print((char)posiEncript);
							}
					}					
			}
	}
}