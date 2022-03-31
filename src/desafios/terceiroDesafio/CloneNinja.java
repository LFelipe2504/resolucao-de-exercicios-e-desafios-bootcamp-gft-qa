package desafios.terceiroDesafio;

import java.util.Scanner;

import java.io.IOException;
/*
 * 
O Kage Bunshin no Jutsu (ou a "t�cnica dos clones de sombra", para os 
lusofalantes) � uma t�cnica milenar bastante utilizada em batalhas ninja.
Quando utilizada, a t�cnica cria uma c�pia id�ntica de seu usu�rio. Desta 
forma, se um dado ninja usa a t�cnica, passam a existir dois destes 
ninjas (o original e a c�pia).
A t�cnica sempre � executada por todos os ninjas existentes no momento. 
Desta forma, se a t�cnica for utilizada novamente, passam a existir quatro 
ninjas id�nticos ao original (os dois anteriores e mais duas c�pias), e 
assim por diante.
H� N c�pias de um dado ninja (incluindo o original). Sua tarefa � 
determinar quantas vezes a t�cnica foi utilizada.

-ENTRADA

A entrada cont�m v�rios casos de teste. Cada caso cont�m uma linha com o 
n�mero N (1 <= N <= 106). � garantido que o valor de N � tal que � poss�vel 
obter exatamente N c�pias de um ninja utilizando a t�cnica (incluindo o original).
A entrada termina com fim-de-arquivo (EOF).

-SA�DA

Para cada caso de teste, imprima uma linha contendo o n�mero de vezes que a 
t�cnica foi utilizada.

*/

public class CloneNinja {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(log2(n));
		}
		scan.close();
	}
	
	private static int log2(int n) {
		return (int) (Math.log(n) / Math.log(2));
	}
	
}
