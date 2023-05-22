package pruebas_unitarias;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;


public class ProductoMenuTest {

	@Test 
	String nombre = "";
	Integer precioBase = 0;
	
	public void ProductoMenuTest() {
		 int resultado = PrductoMenu(String nombre, Integer precioBase);
		
		Assert.assertEquals(x ,resultado)	
	}
	
	@Before 
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	public int List<String> java.util.List<String> ProductoMenu(String nombre, Integer precioBase) {
		// TODO Auto-generated constructor stub
	
	List<String> listaMenu = new ArrayList<>();
	listaMenu.add(nombre);
	return listaMenu;

}
