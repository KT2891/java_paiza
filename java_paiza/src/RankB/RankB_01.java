package RankB;

import java.util.Scanner;

public class RankB_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] picture1 = new int[lows*2][cols*2];
		int[][] picture2 = new int[lows*2][cols*2];
		int[][] result = new int[lows*2 - 1][cols*2 - 1];
		
		for(int i = 0; i < lows * 2; i += 2) {
			for(int j = 0; j < cols * 2 ; j += 2) {
				int data = sc.nextInt();
				picture1[i][j] = data;
				picture1[i + 1][j] = data;
				picture1[i][j + 1] = data;
				picture1[i + 1][j + 1] = data;
			}
		}
		
		for(int i = 0; i < lows * 2; i += 2) {
			for(int j = 0; j < cols * 2; j += 2) {
				int data = sc.nextInt();
				picture2[i][j] = data;
				picture2[i + 1][j] = data;
				picture2[i][j + 1] = data;
				picture2[i + 1][j + 1] = data;
			}
		}
		
		for(int i = 0; i < lows*2 - 1; i++) {
			for(int j = 0; j < cols*2 - 1; j++) {
				result[i][j] = (picture1[i + 1][j + 1] + picture2[i][j]) / 2;
			}
		}
		
		for(int i = 0; i < lows*2 - 1; i++) {
			for(int j = 0; j < cols*2 - 1; j++) {
				if (j <= cols*2 - 1) {
					System.out.print(result[i][j] + " ");
				} else {
					System.out.print(result[i][j]);
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
