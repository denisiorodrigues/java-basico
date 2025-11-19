package colecoes;

import java.util.HashMap;
import java.util.Map;

public class MapaDeClienes {
	public static void main(String[] args) {
		Map<Integer, String> clientes = new HashMap<>();
		
		clientes.put(1, "João");
		clientes.put(2, "Maria");
		clientes.put(3, "Serafina");
		
		System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));
	}
}
