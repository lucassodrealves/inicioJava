package programa��oSequencial;
import java.util.Scanner;
public class dois {
	public static void main(String[]args) {
		
		Scanner ler=new Scanner(System.in);
		
	
		int s,m,h,sF;
		
		System.out.println("O programa l� um evento em uma f�brica expresso em segundos e o mostra em horas minutos e segundos");
		System.out.println("Quantos segundos o evento tem?");
		s=ler.nextInt();
		
		h=s/3600;
		m=(s%3600)/60;
		sF=(s%3600)%60;
		
		
		
		
		
		
		System.out.println("Esse evento dessa f�brica tem"+" "+h+"h"+" "+m+"min"+" "+sF+"s");
		
		ler.close();
		
		
		
		
		
	}

}
