package RankB;

import java.util.Scanner;

public class RankB_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int low = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] chocolates = new int[low][col];
		String[][] result = new String[low][col];
		boolean isResult = true;
		
		
		for(int i = 0; i < low; i++)
			for(int j = 0; j < col; j++) {
				chocolates[i][j] = sc.nextInt();
				result[i][j] = "B";
			}
		

		
		for(int i = 0; i < low; i++) {
			int sumRight = 0;
			int sumLeft = 0;
			boolean found = false;
			for(int j = 0; j < col - 1; j++) {
        sumRight += chocolates[i][j];
        sumLeft = 0;
        for (int k = j + 1; k < col; k++) {
          sumLeft += chocolates[i][k];
        }
        if (sumRight == sumLeft) {
          for (int k = 0; k <= j; k++) result[i][k] = "A";
          found = true;
        }
			}
			if (!found) isResult = false; 
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
