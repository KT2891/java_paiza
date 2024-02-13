package RankB;

import java.util.Scanner;

public class RankB_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int low = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] chocolates = new int[low][col];
		boolean[] isResults = {false, false, false};
		boolean isResult = true;
		String[][] result = new String[low][col];
		
		
		for(int i = 0; i < low; i++)
			for(int j = 0; j < col; j++) {
				chocolates[i][j] = sc.nextInt();
				result[i][j] = "B";
			}
		
		int sumRight = 0;
		int sumLeft = 0;
		
		for(int i = 0; i < low; i++) {
			for(int j = 0; j < col - 1; j++) {
				sumRight += chocolates[i][j];
				result[i][j] = "A";
				for(int k = j + 1; k < col; k++) {
					sumLeft += chocolates[i][k];
				}
				if(sumRight == sumLeft) {
					isResults[i] = true;
					break;
				}
				sumLeft = 0;
			}
			sumLeft = 0;
			sumRight = 0;
		}
		
		for(boolean b : isResults) {
			if(!b) {
				isResult = false;
				break;
			}
		}
		
		if(isResult) {
			System.out.println("Yes");
			for(String r[] : result){
				for(String s : r) {
					System.out.print(s);
				}
				System.out.println();
			}
		} else {
			System.out.println("No");
		}
				
		sc.close();
	}

}
