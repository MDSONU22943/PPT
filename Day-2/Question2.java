import java.util.HashSet;

public class Question2{
    public int maxNumberOfDifferentCandies(int[] candyType) {
        int maxCandies = candyType.length / 2; // Maximum number of candies Alice can eat
        HashSet<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy); // Add each candy type to the set (duplicates will be automatically eliminated)
        }
        return Math.min(uniqueCandies.size(), maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        Question2 solution = new Question2();
        int maxDifferentCandies = solution.maxNumberOfDifferentCandies(candyType);
        System.out.println("Maximum number of different candies: " + maxDifferentCandies);
    }
}
