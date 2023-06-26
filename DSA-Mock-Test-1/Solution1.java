public class Solution1 {
    public void moveZeroes(int[] nums) {
        int left = 0;  // Points to the current position where a non-zero element should be placed
        int right = 0;  // Iterates through the array

        while (right < nums.length) {
            // If the current element is non-zero, move it to the left pointer position
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }

        // After iterating through the array, set all elements from left pointer to the end as zeroes
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        // Test Example 1
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();  // Output: 1 3 12 0 0

        
    }
}
