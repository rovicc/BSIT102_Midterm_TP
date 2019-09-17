import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class Fin {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String FileText;
		String text;
		
		System.out.println("Input file text: ");
		FileText = sc.nextLine();
		System.out.println("Input file name: ");
		text = sc.nextLine();
			
		FileWriter fw = new FileWriter(text+".txt");
		fw.write(FileText);
		fw.close();
	
	}
}
