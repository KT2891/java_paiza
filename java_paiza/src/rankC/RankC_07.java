package rankC;

import java.util.Scanner;

public class RankC_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int boxArgsCount = 3;
		
		int boxCount = sc.nextInt();
		int ballDiameter = sc.nextInt() * 2;

		int[] boxData = new int[boxArgsCount];
		
		for(int i = 0; i < boxCount; i++) {
			for(int j = 0; j < boxArgsCount; j++) boxData[j] = sc.nextInt();
			if(boxData[0] >= ballDiameter && boxData[1] >= ballDiameter && boxData[2] >= ballDiameter)
				System.out.println(i + 1);
		}
		
		sc.close();
	}

}
