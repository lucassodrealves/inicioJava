package Poo_ClasseseMetodos;

public class paciente {
	
	//Atributos
	
	private int idade;
	private String[] sintomas=new String[3];
	private boolean sedentarismo;
	private String nome;
	
	//Métodos
	
	public int getIdade() {
		
		return idade;
		
		
		
	}
	
	public void setIdade(int idade) {
		
		this.idade=idade;
		
	}
	
	public String getSintomasU(){
		
		
		return sintomas[0];
		
		
	}
	
	public String getSintomasD() {
		
		
		return sintomas[1];
		
		
	}
	
	public String getSintomasT() {
		
		
		
		return sintomas[2];
		
	}
	
	public void setSintomasU(String sintomasU) {
		this.sintomas[0]=sintomasU;
		
		
		
	}
	
	public void setSintomasD(String sintomasD) {
		
		this.sintomas[1]=sintomasD;
		
		
		
	}
	
	public void setSintomasT(String sintomasT) {
		this.sintomas[2]=sintomasT;
		
		
		
	}
	
	public boolean getSedentarismo() {
		
		
		
		return sedentarismo;
		
	}
	
	
	
	public void setSedentarismo(boolean sedentarismo) {
		
		this.sedentarismo=sedentarismo;
		
		
	}
	
	public String getNome() {
		
		return nome;
		
		
	}
	
	public void setNome(String nome) {
		
		
		this.nome=nome;
		
	}
	
void sentir() {
	
	
	System.out.println("Paciente tem sentidos aguçados");
	
	
}



void medicar(){
	
	System.out.println("Paciente faz automedicação!!");
	
	
	
	
	
}
	
	

}
