package excepciones;

public class IngredienteRepetidoException extends HamburguesaException {

	
	
	
	public int iRepetido(String ingredientes, String nombreIngrediente)
	{
		int resp = 0;
		
		if (ingredientes.contains(nombreIngrediente));
		resp = 1;
		else
			resp = 0;
			
		return resp;
			
			
			
		
	}
	
	
}
