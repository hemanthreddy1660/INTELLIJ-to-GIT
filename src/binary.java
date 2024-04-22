public class binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetValue = 4;
        int result = target(arr, targetValue);
        if (result != -1) {
            System.out.println("Target " + targetValue + " found at index " + result);
        } else {
            System.out.println("Target " + targetValue + " not found in the array.");
        }
    }

    static int target(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2; // To avoid integer overflow
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1; // Target not found
    }
}
