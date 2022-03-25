package exercicios.arrays;

import java.util.Iterator;
import java.util.Random;

public class NumerosAleatorios {
/*Fa�a um programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100) e 
 * armazene-os num vetor. Ao final mostre os n�meros e seus sucessores. 
 */
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[]numerosAleatorios = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;  			
		}
		
		System.out.println("N�meros aleat�rios:");
		for(int numero: numerosAleatorios) {
			System.out.print(numero+" ");
		}
		
		System.out.println("\nSucessores dos n�meros aleat�rios:");
		for(int numeroSucessor: numerosAleatorios) {
			System.out.print((numeroSucessor + 1)+" ");
		}

	}

}
