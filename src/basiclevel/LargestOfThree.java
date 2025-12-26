package src.basiclevel;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println(getLargestOfThree(10, 6, 15));
    }

    static int getLargestOfThree(int a, int b, int c){
        int large = 0;
        if(a >= b && a >=c )
            large = a;
        else if (b >= a && b>=c)
            large = b;
        else if (c >= a && c >= b)
            large = c;
        return large;
    }
}
