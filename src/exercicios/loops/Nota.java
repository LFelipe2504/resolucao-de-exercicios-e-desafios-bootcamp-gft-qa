package exercicios.loops;

import java.util.Scanner;

public class Nota {
	/*Faça um programa que peça uma nota entre 0 e 10.
	 * Mostre uma mensagem caso o valor seja inválido e
	 * continue pedindo até que o usuário insira um valor válido.
	 */

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 e 10");
		int nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida. Por favor digite uma nota entre 0 e 10. ");
			nota = scan.nextInt();
		}
		scan.close();


	}

}
