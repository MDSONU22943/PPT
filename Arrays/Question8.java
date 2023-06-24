import java.util.*;

public class Question8 {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        
        // Calculate the sum of numbers from 1 to n
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        
        // Use a set to keep track of duplicate numbers
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            // Check for the duplicate number
            if (set.contains(num)) {
                result[0] = num; // Duplicate number
            }
            
            // Calculate the sum of the given array
            sum -= num;
            
            set.add(num);
        }
        
        // The missing number is the difference between the expected sum and the actual sum
        result[1] = sum + result[0];
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        
        System.out.println(Arrays.toString(result));
    }
}
