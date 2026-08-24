package practice;

import java.util.Scanner;

public class Gugudan2 {

    // 특정 단을 출력하는 메서드
    public static void printGugudan(int num) {
        System.out.println("[ 구구단 " + num + "단 ]");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println(); // 단 사이 여백을 위한 줄바꿈
    }

    public static void main(String[] args) {
        // 반복문을 사용하여 printGugudan 메서드를 2단부터 9단까지 재활용
        for (int i = 2; i <= 9; i++) {
            printGugudan(i);
        }
    }
}