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
        for (int i = (end-start) >> 1; i >= 0; i--) {
            maxHeapify(array, i, end);
        }

    }

    /**
     * Adjust the big root heap.
     * @param array Integer array
     * @param start start index
     * @param end end index
     */
    public static void maxHeapify(int[] array, int start, int end) {

    }
    /**
     * Insert an integer into heap, and adjust to satisfy the big root heap.
     * @param array Integer array
     * @param index index of the number to insert
     */
    public static void heapInsert(int[] array, int index) {
        while (array[index] > array[(index - 1) / 2]){
            Utils.swap(array, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }
}
