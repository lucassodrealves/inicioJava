package opCondicionais;
import java.util.Scanner;

public class um {
	public static void main(String[] args) {
		
		
		
		Scanner ler=new Scanner(System.in);
		
		double nU,nD,nT,nMaior=0,nMenor=0,nMedio=0;
		
		
		
		System.out.println("Tal programa recebe tr�s n�meros e os coloca em ordem crescente");
		
		//D� para ler os tr�s n�meros de uma s� vez
		System.out.println("Um n�mero?");
		nU=ler.nextDouble();
		System.out.println("Outro n�mero?");
		nD=ler.nextDouble();
		System.out.println("O �ltimo?");
		nT=ler.nextDouble();
		
		
		//Seis ordens podem serem definidas em op.Relacionais com tentativas recorrentes de n por num., defino ordens em impress�o a cada tentativa completa;de menor a maior-o que sobra
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
