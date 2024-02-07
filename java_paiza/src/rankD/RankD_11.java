package rankD;

import java.util.Scanner;

public class RankD_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pairCount = sc.nextInt();
		
		String[] words = new String[pairCount];
		int[] nums = new int[pairCount];
		
		for(int i = 0; i < pairCount; i++) {
			words[i] = sc.next();
			nums[i] = sc.nextInt();
		}
		
		System.out.println(words[7] + " " + nums[7]);
		
		sc.close();
	}
}
