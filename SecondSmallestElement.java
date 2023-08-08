public class SecondSmallestElement {
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] array = { 12, 45, 1, 8, 36, 25 };
        int secondSmallest = findSecondSmallest(array);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
