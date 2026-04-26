class MaximumSubarray {

    public static int maxSubArray(int[] arr) {

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(arr);

        System.out.println("Maximum subarray sum is: " + result);

    }
}
