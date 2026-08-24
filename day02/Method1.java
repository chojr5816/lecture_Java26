package practice;

public class Method1 {

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int total = getSum(numbers);
        System.out.println("배열 요소의 합: " + total);
    }

}