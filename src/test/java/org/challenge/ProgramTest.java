package org.challenge;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ProgramTest {

    @Test
    public void testCase1() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{7, 6, 4, -1, 1, 2}, 16);
        int[][] expected = {{7, 6, 4, -1}, {7, 6, 1, 2}};
        Assert.assertArrayEquals(expected, resultToArray(result));
    }

    @Test
    public void testCase2() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 10);
        int[][] expected = {{1, 2, 3, 4}};
        Assert.assertArrayEquals(expected, resultToArray(result));
    }

    @Test
    public void testCase3() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{5, -5, -2, 2, 3, -3}, 0);
        int[][] expected = {{5, -5, -2, 2}, {5, -5, 3, -3}, {-2, 2, 3, -3}};
        Assert.assertArrayEquals(expected, resultToArray(result));
    }

    @Test
    public void testCase4() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 4);
        int[][] expected = {{-2, -1, 1, 6}, {-2, -1, 2, 5}, {-2, -1, 3, 4}, {-2, 1, 2, 3}};
        Assert.assertArrayEquals(expected, resultToArray(result));
    }

    @Test
    public void testCase5() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{-1, 22, 18, 4, 7, 11, 2, -5, -3}, 30);
        int[][] expected = {{-1, 22, 7, 2}, {-1, 18, 11, 2}, {22, 4, 7, -3}, {22, 11, 2, -5}, {18, 4, 11, -3}};
        Assert.assertArrayEquals(expected, resultToArray(result));
    }

    @Test
    public void testCase6() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5}, 20);
        int[][] expected = {{-10, -3, 28, 5}, {-10, 28, -6, 8}, {-3, 2, -7, 28}, {-5, 2, 15, 8}, {-5, 2, 12, 11}, {-5, 12, 8, 5}, {-7, 28, -6, 5}};
        Assert.assertArrayEquals(expected, resultToArray(result));
    }

    @Test
    public void testCase7() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5}, 100);
        int[][] expected = {};
        Assert.assertArrayEquals(expected, resultToArray(result));
    }

    @Test
    public void testCase8() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5, -5, 6, -6}, 5);
        int[][] expected = {{1, 3, -5, 6}, {1, 4, 5, -5}, {1, 4, 6, -6}, {2, 3, 5, -5}, {2, 3, 6, -6}, {2, 4, 5, -6}};
        Assert.assertArrayEquals(expected, resultToArray(result));
    }

    private int[][] resultToArray(List<Integer[]> result) {
        int[][] arrayResult = new int[result.size()][4];
        for (int i=0 ; i < result.size() ; i++) {
            arrayResult[i] = Arrays.stream(result.get(i)).mapToInt(Integer::intValue).toArray();
        }
        return arrayResult;
    }
}