package exercicios.loops;

import java.util.Scanner;

public class MaiorMedia {
	/*Fa�a um programa que leia 5 n�meros e informe
	 *o maior e a m�dia. 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = 0;
		int soma = 0;
		int contador = 0;
		double media;
		
		
		do { 
			System.out.println("Digite um n�mero:");
			numero = scan.nextInt();
			
			if(numero > maior) maior = numero;
			soma = soma + numero;
			
			contador++; 
			
		}
			while (contador < 5);
		scan.close();
		
		System.out.println("O maior n�mero � : "+ maior);
		
		media = soma/5;
		
		System.out.println("A m�dia dos 5 n�meros � de " + media);
		
		
		
	}

}
