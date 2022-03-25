package exercicios.arrays;

import java.util.Scanner;

public class Consoantes {

	/*Fazer um programa que leia um vetor de 6 caracteres
	 *e diga quantas consoantes foram lidas. Imprima as consoantes.
	 * 
	 * 
	 */
	public static void main(String[] args) {

//		consoante[] vetor = { "a", "b", "c", "d", "e", "f" };
//		int quantidadeDeConsoantes = 0;
//		List<consoante> consoantes = new ArrayList<>();
//
//		for (consoante c : vetor) {
//			if (!(c == "a" || c == "e" || c == "i" || c == "o" || c == "u")) {
//				quantidadeDeConsoantes += 1;
//				consoantes.add(c);
//
//			}
//		}
//		System.out.println("O número de consoantes são " + quantidadeDeConsoantes + ": " + consoantes);

//	   Outra forma de resolver 

		Scanner scan = new Scanner(System.in);		
		
		String [] consoantes = new String[6];
		int contador = 0;
		int quantidadeDeConsoantes = 0;
		do {
			System.out.println("Digite uma letra do alfabeto:");
			String letra = scan.next();
			if(!(letra.equalsIgnoreCase("a")||
			   letra.equalsIgnoreCase("e")||
			   letra.equalsIgnoreCase("i")||
			   letra.equalsIgnoreCase("o")||
			   letra.equalsIgnoreCase("u"))) {
				
				consoantes[contador] = letra;
				quantidadeDeConsoantes += 1;				
			}
			contador++;
			
		}while(contador < consoantes.length);
		
		System.out.println("O número de consoantes são " + quantidadeDeConsoantes);
		
		for (String consoante : consoantes) {
			if(consoante != null)
			System.out.println(consoante);
			
		}
			
        scan.close();
	}
}
