import java.util.*;

public class Question8{
    public int minDifference(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) {
            return 0; // If there is only one element, the difference is always 0.
        }
        
        Arrays.sort(nums); // Sort the array to easily find the minimum and maximum values.
        
        int minDiff = nums[n - 1] - nums[0]; // Initial difference between maximum and minimum.
        
        if (minDiff <= 2 * k) {
            return 0; // Difference is already smaller than or equal to 2k.
        }
        
        int potentialMin = nums[0] + k; // Calculate potential minimum value.
        int potentialMax = nums[n - 1] - k; // Calculate potential maximum value.
        
        for (int i = 1; i < n - 1; i++) {
            int currMin = nums[i] - k; // Calculate current minimum value.
            int currMax = nums[i] + k; // Calculate current maximum value.
            
            potentialMin = Math.min(potentialMin, currMin);
            potentialMax = Math.max(potentialMax, currMax);
        }
        
        return Math.min(potentialMax - k - potentialMin, minDiff); // Return the minimum score.
    }
}
