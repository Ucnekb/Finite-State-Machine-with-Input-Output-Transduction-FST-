package _20010310038_Kubilay_Karakaya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _20010310038_main {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "FST.txt";
		 
	            File file = new File(fileName);
	            Scanner scanner = new Scanner(file);
		       
		
		_20010310038_FST inputt=new _20010310038_FST(scanner);
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir bitişik sayı dizisi girin (örnek: 123123123): ");
	    String input = sc.nextLine();
	    inputt.kullanıcı(input);
	    System.out.println("Bir bitişik sayı dizisi girin (örnek: 123123123): ");
	    String input2 = sc.nextLine();
	    inputt.kullanıcı(input2);

		
		
		
		 
		 
	}

}
