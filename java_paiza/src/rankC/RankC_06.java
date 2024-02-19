package rankC;

import java.util.Scanner;

public class RankC_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotNum = 6;
		
		int[] targetNum = {
				sc.nextInt(),
				sc.nextInt(),
				sc.nextInt(),
				sc.nextInt(),
				sc.nextInt(),
				sc.nextInt(),
		};
		int lotCount = sc.nextInt();
		int[][] lottleys = new int[lotCount][lotNum];
		int hitCount = 0;
		
		for(int i = 0; i < lotCount; i++)
			for(int j = 0; j < lotNum; j++)
				lottleys[i][j] = sc.nextInt();
		
		for(int i = 0; i < lotCount; i++) {
			for(int j = 0; j < lotNum; j++) {
				for(int k = 0; k < lotNum; k++) {
					if (lottleys[i][j] == targetNum[k]) {
						hitCount ++;
					}
				}
			}
			System.out.println(hitCount);
			hitCount = 0;
		}
		
		sc.close();
		}
}
