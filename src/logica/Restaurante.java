package logica;
import logica.Pedido;
import procesamiento.LoaderRestaurante;
import java.io.File; 
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class Restaurante {
	
	

	public Restaurante() {
		// TODO Auto-generated constructor stub
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente)
	{
		return  Pedido(nombreCliente,direccionCliente);
	}
	
	public String cerrarYGuardarPedido()
	{
		String factura = Pedido.generarTextoFactura()
		return factura;
	}
	
	public Pedido getPedidoenCurso()
	{
		return pedido;
		
	}
	
	public ArrayList<Producto> getMenuBase()
	{	
		
		
		return productosMenu;
		
	}
	
	public ArrayList<Ingrediente> getIngredientes()
	{	
		List<String> Ingrediente = new ArrayList<>();
		for (String ing : Ingrediente) {
		    System.out.println(ing);
		}
		return null;
		
	}
	
	public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archiovCombos)
	{
		
	}
	
	private void cargarIngredientes(File archivoIngredientes)
	{
		Map<String, Integer> mapaIngrediente = procesamiento.LoaderRestaurante.cargarArchivo(archivoIngredientes); 
		for (Map.Entry<String, Integer> entry : mapaIngrediente.entrySet()) 
		{
		    System.out.println("Ingrediente: " + mapaIngrediente.getKey() + ", Precio: " + mapaIngrediente.getValue());
		}
	}
	
	private void cargarMenu(File archivoMenu)
	{
		Map<String, Integer> mapaMenu = procesamiento.LoaderRestaurante.cargarArchivo(archivoMenu); 
		for (Map.Entry<String, Integer> entry : mapaMenu.entrySet()) 
		{
		    System.out.println("Elemento: " + mapaMenu.getKey() + ", Precio: " + mapaMenu.getValue());
		}
		
	}
	
	private void cargarCombos(File archivoCombos)
	{
		Map<String, Integer> mapaCombos = procesamiento.LoaderRestaurante.cargarArchivo(archivoCombos); 
		for (Map.Entry<String, Integer> entry : mapaCombos.entrySet()) 
		{
		    System.out.println("Combo: " + mapaCombos.getKey() + ", Precio: " + mapaCombos.getValue());
		}
	}
}
