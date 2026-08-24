package practice;

import java.util.Scanner;

public class Gugudan {

	// 파라미터로 넘어온 숫자의 구구단을 출력하는 메서드
    public static void printGugudan(int num) {
        System.out.println("[ 구구단 " + num + "단 ]");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int inputnum = scanner.nextInt();

        // 입력받은 숫자를 파라미터로 전달하여 메서드 호출
        printGugudan(inputnum);

        scanner.close();
    }
}