package src.basiclevel;

public class OddEven {
    public static void main(String[] args){
        int number = 11;
        System.out.println(isEven(number) ? "Even" : "Odd");
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
