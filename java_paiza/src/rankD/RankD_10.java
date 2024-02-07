package rankD;

import java.util.Scanner;

public class RankD_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numCount = sc.nextInt();
		Double[] nums = new Double[numCount];
		
		for(int i = 0; i < numCount; i++)
			nums[i] = sc.nextDouble();
		
		for(Double n : nums)
			System.out.println(n);
		
		sc.close();
	}

}
