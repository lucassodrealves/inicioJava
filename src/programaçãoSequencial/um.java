package programa��oSequencial;
import java.util.Scanner;
public class um {
	public static void principal(String[] args) {
		
		int an,m,d,dT;
		
		Scanner ler=new Scanner(System.in);
		System.out.println("O programa pede sua idade em anos, meses e dias e a mostra apenas em dias");
		
		System.out.println("Quantos anos voc� tem de vida?");
		an=ler.nextInt();
		System.out.println("Quantos meses voc� tem de vida");
		m=ler.nextInt();
		System.out.println("Quantos dias voc� tem de vida?");
		d=ler.nextInt();
		
		dT=(an*365)+(m*30)+d;
		
		System.out.println("Voc� tem"+" "+dT+" "+"dias de vida.");
		
		ler.close();
		
		
		
	}

}
