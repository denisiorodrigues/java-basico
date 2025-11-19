package colecoes;

import java.util.List;
import java.util.stream.Collectors;

public class CalculoQuadradoDosNumeros {
	public static void main(String[] args) {
		List<Integer> numeros = List.of(2, 3, 5, 7, 11);
		
		List<Integer> numerosAoQuadrado = numeros.stream()
				.map(n -> n*n)
				.collect(Collectors.toList());
		
		System.out.println(numerosAoQuadrado);
	}
}
