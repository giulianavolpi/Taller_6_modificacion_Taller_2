package logica;
import logica.Pedido;

public interface Producto {
	public static final int precio = 0;
	public static final String nombre = "";
	
	
	public static String generarTextoFactura()
	{	String factura = Pedido.class.generarTextoFactura();
		return factura;
	}

}
