package rankD;

import java.util.Scanner;

public class RankD_07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int[] nums = new int[1000];
	for(int i = 0; i < 1000; i++)
		nums[i] = sc.nextInt();
	
	for(int n: nums)
		System.out.println(n);
	
	sc.close();

	}
}