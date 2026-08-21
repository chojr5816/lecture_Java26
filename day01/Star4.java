package practice;

public class Star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;

		for (int i = num; i >= 1; i--) {
		    // 공백 출력
		    for (int j = 1; j <= num - i; j++) {
		        System.out.print(" ");
		    }
		    // 별 출력
		    for (int k = 1; k <= i; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}

}
