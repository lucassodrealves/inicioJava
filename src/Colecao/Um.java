package Colecao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import Colecao.Estoque;
import java.util.Iterator;

public class Um {
	
	public static void main(String[] args) {
		char b;
		Scanner ler=new Scanner(System.in);
		Estoque a=new Estoque();
	
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
			
			
			d.add(ler.next()+"."+(i+1));
			
		
			
			
			
			
			
			
			
		break;
		
		case 'b':
			Iterator<String> iterator=d.iterator();
			
			System.out.println("Qual o nome do item a ser removido?");
			String item=ler.next();
			
			while( iterator.hasNext()) {
			String c =iterator.next();
			
			if(c==item) {
			iterator.remove();
			}
			}
		
			System.out.println(d);
			
			i--;
			
			
		break;
			
		case 'c' :
			
		
	     
			System.out.println("Qual o nome do item a ser atualizado?");
		
		 
			        
			 
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
