package Colecao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import Colecao.Estoque;


public class Um {
	
	public static void main(String[] args) {
		char b;
		Scanner ler=new Scanner(System.in);
		Estoque a=new Estoque();
		String c;
		Menu m=new Menu();
		
	int i=99;
	int h=0;
		
		
	
		
		ArrayList<String> d=new ArrayList<>();
		for( i=0;i<=99;i++) {
			
		    
			Menu.Menu();
			
			m.colocaComando(ler.next().charAt(h));
			b=m.pegaComando();
			
		
		switch(b) {
		
		case 'a':
			
			System.out.println("Qual o nome do item a ser adicionado ao estoque?");
			ler.nextLine();
			
			
			d.add(ler.nextLine()+"."+i);
			
		
			
			
			
			
			
			
			
		break;
		
		case 'b':
			
			System.out.println("Qual o número do item a ser removido?");
			ler.nextLine();
			d.remove(ler.nextLine());
			Collections.sort(d);
			System.out.println(d);
			
			i--;
			
			
		break;
			
		case 'c' :
			
		
	      
			System.out.println("Qual o número do item a ser atualizado?");
			ler.nextLine();
		    d.remove(ler.nextLine());
			System.out.println("Digite seu novo nome:");
			ler.nextLine();
	        d.add(ler.nextLine()+"."+i);
	        
	 
			Collections.sort(d);
			
			System.out.println(d);
		
			
	        
			
			
			
			
			
		
				i--;
		
				
				
			
			
				
				
				
			
			
			break;
			
		case 'd':
			
			
			a.colocaItens(d);
			
			
			
			Collections.sort(a.pegaItens());
			
			System.out.println(a.pegaItens());
			
			i--;
			break;
			
		case 'e':
			
			ler.close();
			
			break;
			
			
			
		    
		   

		
		
		
		}
		
		
		
		
		}
		
		
		
		
	}

}
