package uz.practice;

import java.util.Arrays;

public class ExchangeThird {
    //However, if you go this way, you can first create an
    // array of the desired length, and then fill it in:
        public static void main(String[] args) {
            int[] test_array = {1, 2, 5, 3, 3, 5, 6, 9, 4, 3, 2, 8, 7};
            System.out.println(Arrays.toString(removeElement(test_array, 3)));
        }
        public static int[] removeElement(int[] nums, int val) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    count++;
                }
            }
            int[] newArray = new int[count];
            int offset = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {
                    offset++;
                } else {
                    newArray[i - offset] = nums[i];
                }
            }
        return newArray;
    }
}

