package practice;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		
		System.out.print("원의 반지름을 입력하세요 : ");
		double radius = sc.nextDouble();
		
		double area = radius * radius * PI;
		
		System.out.printf("원의 넓이는 %.2fcm입니다.\n", area);
		
		sc.close();
	}

}
