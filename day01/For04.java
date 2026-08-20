package practice;

import java.util.Scanner;

public class For04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        // 곱셈의 누적 결과를 저장할 변수 (1로 초기화)
        long fact = 1;

        // 1부터 입력받은 num까지 계속 곱함
        for (int i = 1; i <= num; i++) {
            fact *= i; // fact = fact * i 와 같은 의미
        }

        System.out.println(num + "! = " + fact);

        sc.close();
    }
}