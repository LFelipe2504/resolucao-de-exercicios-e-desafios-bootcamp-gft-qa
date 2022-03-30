package exercicios.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MedindoTemperatura {
	/*
	 * Fa�a um programa que receba a temperatura m�dia dos 6 primeiros meses do ano
	 * e armazene-as em uma lista.
	 * 
	 * Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as
	 * temperaturas acima desta m�dia, e em que m�s elas ocorreram (mostrar o m�s
	 * por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Double> temperaturas = new ArrayList<>();
		List<String> meses = new ArrayList<>(Arrays.asList("Janeiro","Fevereiro","Mar�o", "Abril",
				"Maio","Junho"));
		
		int contador = 0;
		double temperatura, mediaTemperatura, somaTemperatura = 0;
		String mes;
		

		while (contador <= 5) {
			System.out.println("Digite a temperatura c�:");
			temperatura = scan.nextDouble();
			temperaturas.add(temperatura);
			somaTemperatura += temperatura;
			contador++;
		}
		
		mediaTemperatura = somaTemperatura / 6;
		
		for (Double temp : temperaturas) {
			if(temp > mediaTemperatura) {
				 int indexTemperaturas = temperaturas.indexOf(temp);
				 mes = meses.get(indexTemperaturas);
				 System.out.println("No m�s de "+ mes +" a temperatura foi de c�" + temp +" acima da m�dia de c�"+
				 mediaTemperatura);				
			}
			
			
		}

	}

}
