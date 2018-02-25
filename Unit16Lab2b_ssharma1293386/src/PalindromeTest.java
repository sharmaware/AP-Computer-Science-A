/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class PalindromeTest {

    public static void main(String[] args) {
        String phrase = "a man, a plan, A CanAl, Panama!";
        phrase = removePunctuation(phrase);
        System.out.println(testPalindrome(phrase, 0));

    }

    public static boolean testPalindrome(String phrase, int index) {

        int complete;
        if (phrase.length() % 2 == 0) {
            complete = phrase.length() / 2;
        } else {
            complete = (phrase.length() - 1) / 2;
        }

        boolean success = false;

        if (phrase.charAt(index) == phrase.charAt(phrase.length() - 1 - index)) {
            success = true;
        }

        if (index == complete) {
            return success;
        } else if (success == true) {
            success = testPalindrome(phrase, index + 1);
        }
        return success;
    }

    public static String removePunctuation(String phrase) {
        phrase = phrase.toLowerCase();
        //removing punctuation
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
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
