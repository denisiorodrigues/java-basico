package primeiroprojeto;

public class Main {
	public static void main(String [] args) {
		//Perfil.main("Tudo bem");]
		// Calculadora calculdora = new Calculadora();
		// calculdora.somar(5, 3);
		// calculdora.imprimirResultado();

		// calculdora.subtrair(10, 4);
		// calculdora.imprimirResultado();
		// String nome = "João";
		// String sobrenome = "João";

		// boolean resultado = nome == "João";
		// System.out.println(resultado);

		ConversorDeTemperatura conversor = new ConversorDeTemperatura();
		double fahrenheit = conversor.celsiusParaFahrenheit(25);
		System.out.println("25 graus Celsius em Fahrenheit: " + fahrenheit);

		double celsius = conversor.fahrenheitParaCelsius(77);
		System.out.println("77 graus Fahrenheit em Celsius: " + celsius);
	}
}
