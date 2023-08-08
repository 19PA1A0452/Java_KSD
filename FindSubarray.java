public class FindSubarray {
    public static void main(String[] args) {
        int[] inputArray = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int[] result = findSubarrayIndexes(inputArray);

        if (result != null) {
            int start = result[0];
            int end = result[1];
            System.out.printf("The subarray lies between indexes %d and %d.%n", start, end);
        } else {
            System.out.println("No such subarray found.");
        }
    }

    public static int[] findSubarrayIndexes(int[] arr) {
        int start = 0;
        boolean peakFound = false;
        int peak = 0;

        // Find the peak element
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peakFound = true;
                peak = i;
                break;
            }
        }

        // If peak element is not found, the array doesn't satisfy the criteria
        if (!peakFound) {
            return null;
        }

        // Find the start of the subarray
        for (int i = peak; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                start = i;
                break;
            }
        }

        // Find the end of the subarray
        int end = peak;
        for (int i = peak; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }
}
