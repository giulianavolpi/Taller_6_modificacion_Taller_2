package logica;

import java.util.ArrayList;
import java.util.List;

public class ProductoMenu implements Producto {
	String nombre = "";
	Integer precioBase = 0;
			
	public List<String> ProductoMenu(String nombre, Integer precioBase) {
		// TODO Auto-generated constructor stub
	
	List<String> listaMenu = new ArrayList<>();
	listaMenu.add(nombre,precioBase);
	return listaMenu;

	}
}
