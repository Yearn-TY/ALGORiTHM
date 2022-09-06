package search;

/**
 * @author all
 * @date 2022/9/5 18:46
 */

public class BinarySearch {
    public static int binarySearch(int[] array, int start, int end, int target) {
        if (start > end || start <= -1 || end >= array.length) {
            return Integer.MIN_VALUE;
        }
        int mid = start + ((end - start) >> 1);
        return array[mid] == target ? mid :
                (array[mid] > target ? binarySearch(array, start, mid - 1, target) :
                        binarySearch(array, mid + 1, end, target));
    }
}
