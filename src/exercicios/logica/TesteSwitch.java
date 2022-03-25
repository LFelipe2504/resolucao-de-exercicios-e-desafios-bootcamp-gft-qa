package exercicios.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Teste da estrutura lógica "caso" -> switch

public class TesteSwitch {

	public static void main(String[] args) {

		Scanner menu = new Scanner(System.in);
		System.out.println("Escolha a opção que deseja: 1- Netflix, 2-Amazon, 3-Disney ");
		int opcao = menu.nextInt();
		menu.close();

		switch (opcao) {
		case 1:
			System.out.println("Netflix");
			break;
		case 2:
			System.out.println("Amazon");
			break;
		case 3:
			System.out.println("Disney");
			break;
		default:
			System.out.println("Escolha a opção correta.");
		}

	}
}
