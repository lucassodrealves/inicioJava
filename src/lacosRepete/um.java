package lacosRepete;
import java.util.Scanner;
public class um {
	public static void main(String[] args) {
		
		
		Scanner ler=new Scanner(System.in);
		
		int i=0, hA=0, mN=0, pNC=0,pVN=0, oC=0, pC=0;
		
		
		int idade[]=new int[150];
		int gen[]=new int[150];
		int op[]=new int[150];
		
		while(i<150) {
			
			
			
			System.out.println("Qual � a sua idade?");
			idade[i]=ler.nextInt();
			System.out.println("Qual � seu gen�ro?\n1.Masculino\n2.Feminino\n3.Outro");
			gen[i]=ler.nextInt();
			System.out.println("Qual op��o voc� �\n1.Calme\n2.Nervose\n3.Agressive");
			op[i]=ler.nextInt();
			
			
			
		if(gen[i]==1 && op[i]==3) {
			
			hA++;
		}
		if(gen[i]==2 && op[i]==2) {
			
			mN++;
			
		}
		if(idade[i]>40 && op[i]==2) {
			
			
			pVN++;
			
		}
		if(idade[i]<18 && op[i]==1) {
			
	        pNC++;
		}
			
		if(gen[i]==3 && op[1]==1) {
			
			
			oC++;
		}
		if(op[i]==1) {
			pC++;
		}
		i++;
		}
		
		System.out.println("O n�mero de homens agressivos �"+ " "+hA+"\n"+
		 
				 "  O n�mero de mulheres nervosas � "+" "+mN+"\n"+
				
				 "            O n�mero de pessoas com mais de quarenta anos nervosas �"+" "+pVN+"\n"+
			
				 "            O n�mero de pessoas com menos de dezoito anos calmas � "+" "+pNC+"\n"+
				
				 "            O n�mero de outros em g�nero calmes �"+" "+oC+"\n"+
				
				 "            o n�mero de pessoas calmas �"+" "+pC);
		
		
		
	}
}
