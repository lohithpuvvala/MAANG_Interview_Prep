package dsa.arraysAndStrings.foundationalProblems.arrays;

import java.util.Arrays;

public class Q2 {
    /**
     * Given an array. Reverse the array in-place.
     * Examples:
     * Input: arr[] = {1, 2, 3, 4, 5};
     * Output: arr[] = {5, 4, 3, 2, 1};
     *
     * Input: arr[] = {10, 20, 30, 40}
     * Output: arr[] = {40, 30, 20, 10}
     * */
    public static void main(String[] args) {
        Q2Solution sol = new Q2Solution();

        // Test Cases
        int[] arr1 = {1, 2, 3, 4, 5};       // Expected: {5, 4, 3, 2, 1}
        int[] arr2 = {1};                   // Expected: {1}
        int[] arr3 = {};                     // Expected: {}
        int[] arr4 = {10, 20, 30, 40};      // Expected: {40, 30, 20, 10}

        sol.reverse(arr1);
        sol.reverse(arr2);
        sol.reverse(arr3);
        sol.reverse(arr4);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}

class Q2Solution {
    public void reverse(int[] nums){
        for(int i = 0; i < nums.length/2; i++){
            swap(nums, i, nums.length-1-i);
        }
    }

    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
