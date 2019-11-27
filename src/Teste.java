
public class Teste{

	public static void main(String[] args) {

		FabricanteGuitarra fabrica = new FabricanteGuitarra();
		Instrumento instrumento1 = fabrica.getInstrumento("modelo clássico");
		Instrumento instrumento2 = fabrica.getInstrumento("modelo futurista");
		Instrumento instrumento3 = fabrica.getInstrumento("mais de 6 cordas");
		
		System.out.println(instrumento1.descricao());
		System.out.println(instrumento2.descricao());
		System.out.println(instrumento3.descricao());
	}

}
