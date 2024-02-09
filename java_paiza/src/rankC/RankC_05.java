package rankC;

import java.util.Scanner;

public class RankC_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		String target = sc.next();
		boolean output = false;
		
		for(int i = 0; i < count; i++) {
			String word = sc.next();
			if(word.contains(target)) {
				output = true;
				System.out.println(word);
			}
		}
		
		if(!output)
			System.out.println("None");
		
		sc.close();
	}

}
