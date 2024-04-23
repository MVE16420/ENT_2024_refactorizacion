package ejercicio3;




public abstract class CalculadoraImpuestos {
	
public static final int IMPUESTO_IVA=1000;
public static final int IMPUESTO_ISR=1001;
public static final int IMPUESTO_IEPS=1002;

	public double calcularImpuestoTotal(double ingresos, int tipoImpuesto) throws Exception {

		double impuesto = 0;

		if (tipoImpuesto == IMPUESTO_IVA) {

			impuesto = CalcularIva(ingresos);

		} else if (tipoImpuesto == IMPUESTO_ISR) {
			impuesto = CalcularIsr(ingresos);
		} else if (tipoImpuesto == IMPUESTO_IEPS) {
			impuesto = ingresos * 0.05;
		} else {
			throw new Exception("Tipo de impuesto no valido");
		}

		return impuesto;
	}

	
	

}