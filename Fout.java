import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fout {
	public static void main(String[] args)throws IOException{
	
		System.out.print("Enter the file name with extension: ");
		Scanner sc = new Scanner(System.in);
		
		File LacapFile = new File(sc.nextLine()+".txt");
		sc = new Scanner(LacapFile);
		
		String LacapLine = sc.nextLine();
		System.out.println(LacapLine);
		
		sc.close();
	}
}
