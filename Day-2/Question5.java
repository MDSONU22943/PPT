import java.util.Arrays;

public class Question5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        int n = nums.length;
        // Maximum product can be obtained by either multiplying the three largest elements or the two smallest elements with the largest element
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3]; // Product of three largest elements
        int product2 = nums[0] * nums[1] * nums[n - 1]; // Product of two smallest elements and the largest element
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Question5 solution = new Question5();
        int maxProduct = solution.maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }
}
