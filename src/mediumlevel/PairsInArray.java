package src.mediumlevel;
// Find all pairs in an array whose sum equals a given value.

public class PairsInArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 4, 1, 2, 5};
        int total = 7;
        printPairs(arr, total);
    }

    static void printPairs(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
