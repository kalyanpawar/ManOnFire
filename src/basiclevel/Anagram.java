package src.basiclevel;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(areAnagram("Silent", "Listen") ? "Anagram" : "Not Anagram");
        System.out.println(areAnagram("Silent", "Kalyan") ? "Anagram" : "Not Anagram");
    }

    static boolean areAnagram(String a, String b){
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
