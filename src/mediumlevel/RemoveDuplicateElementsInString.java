package src.mediumlevel;
// Remove duplicate characters from a string without using extra space.

public class RemoveDuplicateElementsInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programing"));
    }

    static String removeDuplicates(String str) {
        String result = "";
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != ' ')
                result = result + arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j] && arr[i] != ' '){
                    arr[j] = ' ';
                    break;
                }
            }
        }
        return result;
    }
}
