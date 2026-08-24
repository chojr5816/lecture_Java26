package practice;

public class Method3 {

    public static int getCount(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num > target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 25, 8, 30, 15};
        int target = 10;
        int result = getCount(numbers, target);
        System.out.println(target + "보다 큰 숫자의 개수: " + result);
    }

}