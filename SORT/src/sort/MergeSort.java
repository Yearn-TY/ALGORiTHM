package sort;

/**
 * @ClassName: MergeSort
 * @Description:
 * @Author: all
 * @Date: 2022/8/12 15:26
 * @Copyright: msun
 */

public class MergeSort {
    public static void mergeSort (int[] a, int left, int right) {
        if (left == right) {
             return ;
        }
        int mid = (left >> 1) + (right >> 1);
        mergeSort(a, left, mid);
        mergeSort(a, mid+1, right);
        merge(a, left, mid, right);
    }
    public static void merge(int[] a, int left, int mid, int right){
        int[] res = new int[right - left + 1];
        int i = 0;
        int i1 = left, i2 = mid+1;
        while (i1 <= mid && i2 <= right){
            res[i++] = a[i1] < a[i2] ? a[i1++] : a[i2++];
        }
        while (i1 <= mid){
            res[i++] = a[i1++];
        }
        while ( i2 <= right){
            res[i++] = a[i2++];
        }
        for(int index = 0; index < res.length; index++){
            a[left+index] = res[index];
        }
    }
}
