package game;

import java.util.Random;
import java.util.Scanner;

public class AdvinheONumero {
	public static void main(String[] args) {
		
		int tentativas = 0;
		Scanner scanner = new Scanner(System.in);
		
		int numeroGerado = new Random().nextInt(100);
		int numeroDigitado = 0;
		
		System.out.println("ADVINHE O NÚMERO");
		
		while(tentativas < 5) {
			System.out.println("Digite um número entre 0 e 100: ");
			numeroDigitado = scanner.nextInt();
			
			if(numeroGerado == numeroDigitado) {
				System.out.println("/nParabéns você acertou o número em %d.. aewwww ... ".formatted(tentativas));
				break;
			} else if(numeroGerado > numeroDigitado) {
				System.out.println("O número digitado é menor que o número gerado.");
			} else {
				System.out.println("O número digitado é maior que o número gerado.");
			}	
		}
		
		if(numeroGerado != numeroDigitado) {
			System.out.println("Você não conseguiu acertar em 5 tentativas.");	
			System.out.println("FIM DE JOGO! \n Acabaram suas tentativas. O númeo era %d".formatted(numeroGerado));
			
		}
		
	}
}
