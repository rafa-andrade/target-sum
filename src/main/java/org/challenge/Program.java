package org.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    private static final Integer SUB_GROUP_LENGTH = 4;

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        combineCheckingSum(array, new Integer[SUB_GROUP_LENGTH], SUB_GROUP_LENGTH, 0, targetSum, result);
        return result;
    }

    private static void combineCheckingSum(int[] array, Integer[] subArray, int length, int startPosition, int targetSum, List<Integer[]> result){
        if (length == 0){
            int sum = Arrays.asList(subArray).stream().mapToInt(Integer::intValue).sum();
            if (sum == targetSum) {
                result.add(Arrays.copyOf(subArray, subArray.length));
            }
            return;
        }
        for (int i = startPosition; i <= array.length-length; i++){
            subArray[subArray.length - length] = array[i];
            combineCheckingSum(array, subArray, length-1, i+1, targetSum, result);
        }
    }
}