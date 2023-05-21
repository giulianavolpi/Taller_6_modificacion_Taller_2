package logica;
import logica.Pedido;

public interface Producto {
	Integer precio = getPrecio();
	String nombre = getNombre();
	
	public static int getPrecio()
	{
		return precio;
	}
	
	public static String getNombre()
	{
		return nombre ;
	}
	
	public static String generarTextoFactura()
	{	String factura = Pedido.class.generarTextoFactura();
		return factura;
	}

}
