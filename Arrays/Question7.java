import java.util.*;

public class Question7 {
    public static void moveZerosToEnd(int[] nums) {
        int index = 0;
        
        // Move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }
        
        // Fill the remaining elements with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        
        System.out.println("Before moving zeros: " + Arrays.toString(nums));
        moveZerosToEnd(nums);
        System.out.println("After moving zeros: " + Arrays.toString(nums));
    }
}
