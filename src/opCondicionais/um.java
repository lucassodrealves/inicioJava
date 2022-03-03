package opCondicionais;
import java.util.Scanner;

public class um {
	public static void main(String[] args) {
		
		
		
		Scanner ler=new Scanner(System.in);
		
		double nU,nD,nT,nMaior=0,nMenor=0,nMedio=0;
		
		
		
		System.out.println("Tal programa recebe três números e os coloca em ordem crescente");
		
		//Dá para ler os três números de uma só vez
		System.out.println("Um número?");
		nU=ler.nextDouble();
		System.out.println("Outro número?");
		nD=ler.nextDouble();
		System.out.println("O último?");
		nT=ler.nextDouble();
		
		
		//Seis ordens podem serem definidas em op.Relacionais com tentativas recorrentes de n por num., defino ordens em impressão a cada tentativa completa;de menor a maior-o que sobra
		if(nU>nMaior) {
			
		nMaior=nU;
			
		}
		
		if(nD>nMaior) {
			
			
		nMaior=nD;
		}
		if(nT>nMaior) {
			
		
		nMaior=nT;
		
		}
		
		nMenor=nU;
		
		if(nD<nMenor) {
			
			nMenor=nD;
		}
		if(nT<nMenor) {
			nMenor=nT;
		}
		if(nU!=nMaior && nU!=nMenor) {
			
			
			nMedio=nU;
		}
		if(nD!=nMaior && nD!=nMenor) {
			
			nMedio=nD;
		}
		if(nT!=nMaior && nT!=nMenor) {
			
			nMedio=nT;
			
		}
		
		System.out.println(nMenor+","+nMedio+","+nMaior);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ler.close();
		
		
		
	}
	

}
