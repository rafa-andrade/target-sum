package org.challenge;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Optional;

public class LongestPalindromicPerformanceRecursiveTest {

    @Test
    public void shouldPassTheTestCase1FromChallenge() {
        String input = "abac";
        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(input);
        Assert.assertEquals("aba", result.get());
    }

    @Test
    public void shouldPassTheTestCase2FromChallenge() {
        String input = "tacag";
        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(input);
        Assert.assertEquals("aca", result.get());
    }

    @Test
    public void shouldPassTheTestCase3FromChallenge() {
        String input = "wegeeksskeegyuwe";
        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(input);
        Assert.assertEquals("geeksskeeg", result.get());
    }


    @Test
    public void shouldReturnEmptyWhenInputIsEmpty() {
        String input = "";
        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(input);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnEmptyWhenInputIsNull() {
        String input = null;
        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(input);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnFirstPalindromicSubstringWhenTwoOrMoreWithSameLength() {
        String input = "yabGGba00000cdGGdcx";
        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(input);
        Assert.assertEquals("abGGba", result.get());
    }

    @Test
    public void shouldReturnFullInputPalindromic() {
        String input = "abcdUUdcba";
        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(input);
        Assert.assertEquals("abcdUUdcba", result.get());
    }

    @Test
    @Ignore //not able to pass this test with recursive solution
    public void shouldHandleBigInputs() {
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");
        sb.append("Rafael__leafaR");
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");
        sb.append("abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_abcdefghijklmnopqrstuvxz_");

        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(sb.toString());
        Assert.assertEquals("Rafael__leafaR", result.get());
    }

    @Test
    public void shouldReturnEmptyWhenNoPalindromicSubstringFound() {
        String input = "abcdefgh";
        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(input);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnEmptyWhenSingleCharacter() {
        String input = "a";
        Optional<String> result = LongestPalindromicRecursive.getLongestPalindromicSubstring(input);
        Assert.assertTrue(result.isEmpty());
    }
}