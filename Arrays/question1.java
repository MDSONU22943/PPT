import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store elements and their indices
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            
            // Check if complement exists in the hash map
            if (hashMap.containsKey(complement)) {
                // Return the indices
                return new int[] {hashMap.get(complement), i};
            }
            
            // Add the current element to the hash map
            hashMap.put(num, i);
        }
        
        // No solution found, return an empty array
        return new int[0];
    }
}

public class question1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        
        System.out.println(result[0] + " " + result[1]);
    }
}
