package opCondicionais;
import java.util.Scanner;

public class tres {
	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		int n,r,p;
		
		System.out.println("Tal programa pede um número, diz se ele é par ou ímpar;se é par faz sua razi quadrada, se é ímpar o eleva ao quadrado");
		System.out.println("Um número?");
		n=ler.nextInt();
		
		if(n%2==0) {
			
			System.out.println("O número é par!");
			
		
			
			for(int i=0;i<=n;i++) {
				
				if(i*i==n){
					r=i;
				
			
	       
			
			
			System.out.println("Sua raiz quadrada é"+" "+r);
			}
			
			}
			
			}
		else {
			
			System.out.println("O número é ímpar!");
			p=(n*n);
			System.out.println("Tal ao quadrado dá"+" "+p);
		}
		}
		
		
		
		
		
	}


