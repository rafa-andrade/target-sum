package org.challenge;

import java.util.Optional;

import static java.util.Objects.isNull;
import static java.util.Optional.empty;
import static java.util.Optional.of;
import static org.challenge.LongestPalindromicRecursive.isPalindromicInput;

public class LongestPalindromicPerformance {

    public static Optional<String> getLongestPalindromicSubstring(String input) {
        if (isNull(input)) {
            return empty();
        }
        for (int length = input.length() ; length > 1 ; length--) {
            for (int start=0 ; start + length <= input.length() ; start++) {
                String sub = input.substring(start, start + length);
                if (isPalindromicInput(sub)) {
                    return of(sub);
                }
            }
        }
        return empty();
    }
}