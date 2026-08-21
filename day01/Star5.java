package practice;

public class Star5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;

		for (int i = 1; i <= num; i++) {
		    // 공백 출력
		    for (int j = 1; j <= num - i; j++) {
		        System.out.print(" ");
		    }
		    // 별 출력 (2 * i - 1)
		    for (int k = 1; k <= (2 * i - 1); k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}

}
