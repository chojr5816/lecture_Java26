package practice;

import java.util.Scanner;

public class OddEven01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. ");
		int no = sc.nextInt();
		
		String result = (no % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(result);
		
		sc.close();

	}

}
