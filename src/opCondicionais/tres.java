package opCondicionais;
import java.util.Scanner;

public class tres {
	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		int n,r,p;
		
		System.out.println("Tal programa pede um n�mero, diz se ele � par ou �mpar;se � par faz sua razi quadrada, se � �mpar o eleva ao quadrado");
		System.out.println("Um n�mero?");
		n=ler.nextInt();
		
		if(n%2==0) {
			
			System.out.println("O n�mero � par!");
			
		
			
			for(int i=0;i<=n;i++) {
				
				if(i*i==n){
					r=i;
				
			
	       
			
			
			System.out.println("Sua raiz quadrada �"+" "+r);
			}
			
			}
			
			}
		else {
			
			System.out.println("O n�mero � �mpar!");
			p=(n*n);
			System.out.println("Tal ao quadrado d�"+" "+p);
		}
		}
		
		
		
		
		
	}


