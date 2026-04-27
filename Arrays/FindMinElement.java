class FindMinElement {

    public static int findMin(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 1, 9};

        int result = findMin(arr);

        System.out.println("Minimum element is: " + result);

    }
}
