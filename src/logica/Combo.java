package logica;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import logica.Restaurante;
import procesamiento.LoaderRestaurante;

public class Combo implements Producto {
	
	Double descuento = 0.0;
	String nombreCombo = "";
	

	public Combo(String nombre, Double descuento) {
		// TODO Auto-generated constructor stub
		Map<Combo, String> elCombo= combo.get(nombre) ;
		double precioCombo = elCombo.get(contenidoCombos);
	}
	
	public void agregarItemACombo(Producto ItemCombo)
	{
		List<String> productosCombo = new ArrayList<>();
		
		for (Map.Entry<Combo, Integer> elCombo : map.entrySet()) {
		    Combo nombre = elCombo.getKey();
		    Integer precio = elCombo.getValue();
		    productosCombo.add(nombre,precio);
		    
		}
		String nombreNuevo = ItemCombo.nombre;
		double precioNuevo = ItemCombo.precio;
		
		productosCombo.add(nombreNuevo,precioNuevo);
	}

}
