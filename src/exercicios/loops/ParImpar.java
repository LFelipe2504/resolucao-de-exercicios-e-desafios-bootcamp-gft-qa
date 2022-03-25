package exercicios.loops;

import java.util.Scanner;

public class ParImpar {
	/*Faça um programa que peça N números inteiros,
	 * calcule e mostre a quantidade de números pares
	 * e a quantidade de números ímpares.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int nPar = 0;
		int nImpar = 0;

		System.out.println("Digite a quantidade de números que você quer saber quais são pares e ímpares:");
		int QtdDeNumeros = scan.nextInt();

		int contador = 0;

		while (contador < QtdDeNumeros) {
			System.out.println("Digite um número:");
			int numero = scan.nextInt();
			if (numero % 2 == 0)
				nPar += 1;
			else
				nImpar += 1;
			contador++;
		}
		scan.close();

		System.out.println("A quantidade de númeors pares é de " + nPar);
		System.out.println("A quantidade de númeors ímpares é de " + nImpar);
	}

}
