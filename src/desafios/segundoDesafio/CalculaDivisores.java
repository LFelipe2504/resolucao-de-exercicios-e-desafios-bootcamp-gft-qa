package desafios.segundoDesafio;

import java.util.Scanner;

public class CalculaDivisores {
/*
 Ler um n�mero inteiro N e calcular todos os seus divisores.

- Entrada

O arquivo de entrada cont�m um valor inteiro.

- Sa�da

Escreva todos os divisores positivos de N, um valor por linha.
 
 
*/
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i<= n  ; i++) {
            if (n % i == 0) {
                System.out.println( i );
            }
        }
        System.out.println(        );
        input.close();
    }

}
