import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		
		//VERIFICA SE CONTEM STRING PROCURADA NA FRASE
		
		/*String saida;
		
		for(int i = 0 ;i<frase.length();i++) {
			if(frase.contains("rato")) {
				System.out.println("Contem");
			}
		}	*/
		
		
		//USANDO SPLIT, QUEBRA EM SUBSTRING A FRASE, TRANSFORMANDO EM ARRAY
		
		/*String saida = new String(Files.readAllLines())
		String[] s = frase.split(" ");
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("rato")) {
				saida = s[i];
			}
		}
		System.out.println(saida);*/
		
		
		//CRIA E ESCREVE DENTRO DE UM ARQUIVO 
		
		/*String frase = "Abc da amazônia.";
		try{
			File file = new File("C:\\Users\\matheus.gois\\Desktop\\noopen.txt");
			FileWriter writer = new FileWriter(file, true);
			PrintWriter printwriter = new PrintWriter(writer, true);
			printwriter.println(frase);
			printwriter.close();
			writer.close();
			System.out.println("SUCCESS!");
		}catch(Exception e) {
			throw new Exception(e);
			
		}*/
		
		
		//PEGA UM ARQUIVO HTML, LE E VERIFICA SE CONTEM TAGS DESEJADAS, PRINTANDO A LINHA INTEIRA
		
		FileReader file = new FileReader("C:\\Users\\matheus.gois\\Desktop\\abc.html");
		BufferedReader br = new BufferedReader(file);
		String s;
		while((s = br.readLine())!= null) {
			if(s.contains("@")) {
				if(s.contains(".com"))
				System.out.println(s);
			}
		}
		file.close();
		
		
		
	}

}
