package rankC;

import java.util.Arrays;
import java.util.Scanner;

public class RankC_02 {
	
	static class Wreath{
		String[] flowers;
		
		public Wreath(String[] flowers) {
			this.flowers = flowers;
		}
		
		public void turn() {
			String temp = this.flowers[0];
			for(int i = 0; i < this.flowers.length - 1; i++) {
				this.flowers[i] = this.flowers[i + 1];
			}
			this.flowers[this.flowers.length - 1] = temp;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		Wreath[] wreaths = new Wreath[2];
		
		boolean check = false;
		
		for (int i = 0; i < 2; i++) {
			String flower_input = sc.next();
			String[] flower = flower_input.split("");
			wreaths[i] = new Wreath(flower);
		}
		
		for (int i = 0; i < count; i++) {
			wreaths[1].turn();
			if (Arrays.equals(wreaths[0].flowers, wreaths[1].flowers)) {
				check = true;
				break;
			}
		}
		
		if (check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		sc.close();
	}

}
