import java.util.*;

public class Question4{
    public static int[] plusOne(int[] digits) {
    int n = digits.length;
    
    // Traverse the digits array from right to left
    for (int i = n - 1; i >= 0; i--) {
        // Increment the current digit by 1
        digits[i]++;
        
        // If the digit becomes 10, set it to 0 and carry over 1 to the next digit
        if (digits[i] == 10) {
            digits[i] = 0;
        } else {
            // If the digit is less than 10, no need to carry over, so return the digits array
            return digits;
        }
    }
    
    // If we reach this point, it means all digits were 9s and we need to add an additional digit
    int[] newDigits = new int[n + 1];
    newDigits[0] = 1;
    
    return newDigits;
}


public static void main(String[] args) {
    int[] digits = {1, 2, 3};
    int[] result = plusOne(digits);
   System.out.println(Arrays.toString(result));
}


} 


    
 

