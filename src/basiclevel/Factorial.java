package src.basiclevel;

public class Factorial {
    public static void main(String[] str){
        System.out.println(getFactorial(5));
    }
    static int getFactorial(int num){
        int fact = 1;
        for(int i = 2; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
}
