package programaçãoSequencial;
import java.util.Scanner;
public class um {
	public static void principal(String[] args) {
		
		int an,m,d,dT;
		
		Scanner ler=new Scanner(System.in);
		System.out.println("O programa pede sua idade em anos, meses e dias e a mostra apenas em dias");
		
		System.out.println("Quantos anos você tem de vida?");
		an=ler.nextInt();
		System.out.println("Quantos meses você tem de vida");
		m=ler.nextInt();
		System.out.println("Quantos dias você tem de vida?");
		d=ler.nextInt();
		
		dT=(an*365)+(m*30)+d;
		
		System.out.println("Você tem"+" "+dT+" "+"dias de vida.");
		
		ler.close();
		
		
		
	}

}
