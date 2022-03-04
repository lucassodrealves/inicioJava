package vetoresMatrizes;
import java.util.Scanner;
public class um {
	public static void main(String[] args) {
		
		
		Scanner ler=new Scanner(System.in);
		
		int nUm[][]=new int[4][6];
		int nDois[][]=new int[4][6];
		int mUm[][]=new int[4][6];
		int mDois[][]=new int[4][6];
		
		
for(int l=0;l<nUm.length;l++) {
	for(int c=0;c<nUm[l].length;c++) {
		
		
		System.out.println("Por favor, da 1ª matriz o item de linha"+" "+(l+1)+" "+"e coluna"+" "+(c+1)+".");
		nUm[l][c]=ler.nextInt();
		
}
}

for(int l=0;l<nDois.length;l++) {
	for(int c=0;c<nDois[l].length;c++) {
		
		System.out.println("Por favor, da 2ª matriz o tem de linha"+" "+(l+1)+" "+"e coluna"+" "+(c+1)+".");
		nDois[l][c]=ler.nextInt();
		
				
		
	}
	

			

			
			
		}
for(int l=0;l<mUm.length;l++) {
	for(int c=0;c<mUm[l].length;c++) {
	
	
mUm[l][c]=nUm[l][c]+nDois[l][c];
	
	System.out.print(mUm[l][c]+"|");

	
	
}
	System.out.println();
}
for(int l=0;l<mDois.length;l++) {
	for(int c=0;c<mDois[l].length;c++) {
		
mDois[l][c]=nUm[l][c]-mDois[l][c];

   System.out.print(mDois[l][c]+"|");
   
		
		
		
	}
	System.out.println();
	

	
	
}




			
		
		
		
	}

}
