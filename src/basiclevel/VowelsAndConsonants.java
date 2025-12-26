package src.basiclevel;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        printVowelAndConsonants("Sleepless in Seattle");
    }

    static void printVowelAndConsonants(String str){
        int vowels = 0;
        int consonants = 0;
        for(char ch : str.toCharArray()){
            if(ch >= 'A' &&  ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
    }
}
