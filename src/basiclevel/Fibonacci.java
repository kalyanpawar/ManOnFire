package src.basiclevel;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacci(10));
    }

    static List<Integer> getFibonacci(int num){
        List<Integer> list = new ArrayList<>();
        list.add(0, 0);
        list.add(1, 1);
        for(int i = 2; i < num; i ++){
            list.add(i, list.get(i-2) + list.get(i-1));
        }
        return list;
    }
}
