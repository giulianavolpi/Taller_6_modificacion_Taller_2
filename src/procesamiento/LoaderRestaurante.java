package procesamiento;
import logica.Ingrediente;
import logica.Aplicacion;
import logica.Combo;
import logica.Pedido;
import logica.Producto;
import logica.ProductoAjustado;
import logica.ProductoMenu;
import logica.Restaurante;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class LoaderRestaurante {
		// TODO Auto-generated constructor stub
		public static  Calculadora cargarArchivo() throws FileNotFoundException, IOException
		{
			Map<String, Integer> menu = new HashMap<>();
			Map<Ingrediente, Integer> ingredientes = new HashMap<>();
			Map<Combo, String> combos = new HashMap<>();
			
			Map<Ingrediente, Integer> bebidas = new HashMap<>();

		
			BufferedReader br1 = new BufferedReader(new FileReader("menu.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("ingredientes.txt"));
			BufferedReader br3 = new BufferedReader(new FileReader("combos.txt"));
			BufferedReader br4 = new BufferedReader(new FileReader("bebidas.txt"));
			
			String linea1 = br1.readLine(); 
			String linea2 = br2.readLine(); 
			String linea3 = br3.readLine(); 
			String linea4 = br4.readLine();
			
			//CARGA DE DATOS MENÚ 
			while (linea1 != null) 
			{
				
				String[] partes = linea1.split(";");
				String nombre = partes[0];
				String precio = partes[1];
		
				
				menu.put(nombre, precio);
				linea3 = br3.readLine();
			}


	
				
				
				//CARGA DE DATOS INGREDIENTES  
				while (linea2 != null) 
				{
				
					String[] partes2 = linea1.split(";");
					String nombreIngrediente = partes2[0];
					String precioIngrediente = partes2[1];
			
					ingredientes.put(nombreIngrediente, precioIngrediente);
					linea3 = br3.readLine();
					
						
					}


					linea2 = br2.readLine(); 
					
					
					
					//CARGA DE DATOS COMBOS  
					while (linea3 != null) 
					{
						List<String> contenidoCombos = new ArrayList<>();
						String[] partes3 = linea1.split(";");
						String nombreCombo = partes3[0];
						String descuento = partes3[1];
						String hamburgesa = partes3[2];
						String papas = partes3[3];
						String gaseosa = partes3[4];
						
						
						contenidoCombos.add(descuento);
						contenidoCombos.add(hamburgesa);
						contenidoCombos.add(papas);
						contenidoCombos.add(gaseosa);
						
				
						combos.put(nombreCombo, contenidoCombos);
						linea3 = br3.readLine();
						
						
						}
					
					//CARGA DE DATOS BEBIDAS SOLO 
					while (linea4 != null) 
					{
	
						String[] partes3 = linea1.split(";");
						String nombreBebida = partes3[0];
						String precioBebida = partes3[1];
				
						
						bebidas.put(nombreBebida, precioBebida);
						linea3 = br4.readLine();
						
						
						}


						
			}

			br1.close();
			br2.close();
			br3.close();
			br4.close();

				//PREGUNTAR COMO
			System.out.println(menu);
			System.out.println(ingredientes);
			System.out.println(combos);
			System.out.println(bebidas);
			Calculadora elMenu = new Calculadora(menu, ingredientes, combos);
			return elMenu;
		}
		
	}


