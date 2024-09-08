package rohan;

import java.util.Arrays;

public class TwoPointer {
    public static int[] findPairWithSum(int[] arr, int targetSum) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == targetSum) {
                return new int[]{arr[left], arr[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // return an invalid pair if no pair found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        String[] names= {"one","two","amd"};
        int targetSum = 8;
        Arrays.sort(arr);
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] result = findPairWithSum(arr, targetSum);
        if (result[0] != -1) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}

