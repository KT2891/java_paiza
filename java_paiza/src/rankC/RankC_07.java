package rankC;

import java.util.Scanner;

public class RankC_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dimensionsPerBox = 3; // 名前をより明確に
        
        try {
            int boxCount = sc.nextInt();
            int ballDiameter = sc.nextInt() * 2;
    
            int[] boxData = new int[dimensionsPerBox];
            
            for(int i = 0; i < boxCount; i++) {
                for(int j = 0; j < dimensionsPerBox; j++) {
                    boxData[j] = sc.nextInt();
                }
                if(checkBoxSize(boxData, ballDiameter))
                    System.out.println(i + 1);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
    
    private static boolean checkBoxSize(int[] boxData, int ballDiameter) {
        return boxData[0] >= ballDiameter && boxData[1] >= ballDiameter && boxData[2] >= ballDiameter;
    }
}