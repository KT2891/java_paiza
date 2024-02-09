package rankC;

import java.util.Scanner;

public class RankC_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] scores = new int[count];
		int[] ranks = new int[count];
		
		for (int i = 0; i < count; i++) {
			scores[i] = sc.nextInt();
			ranks[i] = 1;
		}
		
		for ( int j = 0; j < count; j++) {
			for( int k = 0; k < count; k++) {
				if (scores[j] > scores[k])
					ranks[k] ++;
			}
		}
		
		for (int n : ranks) {
			System.out.println(n);
		}
		
		sc.close();
	}

}
