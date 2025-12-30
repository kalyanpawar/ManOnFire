package src.mediumlevel;
 // Merge two sorted arrays without using extra space.

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        mergeAndPrintArrays(arr1, arr2);
    }

    static void mergeAndPrintArrays(int[] arr1, int[] arr2){
        int len = arr1.length;
        for(int i = 0; i < len; i++){
            if(arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                Arrays.sort(arr2);
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}

