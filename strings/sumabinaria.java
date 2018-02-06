import java.util.Scanner;
public class sumabinaria {
	static Scanner inputValue = new Scanner(System.in);
	  public static String leerCadena(String mensaje){
	      System.out.println(mensaje);
	      return inputValue.nextLine();
	  	}
	public static void main(String[] args) {
		String binario1 = leerCadena("Introduce un número binario");
		String binario2 = leerCadena("Introduce otro número binario");
		String sumbinario = "";
		String numlargo = "";
		String numcorto = "";
		int num1, num2, suma;
		int acarreo = 0;
		
		
			if (binario1.length()>binario2.length()) {
				numlargo=binario1;
				numcorto=binario2;
				
			}else {
				numlargo=binario2;
				numcorto=binario1;	
			}
			
			for (int j = numcorto.length(); j <numlargo.length(); j++) {
				numcorto = "0" + numcorto;
			}
			for (int i = numlargo.length()-1; i >= 0; i--) {
											
				
					num1=numlargo.charAt(i) - 48;
					num2=numcorto.charAt(i) - 48;					
					suma = num1 + num2 + acarreo;
					
						if (suma==0) {
							acarreo = 0;
							sumbinario= "0"+ sumbinario ;					
							}else if (suma==1) {
								acarreo = 0;
								sumbinario= "1" +sumbinario ;
							}else if (suma==2) {
								acarreo = 0;
								sumbinario= "0" + sumbinario;
								acarreo=1;
							}else if(suma==3) {
								acarreo = 0;
								sumbinario= "1" + sumbinario;
								acarreo=1;
							}
											
				}
			if (acarreo==1) {
				sumbinario= "1" + sumbinario;	
			}
			System.out.println(sumbinario);
			}
			
	}


