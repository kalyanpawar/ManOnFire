package src.basiclevel;

public class LengthCounter {
    public static void main(String[] args){
        System.out.println(getLength("Kalyan"));
    }

    static int getLength(String str){
        int i;
        for(i = 0; i < i+1; i++){
            try{
                str.charAt(i);
            }
            catch(Exception e){
                break;
            }
        }
        return i;
    }
}
