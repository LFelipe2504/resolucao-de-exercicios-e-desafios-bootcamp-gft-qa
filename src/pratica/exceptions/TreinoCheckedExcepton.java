package pratica.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class TreinoCheckedExcepton {
	public static void main(String[] args) {
		
		String NomeDoArquivo = "NomeDoarquivo.txt";
		try {
			imprimirNomeDoarquivoNoConsole(NomeDoArquivo);
		} catch (FileNotFoundException |ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Revise o nome do arquivo! " +  e.getCause());			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! " +  e.getCause());
			e.printStackTrace();
		}
		
		System.out.println("Apesar da exception ou não, o programa continua...");
	}

	private static void imprimirNomeDoarquivoNoConsole(String NomeDoArquivo) throws IOException {
		File arquivo = new File(NomeDoArquivo);
		
		BufferedReader br = new BufferedReader(new FileReader (arquivo.getName()));
		String linha = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		do {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();			
		}while(linha!=null);		
		
		bw.flush();
		br.close();
		
		
	}
	
	

}
