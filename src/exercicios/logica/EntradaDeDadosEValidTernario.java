package exercicios.logica;

import java.util.Scanner;

public class EntradaDeDadosEValidTernario {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.println("Entre com a nota 1:");
		n1 = ler.nextDouble();
		System.out.println("Entre com a nota 1:");
		n2 = ler.nextDouble();
		System.out.println("Entre com a nota 1:");
		n3 = ler.nextDouble();
		
		ler.close();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("A média aritmética das 3 notas é :"+ media);
//		Validador ternário que trabalha com duas opções depois do "?" é verdadeiro e depois do ":" se for falso.
		System.out.println( (media >= 7.5) ? "Parabéns! Você foi aprovado!" : "Vamos ter que estudar mais.");
	}

}
