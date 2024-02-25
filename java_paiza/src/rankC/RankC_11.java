package rankC;

import java.util.Scanner;

public class RankC_11 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int payPerMinutes = sc.nextInt() / 60;
			int workMinutes = sc.nextInt();
			
			System.out.println(payPerMinutes * workMinutes);
		}
		catch(Exception e) {
			System.out.println("不適切な入力です。");
		}
	}

}
