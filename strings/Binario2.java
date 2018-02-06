import java.util.Scanner;
public class Binario2 {
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
		int diferencia = 0;
		
			if (binario1.length()>binario2.length()) {
				numlargo=binario1;
				numcorto=binario2;
				
			}else {
				numlargo=binario2;
				numcorto=binario1;	
			}
			diferencia = numlargo.length() - numcorto.length();
			
			for (int i = numlargo.length()-1; i >= 0; i--) {
											
				
					num1=numlargo.charAt(i) - 48;
					if (i-diferencia>=0) {
						num2=numcorto.charAt(i-diferencia) - 48;
					}else {
					num2=0;}				
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
