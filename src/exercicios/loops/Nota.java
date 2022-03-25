package exercicios.loops;

import java.util.Scanner;

public class Nota {
	/*Fa�a um programa que pe�a uma nota entre 0 e 10.
	 * Mostre uma mensagem caso o valor seja inv�lido e
	 * continue pedindo at� que o usu�rio insira um valor v�lido.
	 */

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 e 10");
		int nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida. Por favor digite uma nota entre 0 e 10. ");
			nota = scan.nextInt();
		}
		scan.close();


	}

}
