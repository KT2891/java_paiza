package rankC;

import java.util.Scanner;

public class RankC_09 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int day = sc.nextInt();
			int buyPrice = sc.nextInt();
			int sellPrice = sc.nextInt();
			
			int total_money = 0;
			int stockCount = 0;
			
			for(int i = 0; i < day; i++) {
				int stockPrice = sc.nextInt();
				
				if(stockPrice <= buyPrice && i != day - 1) {
					total_money -= stockPrice;
					stockCount ++;
				} else if(stockPrice >= sellPrice || i == day - 1) {
					total_money += stockPrice * stockCount;
					stockCount = 0;
				}
			}
			
			System.out.println(total_money);
		}
		catch(Exception e) {
			System.out.println("入力値が不適切です。");
		}
	}

}
