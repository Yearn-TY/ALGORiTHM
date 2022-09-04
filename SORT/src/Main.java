import sort.QuickSort;

import java.util.Arrays;

/**
 * @author all
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("This is an algorithm program!");
        int[] array = {1,2,6,4,9,22,3,66,99,1,20,10};
        System.out.println(Arrays.toString(array));
        QuickSort.quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}