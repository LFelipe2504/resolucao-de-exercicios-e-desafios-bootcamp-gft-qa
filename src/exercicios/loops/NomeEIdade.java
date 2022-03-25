package exercicios.loops;

import java.util.Scanner;

public class NomeEIdade {
	/*Faça um programa que leia um conjuntp de dois valores,
	 * o 1° representando o nome do aluno e o 2° representando a sua idade.
	 * (Pare o programa inserindo o valor 0 no campo nome) 
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String nome = null;
		int idade;
		
		while(true) {
			
		System.out.println("Nome:");		
	    nome = scan.next();
	    if (nome.equals("0"))
	    break;
	    
	    System.out.println("Idade:");
	    idade = scan.nextInt();
		}
		scan.close();

		
		
	}

}
