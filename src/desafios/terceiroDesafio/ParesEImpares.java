package desafios.terceiroDesafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

Primeiro os Pares
Depois os Ímpares
Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

-Entrada

A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) 
Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas
 terão, cada uma delas, um valor inteiro não negativo.

-Saída

Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada
 número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/
public class ParesEImpares {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		int numero, contador = 0, numeroDeEntradas;  
		
		
		List<Integer> numeros = new ArrayList<>();
		List<Integer> numerosPares = new ArrayList<>();
		List<Integer> numerosImpares = new ArrayList<>();
		
		System.out.println("Digite um número maior que 0 e menor que 10000:");
		numeroDeEntradas = scan.nextInt();
		
		if(numeroDeEntradas <= 0 || numeroDeEntradas >= 10000)
			System.out.println("Número errado.");
		
		System.out.println("Digite "+numeroDeEntradas+" números não negativos:");
		while(contador < numeroDeEntradas) {
			numero = scan.nextInt();			
			if(numero >= 0 )
				numeros.add(numero);	
			contador++;
		}
		
		System.out.println("Impressão dos valores");
		for (Integer n : numeros) {
			if (n%2 == 0) 
				numerosPares.add(n);			
			else 
				numerosImpares.add(n);			
		} 
		
			numerosPares.sort(Comparator.naturalOrder());
			numerosImpares.sort(Comparator.reverseOrder());
			
			for (Integer numeroPar : numerosPares) {
				System.out.println(numeroPar);
			} 
			
			for (Integer numeroImpar : numerosImpares) {
				System.out.println(numeroImpar); 
			}
			scan.close();		

	}

}
