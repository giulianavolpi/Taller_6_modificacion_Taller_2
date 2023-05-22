package pruebas_unitarias;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import excepciones.PedidoException;
import logica.Pedido;
import logica.Producto;
import logica.Tuple;

public class PedidoTest {
	@Test 
	private static Object productosPedidos;
	Integer numeroPedidos= 0;
	static int idPedido =1;
	String nombreCliente = "";
	String direccionCliente = "";
	
	public void PedidoTest() {
		 int resultado = PrductoMenu(String nombreCliente, String direccionCliente);
		
		Assert.assertEquals(x ,resultado)	
	
	
	@Before 
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	public int  Pedido(String nombreCliente, String direccionCliente) {
		// TODO Auto-generated constructor stub
		Map<String, String > pedido = new HashMap<>();
		Map<String, String > totPedidos = new HashMap<>();
		
		Integer activo = 1;
		
		while (activo == 1)
		{
		List<String> infoPersonalPedido = new ArrayList<>();
		infoPersonalPedido.add(nombreCliente);
		infoPersonalPedido.add(direccionCliente);
		infoPersonalPedido.add(idPedido);
		
		
		List<Tuple<String, Integer>> productosPedidos = new ArrayList<>();
		
		pedido.put(productosPedidos, infoPersonalPedido);
		
		totPedidos.put(idPedido,pedido);
		}
		
		
		
		public void agregarProductoTest() {
			 int resultado = agregarProducto(Producto nuevoItem);
			
			Assert.assertEquals(x ,resultado)	
		
		
		@Before 
		public void setUp() {
			
		}
		
		@After
		public void tearDown() {
			
		}
		
		public void  agregarProducto(Producto nuevoItem)
		{
			
			List<String> productosPedidos = new ArrayList<>();
			
			try {
				for (Map.Entry<String, String> elPedido : Pedido.idPedido.entrySet()) {
				    String nombre = elPedido.getKey();
				    String precio = elPedido.getValue();
				    productosPedidos.add(nombre,precio);
				    
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					String nombreNuevo = nuevoItem.nombre;
					double precioNuevo = nuevoItem.precio;
					
					if (PedidoException.PedidoException(productosPedidos,precioNuevo)== 1)
						productosPedidos.add(nombreNuevo,precioNuevo);
					
		}
		
		
		
		public void getPrecioNetoPedidoTest() {
			 int resultado = getPrecioNetoPedido();
			
			Assert.assertEquals(x ,resultado)	
		
		
		@Before 
		public void setUp() {
			
		}
		
		@After
		public void tearDown() {
			
		}
		
		private double  getPrecioNetoPedido()
		{
			double precioNeto = 0;
			List<Tuple<String, Integer>> productosPedidos = Pedido.productosPedidos ;
			for (Tuple<String, Integer> productosPedidos : tupleList) {

			    int precio = tuple.getSecond();
			    precioNeto =  precioNeto + precio;
			}
			
			return precioNeto;
		}
		
		
		public void getPrecioIVAPedidoTest() {
			 int resultado = getPrecioIVAPedido();
			
			Assert.assertEquals(x ,resultado)	
		
		
		@Before 
		public void setUp() {
			
		}
		
		@After
		public void tearDown() {
			
		}
		
		private double  getPrecioIVAPedido()
		{
			double iva = 0.19;
			double precioIVA = getPrecioNetoPedido()* iva ;
			return precioIVA;
			}
			
			return precioIVA;
		}
	}
