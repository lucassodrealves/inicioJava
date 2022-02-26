package programaçãoSequencial;
import java.util.Scanner;
public class quatro {
	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		double c,d,cF;
		
		System.out.println("O programa pega o custo de um carro e o retorna com seu preço final");
		System.out.println("Custo?");
		c=ler.nextDouble();
		
		d=(c*0.28);
		cF=(d+(d*0.45)+c);
		
		System.out.println("O valor final da máquina é"+" "+cF);
		
		
		ler.close();
		
		
		
		
		
	}
	
	

}
