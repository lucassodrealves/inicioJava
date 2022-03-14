package Colecao;

import java.util.Collections;

public class Menu {
	
	private char comando;
	
	
	public char pegaComando() {
		return comando;
	}
	
	public void colocaComando(char comando) {
		
		
		this.comando=comando;
	}
	
	public static void Menu() {
	
		
	System.out.println("Estoque !");
	System.out.println("Digite o que deseja fazer no estoque:\n a : Adicionar um item\n b :Tirar um item\n c :Mudar um item\n d: Apresentar todos os dados inseridos\n e:Sair do sistema");
	
	
	}

	}
