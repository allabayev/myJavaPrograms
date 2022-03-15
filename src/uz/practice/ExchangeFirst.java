package uz.practice;

import java.util.Arrays;

public class ExchangeFirst {
    //Given an array of integers and another integer.
    // Remove all occurrences of this number from the array (there should be no gaps).
    public static void main(String[] args) {
        int[] test_array = {1, 2, 5, 3, 3, 5, 6, 9, 4, 3, 2, 8, 7};
        System.out.println(Arrays.toString(removeElement(test_array, 3)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
    }
}