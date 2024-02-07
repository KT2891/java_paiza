package rankD_input;

import java.util.Scanner;

public class RankD_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 1000; i++) {
			int num = Integer.parseInt(sc.next());
			System.out.println(num);
		}
		
		sc.close();
	}
}
