package ejercicio8;

public class Calculadora { 

	/**
	 * 
	 * @param sumando1
	 * @param sumando2
	 * @return
	 */
    public int sumar(int sumando1, int sumando2) { 

        return sumando1 + sumando2; 
    } 

/**
 * 
 * @param minuendo
 * @param sustraendo
 * @return
 */
    public int restar(int minuendo, int sustraendo)  { 

        return minuendo - sustraendo; 
    } 

/**
 * 
 * @param factor1
 * @param factor2
 * @return
 */
    public int multiplicar(int factor1, int factor2) { 

        return factor1 * factor2; 
    } 

/**
 * 
 * @param dividendo
 * @param divisor
 * @return
 * @throws Exception
 */
    public int dividir(int dividendo, int divisor) throws Exception { 

        if (divisor == 0) { 

            throw new Exception ("Error: No se puede dividir por cero.");
        } 

        return dividendo / divisor; 
    } 

/**
 * 
 * @param radio
 * @return
 */
    public double calcularAreaCirculo(double radio) { 

        return Math.PI * radio * radio; 
    } 

     
/**
 * 
 * @param radio
 * @param altura
 * @return
 */
    public double calcularVolumenCilindro(double radio, double altura) { 

        return calcularAreaCirculo(radio) * altura; 
    }  

} 
