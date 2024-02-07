package rankD_input;

import java.util.Scanner;

public class RankD_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int listCount = sc.nextInt();
		
		for(int i = 0; i < listCount; i++) {
			int numCount = sc.nextInt();
			for(int j = 0; j < numCount; j++) {
				int num = sc.nextInt();
				System.out.print(num);
				if(j < numCount -1 )
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
