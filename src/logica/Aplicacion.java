package logica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import procesamiento.LoaderRestaurante;

public class Aplicacion {

	public Aplicacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	MÉTODO PRINCIPAL 
	 */
	public static void main(String[] args)
	{
		ConsolaHamburguesas consola = new ConsolaHamburguesas();
		Aplicacion.ejecutarAplicacion();
	}
	
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Cargar un archivo ");
		System.out.println("2. Mostrar Menú ");
		System.out.println("3. Iniciar Nuevo Pedido");
		System.out.println("4. Agregar un elemento a un pedido");
		System.out.println("5. Cerrar pedido + factura");
		System.out.println("6. Consultar info de un pedido");
		System.out.println("7. Salir de la aplicación\n");
		
		
		
	}
	
	public void ejecutarOpcion(int opcionSeleccionada)
	{
		
		private CalculadoraHamburguesas elMenu;
		
		
		System.out.println("Bienvenido al menú de Hamburgesas \n");

			boolean continuar = true;
			while (continuar)
			{
				try
				{
					ejecutarMostrarMenu();		
					int opcionSeeccionada = Integer.parseInt(input("Por favor seleccione una opción: "));
					if (opcionSeeccionada == 1)
						ejecutarCargarDatos();
					else if (opcionSeeccionada == 2 && elMenu != null)
						ejecutarMostrarMenu();
					else if (opcionSeeccionada == 3 && elMenu != null)
						ejecutarIniciarPedido();
					else if (opcionSeeccionada == 4 && elMenu != null)
						ejecutarAgregarElemento();
					else if (opcionSeeccionada == 5 && elMenu != null)
						ejecutarCerrarPedido();
					else if (opcionSeeccionada == 6 && elMenu != null)
						ejecutarInfoPedido();
					else if (opcionSeeccionada == 7 && elMenu != null)
				
						System.out.println("Saliendo de la aplicación ...");
						continuar = false;
					
					else if (elMenu == null)
					{
						System.out.println("Para poder ejecutar esta opción primero debe cargar un archivo de atletas.");
					}
					else
					{
						System.out.println("Por favor seleccione una opción válida.");
					}
				
				catch (NumberFormatException e)
				{
					System.out.println("Debe seleccionar uno de los números de las opciones.");
				}
				
				/**
				 * MÉTODOS
				 */
				private void ejecutarCargarDatos()
				{
					System.out.println("\n" + "Cargar los datos del restaurante" + "\n");

					try
					{
						elMenu = LoaderRestaurante.cargarArchivo();
						
					}
				

				}
				
			
				
				private void ejecutarIniciarPedido()
				{
				
					String nombreCliente = input("Por favor ingrese su nombre: ");
					String pedido = input("Por favor ingrese el número de lo que desea ordenar: ");
					String direccionCliente = input("Por favor ingrese su dirección: ");
					Pedido nuevoPedido = Pedido.Pedido(nobreCliente, direccionCliente);
					
				}
				
				private void ejecutarAgregarElemento()
				{
					
					
					System.out.println("Los ingredientes adicionales son: ");
					System.out.println(ingredientes);	
					String ingredAdicional = input("Por favor ingrese el número del ingrediente adicional que desea ordenar: ");
					Pedido nuevoElemento= Pedido.agregarProducto(ingredAdicional);
				}
				
				private void ejecutarCerrarPedido()
				{
					String cerrar = Pedido.generarTextoFactura()
				}
				
				private void ejecutarInfoPedido()
				{
					String idPedido = input("Para consultar su pedido ingrese el ID: ");
					Map<String, Integer> pedido = Restaurante.cerrarYGuardarPedido();
				}



				{
					try
					{
						
						BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
						return reader.readLine();
					}
					catch (IOException e)
					{
						System.out.println("Error leyendo de la consola");
						e.printStackTrace();
					}
					return null;
				}
				}
			}
				
