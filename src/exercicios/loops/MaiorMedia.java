package exercicios.loops;

import java.util.Scanner;

public class MaiorMedia {
	/*Faça um programa que leia 5 números e informe
	 *o maior e a média. 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = 0;
		int soma = 0;
		int contador = 0;
		double media;
		
		
		do { 
			System.out.println("Digite um número:");
			numero = scan.nextInt();
			
			if(numero > maior) maior = numero;
			soma = soma + numero;
			
			contador++; 
			
		}
			while (contador < 5);
		scan.close();
		
		System.out.println("O maior número é : "+ maior);
		
		media = soma/5;
		
		System.out.println("A média dos 5 números é de " + media);
		
		
		
	}

}
