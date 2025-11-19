package exercicios;

import java.util.Scanner;

public class ExercitarBasico {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		//Exercicio 1
		System.out.println("Digite um número: ");
		int numeroDigitado = leitura.nextInt();
		
		if(numeroDigitado > 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número Negativo");
		}
		
		//Exercicio 2
		System.out.println("Digite dois números");
		int primeiroNumero = leitura.nextInt();
		int segundoNumero = leitura.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			System.out.println("Números iguais");
		} else if (primeiroNumero > segundoNumero) {
			System.out.println("Número diferentes, onde o primeiro número é maior que o segundo número.");
		} else {
			System.out.println("Número diferentes, onde o segundo número é maior que o primeiro número.");
		}
	}
}
