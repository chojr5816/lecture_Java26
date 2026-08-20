package practice;

import java.util.Scanner;

public class For06 {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	
        // 바깥쪽 for문: 2단부터 9단까지 (단 수 변경)
        for (int i = 2; i <= 9; i++) {
            
            System.out.println("[ 구구단 " + i + "단 ]");
            
            // 안쪽 for문: 1부터 9까지 (곱하는 수 변경)
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            System.out.println();
        }
        
    }
}