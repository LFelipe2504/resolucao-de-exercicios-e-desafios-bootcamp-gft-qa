package exercicios.arrays;

public class OrdemInversa {
	/*Crie um vetor de 6 números inteiros e mostre-os na ordem inversa. 
	 */

	public static void main(String[] args) {
		
		int[] vetor = {1,2,3,4,5,6};
		
		int contador = 0;
		
		System.out.println("Vetor impresso na ordem:");
		while(contador < (vetor.length)) {
			System.out.print(vetor[contador]);
			contador++;			
		}
		System.out.println();
		System.out.println("Vetor impresso na ordem inversa:");
		for(int i = (vetor.length -1); i >= 0; i--) {
			System.out.print(vetor[i]);
			
		}
		
	}

}
