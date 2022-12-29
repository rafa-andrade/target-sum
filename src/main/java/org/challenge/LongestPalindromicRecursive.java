package org.challenge;

import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.isNull;
import static java.util.Optional.empty;
import static java.util.Optional.of;

public class LongestPalindromicRecursive {

    public static Optional<String> getLongestPalindromicSubstring(String input) {
        if (isNull(input)) {
            return empty();
        }
        for (int size = input.length() ; size > 0 ; size--) {
            Optional<String> palindrome = getPalindromicSubstring(input.toCharArray(), new char[size], size, 0);
            if (palindrome.isPresent()) {
                return palindrome;
            }
        }
        return empty();
    }

    private static Optional<String> getPalindromicSubstring(char[] input, char[] subInput, int length, int startPosition) {
        if (length == 0) {
            String sub = new String(subInput);
            if (isPalindromicInput(sub) && new String(input).contains(sub)) {
                return of(sub);
            }
        } else {
            for (int i = startPosition; i <= input.length-length; i++){
                subInput[subInput.length - length] = input[i];
                Optional<String> palindrome = getPalindromicSubstring(input, subInput, length-1, i+1);
                if (palindrome.isPresent()) {
                    return palindrome;
                }
            }
        }
        return empty();
    }

    public static boolean isPalindromicInput(String input) {
        if (input.length() <= 1) {
            return false;
        }
        String firstHalf = input.substring(0, input.length() / 2);
        boolean isEvenLength = input.length() % 2 == 0;
        String secondHalf = input.substring((input.length() / 2) + (isEvenLength ? 0 : 1));
        String secondHalfReversed = new StringBuffer(secondHalf).reverse().toString();
        return Objects.equals(firstHalf, secondHalfReversed);
    }
}