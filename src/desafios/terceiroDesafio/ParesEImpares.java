package desafios.terceiroDesafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*Crie um programa onde voc� receber� valores inteiros n�o negativos como entrada.

Ordene estes valores de acordo com o seguinte crit�rio:

Primeiro os Pares
Depois os �mpares
Voc� deve exibir os pares em ordem crescente e na sequ�ncia os �mpares em ordem decrescente.

-Entrada

A primeira linha de entrada cont�m um �nico inteiro positivo N (1 < N < 10000) 
Este � o n�mero de linhas de entrada que vem logo a seguir. As pr�ximas N linhas
 ter�o, cada uma delas, um valor inteiro n�o negativo.

-Sa�da

Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada
 n�mero deve ser impresso em uma linha, conforme exemplo de sa�da abaixo.
*/
public class ParesEImpares {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		int numero, contador = 0, numeroDeEntradas;  
		
		
		List<Integer> numeros = new ArrayList<>();
		List<Integer> numerosPares = new ArrayList<>();
		List<Integer> numerosImpares = new ArrayList<>();
		
		System.out.println("Digite um n�mero maior que 0 e menor que 10000:");
		numeroDeEntradas = scan.nextInt();
		
		if(numeroDeEntradas <= 0 || numeroDeEntradas >= 10000)
			System.out.println("N�mero errado.");
		
		System.out.println("Digite "+numeroDeEntradas+" n�meros n�o negativos:");
		while(contador < numeroDeEntradas) {
			numero = scan.nextInt();			
			if(numero >= 0 )
				numeros.add(numero);	
			contador++;
		}
		
		System.out.println("Impress�o dos valores");
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
