package Poo_ClasseseMetodos;

public class pPaciente {
	public static void main(String[] args) {
		
		
paciente Um=new paciente();

Um.setNome("Jaías");
Um.setIdade(59);
Um.setSedentarismo(true);
Um.setSintomasU("Espirros");
Um.setSintomasD("Dor nas juntas");
Um.setSintomasT("Dor de cabeça");




System.out.println(Um.getNome());
System.out.println("Sintomas:\n"+Um.getSintomasU());
System.out.println(Um.getSintomasD());
System.out.println(Um.getSintomasT());
System.out.println("Sedentarismo:"+Um.getSedentarismo());
System.out.println(Um.getIdade()+" "+"anos");
Um.medicar();
Um.sentir();


		
		
	}

}
