package Poo_ClasseseMetodos;

public class pCliente {
	public static void main(String[] args) {
		
		
		cliente Um=new cliente();
		cliente Dois=new cliente();
		
		
	   Um.setNome("Lucas");
	   Um.setCPF("11122233355");
	   Um.setNivel("Alto");
	   
		
		
		System.out.println(Um.getNome());
		System.out.println(Um.getCPF());
		System.out.println(Um.getNivel());
		Um.estar();
		Um.comprar();
		Um.pagar();
		
		
		
		
		Dois.setNome("Alfredo");
		Dois.setCPF("99955522233");
		Dois.setNivel("Baixo");
		
		System.out.println(Dois.getNome());
		System.out.println(Dois.getCPF());
		System.out.println(Dois.getNivel());
		Dois.estar();
		Dois.comprar();
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
