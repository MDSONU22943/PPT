public class Question2 {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Move it to the front of the array
                nums[k] = nums[i];
                k++; // Increment k
            }
        }

        return k;
    }

    public static void main(String[] args) {
         int[] nums = {3,2,2,3};
         int val = 3;
        System.out.println(removeElement(nums,val));
    }
}

