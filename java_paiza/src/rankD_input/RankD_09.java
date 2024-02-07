package rankD_input;

import java.util.Scanner;

public class RankD_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int wordCount = sc.nextInt();
		String[] words = new String[wordCount];
		
		for(int i = 0; i < wordCount; i++)
			words[i] = sc.next();
		
		for(String t: words)
			System.out.println(t);
		
		sc.close();
	}

}
