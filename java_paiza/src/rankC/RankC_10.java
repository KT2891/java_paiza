package rankC;

import java.util.Scanner;

public class RankC_10 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			int count = sc.nextInt();
			int totalWin = 0;
			
			for(int i = 0; i < count; i++) {
				String myHand = sc.next();
				String otherHand = sc.next();
				
				if(judge(myHand, otherHand)) {
					totalWin ++;
				}
			}
			
			System.out.println(totalWin);
		}
		catch(Exception e){
			System.out.println("入力値が不適切です。");
		}
	}
	
	private static boolean judge(String myHand, String otherHand) {
		return (myHand.equals("G") && otherHand.equals("C")) || (myHand.equals("C") && otherHand.equals("P")) || (myHand.equals("P") && otherHand.equals("G"));
	}

}