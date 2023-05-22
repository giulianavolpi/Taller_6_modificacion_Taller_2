package excepciones;

public class ProductoRepetidoException extends HamburguesaException{

	
	public int pRepetido(String menu, String nuevo)
	{
		int resp = 0;
		
		if (menu.contains(nuevo));
		resp = 1;
		else
			resp = 0;
			
		return resp;
			
			
			
		
	}
	
	
}
