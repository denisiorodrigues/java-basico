package colecoes;

import java.util.List;

public class CalculoEstatisticaDeNota {
	public static void main(String[] args) {
		List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
		
		List<Double> notasOrdenada = notas.stream().sorted().toList();
		double mediaDasNotas = (notas.stream().reduce(0.0, Double::sum) / notas.size());
		double menorNota = notasOrdenada.stream().min(Double::compare).get();
		double maiorNota = notasOrdenada.stream().max(Double::compare).get();
		
		System.out.println("A média das notas é: " + mediaDasNotas);
		System.out.println("A menor nota foi: " + menorNota);
		System.out.println("A maior nota foi: " + maiorNota);
	}
}
