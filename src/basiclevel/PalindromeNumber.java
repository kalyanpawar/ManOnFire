package src.basiclevel;

public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println(isPalindrome(1234321) ? "Palindrome" : "Not a Palindrome");
    }

    static boolean isPalindrome(Integer number){
        int num = number;
        int rev = 0;
        while(number > 0){
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        if(num == rev)
            return true;
        else
            return false;
    }
}
