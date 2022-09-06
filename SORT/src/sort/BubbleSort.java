package sort;

import utils.Utils;

/**
 * @author all
 * @date 2022/9/6 18:57
 */

public class BubbleSort {
    public static void bubbleSort(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = start; j < end-i; j++) {
                if (array[j] > array[j + 1]) {
                    Utils.swap(array, j, j + 1);
                }
            }
        }
    }
}
