package programaçãoSequencial;
import java.util.Scanner;

public class tres {
	public static void main(String[] args){
		
		
		Scanner ler=new Scanner(System.in);
		
		double n,nDois,nU,mP;
		
		
		
		System.out.println("O programa calcula a média ponderada de três notas com pesos dois,três e cinco");
		System.out.println("Insira a de peso dois:");
		n=ler.nextDouble();
		System.out.println("Insira a de peso três:");
		nDois=ler.nextDouble();
		System.out.println("Insira a de peso cinco:");
		nU=ler.nextDouble();
		
		
		mP=((n*2)+(nDois*3)+(nU*5))/10;
		
		System.out.println("A média ponderada dessas notas deu"+" "+mP);
		
		ler.close();
		
		
		
		
	}

}
