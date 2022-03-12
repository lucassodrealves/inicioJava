package Colecao;
import java.util.ArrayList;

public class Estoque  {
	
	private ArrayList<String>itens;
	
	
	public ArrayList<String> pegaItens() {
		
		return itens;
	}
	public void colocaItens(ArrayList<String> item) {
		
		this.itens=item;
		
	}
    
	/*public void apagaItem(int i) {
		
		this.itens.remove(i);
		
		
	}*/
	
			
		
	
}
