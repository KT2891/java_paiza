package rankD_calculation;

import java.util.Scanner;

public class RankD_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = {
			sc.nextInt(),
			sc.nextInt(),
			sc.nextInt(),
			sc.nextInt()
		};
		
		double result = (Math.pow((nums[0] + nums[1]) * nums[2], 2)) % nums[3];
		
		System.out.println((int)result);
		
		sc.close();
	}
}
