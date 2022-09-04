package sort;

import utils.Utils;

/**
 * @author all
 * @date 2022/8/12 15:54
 */

public class QuickSort {
    /**
     * quick sort
     * @param array integer array
     * @param start start index
     * @param end end index
     */
    public static void quickSort(int[] array, int start, int end){
        if (start >= end || start < 0) {
            return;
        }
        int p = partition(array, start, end);
        quickSort(array, start, p-1);
        quickSort(array, p+1, end);
    }

    /**
     * Partition the array
     * @param array integer array
     * @param start start index
     * @param end end index
     * @return index of partition position
     */
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                Utils.swap(array, i++, j);
            }
        }
        Utils.swap(array, i, end);
        return i;
    }

}
