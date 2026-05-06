public class Insertion_Sort {
    public static void main(String[] args) {
        // we have to part sorted and unsorted
        // 7 | 8 3 1 2
        // 7 8 | 3 1 2
        int[] arr = { 7, 8, 3, 1, 2 };

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
