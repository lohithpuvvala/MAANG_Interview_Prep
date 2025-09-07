package dsa.arraysAndStrings.foundationalProblems.arrays;

public class Q3 {
    public static void main(String[] args) {
        Q3Solution solution = new Q3Solution();

        // Test Cases
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};  // k=3 Expected: {5,6,7,1,2,3,4}
        int[] arr2 = {1, 2, 3};              // k=1 Expected: {3,1,2}
        int[] arr3 = {1};                    // k=0 Expected: {1}
        int[] arr4 = {1, 2, 3, 4};           // k=4 Expected: {1,2,3,4} (rotation = length)

        solution.rotate(arr1, 3);
        solution.rotate(arr2, 1);
        solution.rotate(arr3, 0);
        solution.rotate(arr4, 4);

        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(java.util.Arrays.toString(arr2));
        System.out.println(java.util.Arrays.toString(arr3));
        System.out.println(java.util.Arrays.toString(arr4));
    }
}

class Q3Solution{
    public void rotate(int[] nums, int k){

    }
}
