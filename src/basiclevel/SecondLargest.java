package src.basiclevel;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 20, 8, 34, 55, 43, 45};
        System.out.println(getSecondLargest(arr));
    }

    static int getSecondLargest(int[] arr){
        int large = 0;
        int secondLarge = 0;
        for(int x: arr){
            if(large > x && x > secondLarge){
                secondLarge = x;
            } else if(x > large)  {
                secondLarge = large;
                large = x;
            }
        }
        return secondLarge;
    }
}
