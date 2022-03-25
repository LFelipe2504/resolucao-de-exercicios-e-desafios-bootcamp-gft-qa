package exercicios.loops;

import java.util.Scanner;

public class Fatorial {
	/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
	 * Ex: 5!= 120 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int multiplicador = 1;
		
		System.out.println("Digite um número para calcular o fatorial:");
		numero = scan.nextInt();		
		
		for(int i = numero; i > 1; i--) {
			multiplicador *= i;
			
		}				
		
		System.out.println( numero + "!= " + multiplicador);
		
		scan.close();
	}

}
