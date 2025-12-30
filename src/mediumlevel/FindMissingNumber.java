package src.mediumlevel;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        System.out.println(findMissingNumber(arr));
    }

    static int findMissingNumber(int[] arr) {
        int sum = 0;
        for(int x : arr){
            sum = sum + x;
        }

        int n = arr[arr.length - 1];
        int total = n * (n +1)/2;
        return total - sum;
    }
}
