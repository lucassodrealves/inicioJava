package herancaT;

public class iAnimais {
	public static void vAnimais(pAnimais U, String nome) {
		
		U.p(nome);
		
	}
	
	public static void main(String[] args) {
		
		cavalo a=new cavalo();
		
		vAnimais(a, "cavaloUm");
		
		cachorro b=new cachorro();
		
		vAnimais(b, "cachorroUm");
		
		preguica c=new preguica();
		
		vAnimais(c,"preguiçaUm");
		
		//Nome dos animais tem de serem iguais pois os objetos recebem os nomes dos String's após a vírgula e fazem a execução.
		//Nomes herdados de classe à classe
		
		
	}

}
