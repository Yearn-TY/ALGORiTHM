package sort;

import utils.Utils;

/**
 * @Description:
 * @Author: all
 * @Date: 2022/8/12 17:13
 */

public class HeapSort {
    public static void heapSort(){

    }

    /**
     * 调整某位置上的数，使其满足大根堆结构
     * @param a
     * @param index
     */
    public static void heapInsert(int[] a, int index){
        while (a[index] > a[(index - 1) / 2]){
            Utils.swap(a, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }
}
