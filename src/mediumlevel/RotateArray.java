package src.mediumlevel;
// Rotate an array to the right by K positions.

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        rotateAndPrintArray(arr, 1);
        rotateAndPrintArray(arr, -1);
    }

    static void rotateAndPrintArray(int[] arr, int rotateBy){
        int n = arr.length;
        int[] newArr = new int[n];
        int k = ((rotateBy % n) + n) % n;
        for (int i = 0; i < n; i++) {
            newArr[(i + k) % n] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
