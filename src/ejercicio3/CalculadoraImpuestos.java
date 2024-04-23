package ejercicio3;




public class CalculadoraImpuestos {
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

	private double CalcularIsr(double ingresos) {

		double impuesto;

		if (ingresos < 50000) {
			impuesto = ingresos * 0.20;
		} else {
			impuesto = ingresos * 0.30;
		}
		
		return impuesto;
	}

	private double CalcularIva(double ingresos) {

		double impuesto;

		if (ingresos < 10000) {
			impuesto = ingresos * 0.10;
		} else if (ingresos >= 10000 && ingresos < 50000) {
			impuesto = ingresos * 0.15;
		} else {
			impuesto = ingresos * 0.20;
		}

		return impuesto;
	}

}