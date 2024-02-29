package rankC;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
//	　問題に沿って範囲指定	
		int count = 20;
//	　インデックス * 5 の数を代入する配列定義
		int[] numbers = new int[count];
//	 条件に合った変数を格納するリストを定義	
		List<Integer> filteredNumbers = new ArrayList<Integer>();
		
//		インデックス番号 * 5を配列に代入
		for(int i = 0; i < count; i++) {
			numbers[i] = i * 5;
		}
//		条件に合った変数をリストに順次代入
		for(int i = 0; i < count; i++) {
			if(isTargetNumber(i, numbers[i])) {
				filteredNumbers.add(numbers[i]);
			}
		}
		
//　リストをカンマ区切りで表示、最後の数字の後のカンマはつけない
		for(int i = 0; i < filteredNumbers.size(); i++) {
			String output = i == filteredNumbers.size() - 1 ? filteredNumbers.get(i).toString() : filteredNumbers.get(i) + ",";
			System.out.print(output);
		}
		
	}
	
	private static boolean isTargetNumber(int i, int number) {
		return (i <= 10 && number % 2 == 0) || (i > 10 && number % 2 != 0);
	}
}
