package exercicios.loops;

import java.util.Scanner;

public class ParImpar {
	/*Fa�a um programa que pe�a N n�meros inteiros,
	 * calcule e mostre a quantidade de n�meros pares
	 * e a quantidade de n�meros �mpares.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int nPar = 0;
		int nImpar = 0;

		System.out.println("Digite a quantidade de n�meros que voc� quer saber quais s�o pares e �mpares:");
		int QtdDeNumeros = scan.nextInt();

		int contador = 0;

		while (contador < QtdDeNumeros) {
			System.out.println("Digite um n�mero:");
			int numero = scan.nextInt();
			if (numero % 2 == 0)
				nPar += 1;
			else
				nImpar += 1;
			contador++;
		}
		scan.close();

		System.out.println("A quantidade de n�meors pares � de " + nPar);
		System.out.println("A quantidade de n�meors �mpares � de " + nImpar);
	}

}
