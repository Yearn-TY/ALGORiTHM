package sort;

import utils.Utils;

/**
 * @author  all
 * @date 2022/8/12 17:13
 */

public class HeapSort {

    /**
     * heap sort process
     * @param array Integer array
     * @param start start index
     * @param end end index
     */
    public static void heapSort(int[] array, int start, int end) {
        // Build the big root heap.
        for (int i = start + ((end-start) >> 1); i >= start; i--) {
            maxHeapify(array, i, end);
        }
        // Swap the big root to end node.
        while (end > start) {
            Utils.swap(array, start, end--);
            maxHeapify(array, start, end);
        }
    }

    /**
     * Adjust the big root heap.
     * @param array Integer array
     * @param index start index
     * @param end end index
     */
    private static void maxHeapify(int[] array, int index, int end) {
        if (index >= end) {
            return;
        }
        int leftLeafIndex = (index << 1) + 1;
        int rightLeafIndex = (index << 1) + 2;
        int largestIndex = index;
        if (leftLeafIndex <= end && array[leftLeafIndex] > array[largestIndex]) {
            largestIndex = leftLeafIndex;
        }
        if (rightLeafIndex <= end && array[rightLeafIndex] > array[largestIndex]) {
            largestIndex = rightLeafIndex;
        }
        if (largestIndex != index) {
            Utils.swap(array, largestIndex, index);
            maxHeapify(array, largestIndex, end);
        }
    }
    /**
     * Insert an integer into heap, and adjust to satisfy the big root heap.
     * @param array Integer array
     * @param index index of the number to insert
     */
    public static void heapInsert(int[] array, int index) {
        while (array[index] > array[(index - 1) << 1]){
            Utils.swap(array, index, (index - 1) << 1);
            index = (index - 1) << 1;
        }
    }
}
