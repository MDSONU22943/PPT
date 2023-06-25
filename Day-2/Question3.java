import java.util.HashMap;

public class Question3 {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int longestSubsequenceLength = 0;

        // Count the frequency of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check the length of harmonious subsequence for each number
        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                int currentSubsequenceLength = countMap.get(num) + countMap.get(num + 1);
                longestSubsequenceLength = Math.max(longestSubsequenceLength, currentSubsequenceLength);
            }
        }

        return longestSubsequenceLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        Question3 solution = new Question3();
        int longestSubsequence = solution.findLHS(nums);
        System.out.println("Length of longest harmonious subsequence: " + longestSubsequence);
    }
}
