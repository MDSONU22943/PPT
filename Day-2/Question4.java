public class Question4 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;

                if (count >= n) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        Question4 solution = new Question4();
        boolean canPlace = solution.canPlaceFlowers(flowerbed, n);
        System.out.println("Can place flowers: " + canPlace);
    }
}
