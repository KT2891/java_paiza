package rankC;

import java.util.Scanner;

public class RankC_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int low = sc.nextInt();
			int col = sc.nextInt();
			
			String[][] hitPosition = new String[low][col];
			int[][] scores = new int[low][col];
					
			for(int i = 0; i < low; i++) {
				hitPosition[i] = sc.next().split("");
			}
			
			for(int i = 0; i < low; i++)
				for(int j = 0; j < col; j++)
					scores[i][j] = sc.nextInt();
			
			int totalScore = 0;
			
			for(int i = 0; i < low; i++) {
				for(int j = 0; j < col; j++) {
					if (isHit(hitPosition[i][j])){
						totalScore += scores[i][j];
					}
				}
			}
			
			System.out.println(totalScore);
					
		}catch (Exception e) {
			System.out.println("入力値が不適切です。");
		}finally {
			sc.close();
		}
	}
	
	private static boolean isHit(String s){
		return s.equals("o");
	}

}
