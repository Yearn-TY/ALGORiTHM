package sort;

import utils.Utils;

/**
 * @author all
 * @date 2022/8/12 15:54
 */

public class QuickSort {
    /**
     * Mode: partition the array unilaterally.
     */
    private static final int UNILATERAL = 1;
    /**
     * Mode: partition the array bilaterally.
     */
    private static final int BILATERAL = 2;

    /**
     * quick sort
     * @param array integer array
     * @param start start index
     * @param end end index
     */
    public static void quickSort(int[] array, int start, int end) {
        if (start >= end || start < 0) {
            return;
        }
        int p = partition(array, start, end, BILATERAL);
        quickSort(array, start, p-1);
        quickSort(array, p+1, end);
    }

    /**
     * Partition the array in the mode.
     * @param array integer array
     * @param start start index
     * @param end end index
     * @param mode partition mode
     * @return index of partition position
     */
    private static int partition(int[] array, int start, int end, int mode) {
        int index = 0;
        switch (mode) {
            case UNILATERAL:
                index = partitionUnilateral(array, start, end);
                break;
            case BILATERAL:
                index = partitionBilateral(array, start, end);
                break;
            default:
        }
        return index;
    }
    /**
     * Partition the array unilaterally.
     * @param array integer array
     * @param start start index
     * @param end end index
     * @return index of partition position
     */
    private static int partitionUnilateral(int[] array, int start, int end) {
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

    /**
     * Partition the array bilaterally. (Hoare method)
     * @param array integer array
     * @param start start index
     * @param end end index
     * @return index of partition position
     */
    private static int partitionHoare(int[] array, int start, int end) {
        int pivot = array[start + (end - start) << 1];
        int i = start - 1;
        int j = end + 1;
        while (true) {
            while (array[++i] > pivot) {}
            while (array[--j] < pivot) {}
            if (i >= j) {
                return j;
            }
            Utils.swap(array, i, j);
        }
    }
    /**
     * Partition the array bilaterally.
     * @param array integer array
     * @param start start index
     * @param end end index
     * @return index of partition position
     */
    private static int partitionBilateral(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start;
        int j = end - 1;
        while (i < j) {
            while (i < j && array[i] < pivot) {
                i++;
            }
            while (i < j && array[j] > pivot) {
                j--;
            }
            Utils.swap(array, i, j);
        }
        Utils.swap(array, i, end);
        return i;
    }
}
