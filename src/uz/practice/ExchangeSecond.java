package uz.practice;

import java.util.Arrays;
//You can write a method for "cutting off the tail" of an array yourself,
// but it's worth noting that the standard method will work faster:
public class ExchangeSecond {
    public static void main(String[] args) {
        int[] test_array = {1, 2, 5, 3, 3, 5, 6, 9, 4, 3, 2, 8, 7};
        System.out.println(Arrays.toString(removeElement(test_array, 5)));
    }
    public static int [] removeElement(int [] nums, int val) {
        int offset = 0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        int [] newArray = new int [nums.length-offset];
        for (int i=0; i< newArray.length; i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }
}