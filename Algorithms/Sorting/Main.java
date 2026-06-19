package Algorithms.Sorting;

public class Main {

    public static void main(String[] args) {

        int[] arr = { 66, 219, 31, 433, 513, 693, 87, 338, 922, 101 };

        // Calling Bubble Sort

        // System.out.println("Original Array:");
        // printArray(arr);

        // BubbleSort.bubbleSort(arr);

        // System.out.println("After Bubble Sort:");
        // printArray(arr);

        // Calling Selection Sort

        // System.out.println("Original Array:");
        // printArray(arr);

        // SelectionSort.selectionSort(arr);

        // System.out.println("After Selection Sort:");
        // printArray(arr);

        // Calling Insertion Sort

        // System.out.println("Original Array:");
        // printArray(arr);

        // InsertionSort.insertionSort(arr);

        // System.out.println("After Insertion Sort:");
        // printArray(arr);

        // Calling Merge Sort

        // System.out.println("Original Array:");
        // printArray(arr);

        // int[] MergeSortedArray = MergeSort.mergeSort(arr);

        // System.out.println("After Merge Sort:");
        // printArray(MergeSortedArray);

        // Calling Merge Sort In Place

        // System.out.println("Original Array:");
        // printArray(arr);

        // MergeSort.mergeSortInPlace(arr, 0, arr.length);

        // System.out.println("After Merge Sort In Place:");
        // printArray(arr);

        // Calling quick Sort

        // System.out.println("Original Array:");
        // printArray(arr);

        // QuickSort.quickSort(arr, 0, arr.length - 1);

        // System.out.println("After quick Sort:");
        // printArray(arr);

        // Calling Count Sort

        // System.out.println("Original Array:");
        // printArray(arr);

        // CountSort.countSort(arr);

        // System.out.println("After Count Sort:");
        // printArray(arr);

        // Calling Radix Sort

        System.out.println("Original Array:");
        printArray(arr);

        RadixSort.radixSort(arr);

        System.out.println("After Radix Sort:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

    }

}