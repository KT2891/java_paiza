package rankC;

import java.util.Scanner;

public class RankC_04 {
	
	static class Typhoon{
		int centerX, centerY;
		int r1, r2;
		
		public Typhoon(int xc, int yc, int r1, int r2) {
			this.centerX = xc;
			this.centerY = yc;
			this.r1 = r1;
			this.r2 = r2;
		}
		
		public boolean check(int px, int py) {
			int xData = (px - centerX) * (px - centerX);
			int yData = (py - centerY) * (py - centerY);
			
			return ((r1 * r1) <= ((xData) + (yData)) && (r2 * r2) >= ((xData) + (yData)));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Typhoon typhoon = new Typhoon(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		int count = sc.nextInt();
			
		for(int i = 0; i < count; i++ ) {
			if(typhoon.check(sc.nextInt(), sc.nextInt())) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
		sc.close();
	}

}
