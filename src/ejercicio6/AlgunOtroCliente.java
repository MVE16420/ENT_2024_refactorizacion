package ejercicio6;

public class AlgunOtroCliente { 

   private String direccion;
   private String localidad;
   private String codigoPostal;
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public void setLocalidad(String localidad) {
	this.localidad = localidad;
}
public void setCodigoPostal(String codigoPostal) {
	this.codigoPostal = codigoPostal;
}
@Override
public String toString() {
	return "AlgunOtroCliente [direccion=" + direccion + ", localidad=" + localidad + ", codigoPostal=" + codigoPostal
			+ "]";
}
   
   

} 
