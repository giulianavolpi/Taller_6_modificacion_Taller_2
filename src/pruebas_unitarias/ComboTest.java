package pruebas_unitarias;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import logica.Combo;
import logica.Producto;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

public class ComboTest {

	@Test
	Double descuento = 0.0;
	String nombreCombo = "";
	
	public void ComboTest() {
		 int resultado = Combo(String nombre, Double descuento);
		
		Assert.assertEquals(x ,resultado)	
	
	
	@Before 
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	public int  Combo(String nombre, Double descuento) {
		// TODO Auto-generated constructor stub
		Map<Combo, String> elCombo= combo.get(nombre) ;
		double precioCombo = elCombo.get(contenidoCombos);
	}
	
	
	
	public void agregarItemAComboTest() {
		 int resultado = agregarItemACombo(Producto ItemCombo);
		
		Assert.assertEquals(x ,resultado)	
	
	
	@Before 
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	public void  agregarItemACombo(Producto ItemCombo)
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
