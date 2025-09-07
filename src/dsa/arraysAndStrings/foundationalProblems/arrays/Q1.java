package dsa.arraysAndStrings.foundationalProblems.arrays;

public class Q1 {
    /// Given an array, write functions to find the minimum and maximum elements in it.
    /// Examples:
    /// Input: arr[] = [1, 423, 6, 46, 34, 23, 13, 53, 4]
    /// Output: Minimum element of an array: 1
    ///                Maximum element of an array: 423
    /// Input: arr[] = [2, 4, 6, 7, 9, 8, 3, 11]
    /// Output: Minimum element of an array: 2
    ///                Maximum element of an array: 11

    public static void main(String[] args) {
        int[] arr = {1, 423, 6, 46, 34, 23, 13, 53, 4};

        Q1Solution sol = new Q1Solution();
        System.out.println(sol.maxAndMinElement(arr));
    }
}

class Q1Solution {
    public String maxAndMinElement(int[] nums){
        if(nums == null || nums.length == 0) return "No elements found in the array.";

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return "max: "+ max + ", min:" + min;
    }
}
