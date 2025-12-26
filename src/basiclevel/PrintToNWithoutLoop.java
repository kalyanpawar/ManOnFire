package src.basiclevel;

public class PrintToNWithoutLoop {
    public static void main(String[] args) {
        printToN(1, 10);
    }

    static void printToN(int current, int n){
        if(current <= n){
            System.out.println(current);
            current++;
            printToN(current, n);
        }
    }
}
