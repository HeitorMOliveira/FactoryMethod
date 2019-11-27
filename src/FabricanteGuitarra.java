
public class FabricanteGuitarra {

   public static Instrumento getInstrumento(String criterio) {
	   if(criterio.equals("mais de 6 cordas")) {
		   return new Ibanez();
	   }else if(criterio.equals("modelo clássico")) {
		   return new Gibson();
	   }else if(criterio.equals("modelo futurista")){
		   return new Strandberg();
	   }
	   return null;
	   
   }
}
