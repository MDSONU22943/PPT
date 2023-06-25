import java.util.Arrays;

public class Question1{
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // Add the minimum element from each pair to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        Question1 solution = new Question1();
        int maxSum = solution.arrayPairSum(nums);
        System.out.println("Maximum sum: " + maxSum);
    }
}
