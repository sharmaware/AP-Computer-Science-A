/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.Locale;
/**
 *
 * @author saarthaksharma
 */
public class PalindromeTest {

    public static void main(String[] args) {
        System.out.println(testPalindrome("A man a plan a canal panama", 0));

    }

    public static boolean testPalindrome(String phrase, int index) {
        //removing spaces and punctuation and case 
        phrase = removePunctuation(phrase);
        //System.out.println(phrase +", " + phrase.length());
        
        boolean success = false;
        int complete;
        if(phrase.length() % 2 == 0){
            complete = phrase.length()/2;
        }
        else{
            complete = (phrase.length() - 1) / 2;
        }
 
        //int complete = (int) (phrase.length() + 1) / 2 - 1;
        //System.out.println(complete);
        
        if (complete != index + 1 && phrase.charAt(index) == phrase.charAt(phrase.length() - 1 - index)) {
            success = true;
        
        if (index == complete) {
            return success;
        } else {
            success = testPalindrome(phrase, index + 1);
        }
        }
        return success;
    }

    public static String removePunctuation(String phrase) {
        phrase = phrase.toLowerCase();
        //making phrase lowercase
        /*char [] lowerCaseLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char [] upperCaseLetters = {'A', 'B', 'C', 'D','E','F','G','H','I','J','K','L','M','N','O',
            'P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i = 0; i < phrase.length(); i++){
            for(int j = 0; j < lowerCaseLetters.length;j++)
                if(phrase.charAt(i) == upperCaseLetters[j]){
                    //phrase.substring(0, i-1)
                    String temp = lowerCaseLetters[j] + phrase.substring(i+1, phrase.length());
                    phrase = temp;
                }
        }
        */
        System.out.println(phrase);
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C',
            'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] newPhrase = new char[phrase.length()];
        int placeGap = 0;
        boolean found = false;
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if (phrase.charAt(i) == letters[j]) {
                    found = true;
                }
            }
            if (found == true) {
                newPhrase[i - placeGap] = phrase.charAt(i);
                found = false;
            } else {
                placeGap++;
                found = false;
            }

        }
        String withSpaces = new String(newPhrase);
        return withSpaces.substring(0, withSpaces.length() - placeGap);
    }
}
