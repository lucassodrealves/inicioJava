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
		
		vAnimais(c,"pregui�aUm");
		
		//Nome dos animais tem de serem iguais pois os objetos recebem os nomes dos String's ap�s a v�rgula e fazem a execu��o.
		//Nomes herdados de classe � classe
		
		
	}

}
