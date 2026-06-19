package Algorithms.Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int minIndex = getMinIndex(arr, i, n - 1);
            swap(arr, i, minIndex);
        }

    }

    public static int getMinIndex(int[] arr, int start, int end) {

        int minIndex = start;

        for (int i = start + 1; i < end; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }
}