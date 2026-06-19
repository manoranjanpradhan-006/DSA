package Algorithms.Sorting;

public class CountSort {
    public static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = arr[0];

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }

        int[] count = new int[max + 1];

        for (int i : arr) {
            count[i]++;
        }

        int index = 0;

        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}
