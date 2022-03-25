package exercicios.loops;

import java.util.Scanner;

public class Tabuada {
	/*Desenvolva um gerador de tabuada entre 1 e 10.
	 * O usuário deve informar qual número ele deseja ver a tabuada.  
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int tabuada = 0;
		
		System.out.println("Digite um número entre 1 e 10 que você deseja ver a numero?");
		numero = scan.nextInt();
		
		while (numero < 1 || numero > 10) {
			System.out.println("Digite um número entre 1 e 10:");
			numero = scan.nextInt();			
		}
		
		System.out.println("Tabuada de " + numero + ":");
		
		for(int contador = 1 ; contador < 11; contador ++ ) {
			tabuada = numero * contador;
			System.out.println(numero + " x " + contador + " = " + tabuada);			
		}
		
		scan.close();

	}

}
