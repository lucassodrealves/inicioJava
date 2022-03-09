package herancaT;

public class Animal {
	private String nome;
	private int idade;
	
	public String pegaNome() {
		
		
		return nome;
	}
	public void colocaNome(String nome) {
		
		
		this.nome=nome;
		
		
	}
	public int pegaIdade() {
		
		return idade;
	}
	public void colocaIdade(int idade) {
		
		
		this.idade=idade;
	}
	void som(String nome) {
		this.nome=nome;
		
	}

}
