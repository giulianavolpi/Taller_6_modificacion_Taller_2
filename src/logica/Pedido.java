package logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pedido {
	
	private static Object productosPedidos;
	Integer numeroPedidos= 0;
	int idPedido =1;
	String nombreCliente = "";
	String direccionCliente = "";
			

	public Pedido(String nombreCliente, String direccionCliente) {
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
	
	}
	
	public int getIdPedido()
	{
		
		int idPedido = Pedido.get(infoPersonalPedido[2]);
		return idPedido;
	}
	
		
	public void agregarProducto(Producto nuevoItem)
	{
		
		List<String> productosPedido = new ArrayList<>();
		
		for (Map.Entry<String, String> elPedido : Pedido.pedido.entrySet()) {
		    String nombre = elPedido.getKey();
		    String precio = elPedido.getValue();
		    productosPedido.add(nombre,precio);
		    
		}
		String nombreNuevo = nuevoItem.nombre;
		double precioNuevo = nuevoItem.precio;
		
		productosPedido.add(nombreNuevo,precioNuevo);
		
	}
	
	private double getPrecioNetoPedido()
	{
		double precioNeto = 0;
		List<Tuple<String, Integer>> productosPedidos = Pedido.productosPedidos ;
		for (Tuple<String, Integer> productosPedidos : tupleList) {

		    int precio = tuple.getSecond();
		    precioNeto =  precioNeto + precio;
		}
		
		return precioNeto;
	}
	
	private double getPrecioIVAPedido()
	{
		double iva = 0.19;
		double precioIVA = getPrecioNetoPedido()* iva ;
		return precioIVA;
	}
	
	private double getPrecioTotalPedido()
	{
		double precioTotal = getPrecioNetoPedido() + getPrecioIVAPedido();
		
		return precioTotal;
	}
	
	
	
	private String generarTextoFactura()
	{
		String factura = "Factura de su pedido \n"
				+ "Elementos ordenados: " + Pedido.get(productosPedidos)
				+ "Precio Neto: " + getPrecioNetoPedido() 
				+ "Impuesto IVA: " + getPrecioIVAPedido()
				+ "Precio Total del pedido" + getPrecioTotalPedido() ;
		return factura ;
	}
	

}

