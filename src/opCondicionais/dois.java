package opCondicionais;
import java.util.Scanner;
public class dois {
	public static void main(String[]args) {
		 
		Scanner ler=new Scanner(System.in);
		
		
		int id;
		
		System.out.println("O programa recebe uma idade e diz em qual categoria de roupas ela se encontra:infantil,juvenil ou adulto");
		System.out.println("uma idade?");
		id=ler.nextInt();
		
		if(id >= 10 && id <=15) {
			
			
			System.out.println("Infantil");
			
			
		}
		
		else if(id > 15 && id <= 17) {
			 System.out.println("Juvenil");
		}
		else if(id > 17 && id <=25) {
			System.out.println("Adulta");
			
		}
		else {
			
			
			System.out.println("Idade não confere nenhuma categoria repaldada.");
		}
		
		ler.close();
		
		
		
	}

}
