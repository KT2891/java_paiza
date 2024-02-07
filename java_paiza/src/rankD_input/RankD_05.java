package rankD_input;

import java.util.Scanner;

public class RankD_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] words = input.split(" ");
		
		for(String t: words)
			System.out.println(t);
				
		sc.close();
	}

}
