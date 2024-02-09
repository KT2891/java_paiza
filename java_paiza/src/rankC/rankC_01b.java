package rankC;

import java.util.Arrays;
import java.util.Scanner;

public class rankC_01b {
	
	static class Score implements Comparable<Score>{
		int index;
		int value;
		
		public Score(int index, int value) {
			this.index = index;
			this.value = value;
		}
		
		@Override
		public int compareTo(Score other) {
			return Integer.compare(other.value, this.value);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		Score[] scores = new Score[count];
		int [] ranks = new int[count];
		
		for ( int i = 0; i < count; i++) {
			int value = sc.nextInt();
			scores[i] = new Score(i, value);
		}
		
		Arrays.sort(scores);
		
		int currentRank = 1;
		ranks[scores[0].index] = currentRank;
		for(int i = 1; i < count; i++) {
			if (scores[i].value == scores[i - 1].value)
				ranks[scores[i].index] = ranks[scores[i - 1].index];
			else {
				currentRank = i + 1;
				ranks[scores[i].index] = currentRank;
			}
		}
		
		for(int rank : ranks) {
			System.out.println(rank);
		}
		
		sc.close();
	}

}
