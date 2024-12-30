package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String path = "in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();//le a primeira linha do arquivo
			while (line !=null) {// enquanto houver linha ele imprime as linhas
				System.out.println(line);
				line = br.readLine(); //vai pra próxima linha
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
