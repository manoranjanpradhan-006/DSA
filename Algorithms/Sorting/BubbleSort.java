package Algorithms.Sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
                swapped = true;
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }
}