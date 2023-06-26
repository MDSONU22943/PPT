import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        // Test Example 1
        String s1 = "leetcode";
        int result1 = solution.firstUniqChar(s1);
        System.out.println(result1);  // Output: 0

        // Test Example 2
        String s2 = "loveleetcode";
        int result2 = solution.firstUniqChar(s2);
        System.out.println(result2);  // Output: 2

        // Test Example 3
        String s3 = "aabb";
        int result3 = solution.firstUniqChar(s3);
        System.out.println(result3);  // Output: -1
    }
}
