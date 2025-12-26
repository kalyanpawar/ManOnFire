package src.basiclevel;

public class PalindromeString {
    public static void main(String[] args){
        String str = "ApGBA";
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not a Palindrome");
    }

    static boolean isPalindrome(String str){
        String rev = "";
        for(int i = 0; i < str.length(); i++){
            rev = str.charAt(i) + rev;
        }
        if(str.equals(rev))
            return true;
        else
            return false;
    }
}
