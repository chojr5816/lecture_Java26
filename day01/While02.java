package practice2;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int r = 1;
		
		while (r == 1) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
		
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			
			System.out.print("계속 하시겠습니까? (0-밑줄 / 1-계속) : ");
			r = sc.nextInt();
			System.out.println();
		}
			sc.close();
	}
			
}
