package practice;

public class Method2 {

    public static void getMax(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("가장 큰 숫자: " + max);
    }

    public static void main(String[] args) {
        int[] numbers = {15, 3, 29, 8, 42, 10};
        getMax(numbers);
    }

}