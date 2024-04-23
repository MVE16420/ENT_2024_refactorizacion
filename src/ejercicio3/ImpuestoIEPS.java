package ejercicio3;

public class ImpuestoIEPS extends Impuesto{

	@Override
	public double calcular(double ingresos) {
		
		return ingresos * 0.05;
	}

}
