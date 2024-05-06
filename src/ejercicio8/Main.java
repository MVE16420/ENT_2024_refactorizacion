package ejercicio8;

public class Main {

	public static void main(String[] args) throws Exception { 

        Calculadora calc = new Calculadora(); 

        System.out.println("Suma: " + calc.sumar(10, 5)); 
        System.out.println("Resta: " + calc.restar(10, 5)); 
        System.out.println("Multiplicación: " + calc.multiplicar(10, 5)); 
        System.out.println("División: " + calc.dividir(10, 5)); 
        System.out.println("Área del círculo: " + calc.calcularAreaCirculo(5)); 
        System.out.println("Volumen del cilindro: " + calc.calcularVolumenCilindro(5,10)); 

    } 

} 