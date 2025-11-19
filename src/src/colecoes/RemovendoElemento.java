package colecoes;

import java.util.LinkedList;
import java.util.List;

public class RemovendoElemento {
	public static void main(String[] args) {
		List<String> funcionarios = new LinkedList<>();
		funcionarios.add("Joana");
		funcionarios.add("Lucas");
		funcionarios.add("Pedro");
		funcionarios.add("Antônio");
		
		System.out.println(funcionarios);
		
		funcionarios.remove(2);
		
		System.out.println(funcionarios);
	}
}
