package rankD;

import java.util.Scanner;

public class RankD_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int wordAmount = 10;
		String words[] = new String[wordAmount];
		for (int i = 0; i < 10; i++) {
			words[i] = sc.next();
			System.out.println(words[i]);
		}
		sc.close();
	}
}
	