import java.util.Scanner;
public class alfabetica {
	static Scanner inputValue = new Scanner(System.in);
	  public static String leerCadena(String mensaje){
	      System.out.println(mensaje);
	      return inputValue.nextLine();
	  	}
	public static void main(String[] args) {
		
		String frase = leerCadena("Introduce una frase");
		int charAnt=' ';
		int charAct;
		boolean noloes=false;
		for (int i = 0; i < frase.length(); i++) {
			
				charAct= frase.charAt(i);
					if (charAnt>charAct) {
						noloes=true;
						break;
					}
			charAnt=charAct;
			} 
			if(noloes==false) {
				System.out.println("La palabra es alfabetica");
			}else {
				System.out.println("La palabra no es alfabetica");

			} 
	}	

}
