package src.basiclevel;

public class DigitCounter {
    public static void main(String[] str){
        System.out.println(countDigit(5465));
    }

    static int countDigit(int num){
        int count = 0;
        while(num > 0){
            num = num /10;
            count++;
        }
        return  count;
    }
}
