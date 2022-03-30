package exercicios.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CoresDoArcoIris {
	
	public static void main(String[] args) {
		
		Set<String> coresArcoIris = new HashSet<>(Arrays.asList("Vermelho","Laranja","Amarelo","Verde","Azul","Anil","Violeta" ));
		
		System.out.println("Cores do Arco-�ris:");
		for (String string : coresArcoIris) {
						
			System.out.println(string);			
		}
		
		System.out.println("\nQuantidade de cores:");
		System.out.println(coresArcoIris.size());
		
		List<String> listCoresArcoIris = new ArrayList<>(coresArcoIris);
		
		System.out.println("\nCores na ordem alfab�tica:");
		listCoresArcoIris.sort(Comparator.naturalOrder());
		System.out.println(listCoresArcoIris);
		
		System.out.println("\nCores na ordem inversa:");		
		listCoresArcoIris.sort(Comparator.reverseOrder());
		System.out.println(listCoresArcoIris);		
		
		System.out.println("\nTodas as cores que come�am com a letra V :");
		
		for (String cor : listCoresArcoIris) {
			if(cor.startsWith("V")) 
				System.out.println(cor);			
		}
		
		System.out.println("\nRemover todas as cores que come�am com a letra V :");
		
		Iterator<String> iterator = listCoresArcoIris.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("V"))
            	iterator.remove();
        }
        
		System.out.println(listCoresArcoIris);
		
		System.out.println("\nLimpar a list:");
		listCoresArcoIris.clear();
		
		System.out.println("Conferir se a list est� vazia: " + listCoresArcoIris.isEmpty());
		
		
		
	}

}


