package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {

        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }
        while (i < first.length) {
            mix[k++] = first[i++];
        }

        while (j < second.length) {
            mix[k++] = second[j++];
        }
        return mix;
    }

    public static void mergeSortInPlace(int[] arr, int start, int end) {

        if (end - start <= 1) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int mix[] = new int[end - start];

        int i = start, j = mid, k = 0;

        while (i < mid && j < end) {

            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < mid) {
            mix[k++] = arr[i++];
        }

        while (j < end) {
            mix[k++] = arr[j++];
        }

        for (int x = 0; x < mix.length; x++) {
            arr[start + x] = mix[x];
        }
    }
}