package ejercicio5;

import java.util.ArrayList; 
import java.util.List; 

 
public class GestorAlmacen {

	private List<String> productos = new ArrayList<>();

	public static final int ADD = 1000;
	public static final int REMOVE = 2000;
	
	public void manejarProducto(String producto, int operacion) throws Exception {

		if(productos.contains(producto)&&operacion==REMOVE) {
		    productos.remove(producto);
		    }

		    else if(!productos.contains(producto)&&operacion==ADD) {
		    productos.add(producto);   
		    }
		/*
		 * bloque de posibles errores
		 */

		    else if(operacion==ADD) {
		    throw new Exception("Imposible añadir, el producto ya está");
		    }

		    else if(operacion==REMOVE) {
		    throw new Exception("Imposible borrar, el producto no está");
		    }

		    else throw new Exception("Operacion no soportada");
		   }
	}
	
	
	

	/*public void agregarProducto(String producto) {

		if (!productos.contains(producto)) {
			productos.add(producto);
			System.out.println("Producto '" + producto + "' agregado al almacén.");

		} else {
			System.out.println("El producto '" + producto + "' ya existe en el almacén.");
		}

	}

	public void eliminarProducto(String producto) {

		if (productos.contains(producto)) {
			productos.remove(producto);
			System.out.println("Producto '" + producto + "' eliminado del almacén.");

		} else {
			System.out.println("El producto '" + producto + "' no existe en el almacén.");

		}

	}
*/

