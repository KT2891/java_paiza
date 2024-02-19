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
		int[][] lotteries = new int[lotCount][lotNum];
		
		
		for(int i = 0; i < lotCount; i++)
			for(int j = 0; j < lotNum; j++)
				lotteries[i][j] = sc.nextInt();
		
		for(int i = 0; i < lotCount; i++) {
			int hitCount = 0;
			for(int j = 0; j < lotNum; j++) {
				for(int k = 0; k < lotNum; k++) {
					if (lotteries[i][j] == targetNum[k]) {
						hitCount ++;
					}
				}
			}
			System.out.println(hitCount);
		}
		
		sc.close();
		}
}
