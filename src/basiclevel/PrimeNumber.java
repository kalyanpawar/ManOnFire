package src.basiclevel;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(23) ? "Prime" : "Not a Prime");
    }

    static boolean isPrime(int number){
        boolean flag = true;
        for(int i = 2; i <= number /2; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
