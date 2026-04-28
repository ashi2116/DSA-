class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }

        }

        return j + 1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        int length = removeDuplicates(arr);

        System.out.println("Unique elements count: " + length);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
