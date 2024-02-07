package rankD_input;

import java.util.Scanner;

public class RankD_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int wordAmount = 10;
		String words[] = new String[wordAmount];
		for (int i = 0; i < wordAmount; i++) {
			words[i] = sc.next();
			System.out.println(words[i]);
		}
		
		sc.close();
	}
}