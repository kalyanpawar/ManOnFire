package src.basiclevel;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeap(2012));
        System.out.println(isLeap(2025));
    }

    static boolean isLeap(int year){
        if(year % 4 == 0)
            return true;
        else
            return false;
    }
}
