package rankC;

import java.util.Scanner;

public class RankC_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		黒電話の番号までの距離
		int[] distances = {12,3,4,5,6,7,8,9,10,11};
		String numString = sc.next().replace("-", "");		
		int totalDistance = 0;
		
		for(char c : numString.toCharArray()) {
			int digit = Character.getNumericValue(c);
			totalDistance += distances[digit] * 2;
		}
		
		System.out.println(totalDistance);
		
		sc.close();
	}

}
