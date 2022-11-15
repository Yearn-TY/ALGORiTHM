package sort;

import utils.Utils;

/**
 * @author all
 * @date 2022/9/6 18:57
 */

public class BubbleSort {
    public static void bubbleSort(int[] array, int start, int end) {
        int lastSwapIndex = end;
        while (lastSwapIndex > 0) {
            int endIndex = lastSwapIndex;
            lastSwapIndex = 0;
            for (int i = start; i < endIndex; i++) {
                if (array[i] > array[i + 1]) {
                    lastSwapIndex = i;
                    Utils.swap(array, i, i+1);
                }
            }
        }
    }
}
