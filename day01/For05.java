package practice;

import java.util.Scanner;

public class For05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        // 올바른 양의 정수가 입력될 때까지 무한 반복
        while (true) {
            System.out.print("양의 숫자를 입력하세요 : ");
            num = sc.nextInt();
            
            if (num > 0) {
                break; // 양수(1 이상)가 입력되면 반복문 탈출
            }
            
            System.out.print("양의 숫자가 아닙니다. ");
        }
        
        // 1부터 입력받은 숫자까지의 합 구하기
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        
        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
        
        sc.close();
    }
}