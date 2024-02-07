package rankD;

import java.util.Scanner;

public class RankD_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numCount = sc.nextInt();
		int[] nums = new int[numCount];
		
		for(int i = 0; i < numCount; i++)
			nums[i] = sc.nextInt();
		
		for(int n: nums)
			System.out.println(n);
		
		sc.close();
	}

}
