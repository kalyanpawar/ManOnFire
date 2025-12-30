package src.mediumlevel;
// Find the longest word in a sentence.

public class LongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "You are the love you were always searching for";
        System.out.println(getLongestWord(sentence));
    }

    static String getLongestWord(String sentence){
        String[] arr = sentence.split(" ");
        String longest = "";
        int longLength = 0;
        for(String str : arr){
            if(str.length() > longLength){
                longLength = str.length();
                longest = str;
            }
        }
        return longest;
    }
}
