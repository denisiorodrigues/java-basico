package colecoes;

import java.util.List;
import java.util.stream.Collectors;

public class SelecionandoEmpregados {
	public static void main(String[] args) {
		List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
		
		List<String> funcionariosComMenosDeCincoCaracteres = funcionarios.stream()
				.filter(f -> f.length() <= 5)
				.collect(Collectors.toList());
		
		System.out.println(funcionariosComMenosDeCincoCaracteres);
	}
}
