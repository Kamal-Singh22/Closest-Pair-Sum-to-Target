public class TwoSumClosest {
    public static int[] findClosestPair(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];

            // Update closest sum if needed
            if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                closestSum = sum;
                result[0] = arr[left];
                result[1] = arr[right];
            }

            // Move pointers
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 4, 6, 8};
        int target = 5;

        int[] result = findClosestPair(arr, target);
        System.out.println("Closest pair: [" + result[0] + ", " + result[1] + "]");
    }
}
