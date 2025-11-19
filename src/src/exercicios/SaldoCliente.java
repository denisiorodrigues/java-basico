package exercicios;

import java.util.Scanner;

public class SaldoCliente {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double saldo = 5000.0;
		String nome = "Denisio Emanuel";
		String tipoDeConta = "Corrente";

		System.out.println("***********************");
		System.out.println("Dados iniciais do cliente:\n");
		System.out.println("Nome: " + nome);
		System.out.println("Tipo conta: " + tipoDeConta);
		System.out.println("Saldo inicial: R$ " + saldo);
		System.out.println("***********************");
		
		
		int opcao = 0;
		
		while(opcao != 4) {
			exibirMenu();
			opcao = leitura.nextInt();
			
			switch (opcao) {
			case 1: 
				System.out.println("Saldo atualizado: R$ " + saldo);
			case 2 :
				System.out.println("Informe o valor a receber:");
				double receita = leitura.nextDouble();
				saldo += receita;
				System.out.println("Saldo atualizado: R$ " + saldo);
			case 3 :
				System.out.println("Informe o valor que deseja transferir:");
				double valorAserTransferido = leitura.nextDouble();
				
				if (valorAserTransferido > saldo) {
					System.out.println("\r\nNão há saldo suficiente para fazer essa transferência.\r\n");
				} else {
					saldo -= valorAserTransferido;
					System.out.println("Saldo atualizado: R$ " + saldo);					
				}
			default:
				if (opcao != 4)
	System.out.println("Opção não encontrada.");
			}
			
		}
		
		System.out.println("Fim do programa!\n\r");
		
	}
	
	public static void exibirMenu() {
		String menu = """
Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:""";
		
		System.out.println(menu);
	}
}
