package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author all
 * @date 2022/8/12 9:49
 */

public class Utils {

    public static void swap(int[] a, int i, int j){
        if (i == j) {
            return ;
        }
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }

    public static int[] generateRandomArray(int maxSize, int maxValue){
        // new Random().ints(0,2).limit(10).forEach(System.out::println);
        int[] array = new int[(int)(Math.random() * maxSize + 1)];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*maxValue+1) * (((int)(Math.random()*2)) == 1 ? 1 : -1);
        }
        return array;
    }

    // find the max number
    public static int getMaxNum (int[] a, int left, int right) {
        if (left == right){
            return a[left];
        }
        int mid = (left >> 1) + (right >> 1);
        int leftMax = getMaxNum(a, left, mid);
        int rightMax = getMaxNum(a, mid+1, right);
        return Math.max(leftMax, rightMax);
    }

    /**
     * 周转换成天数
     */
    public static String weekToDay(int year, int week){
        // 一年的第一周从1.4号开始算
        return null;
    }

    /**
     * week --> day
     * @param year
     * @param week
     * @return
     */
    public static String weekToDayFormate(int year, int week){
        Calendar calendar = Calendar.getInstance();
        // 1.设置该年份的开始日期：第一个月的第一天
        calendar.set(year,0,1);
        // 2.计算出第一周还剩几天：+1是因为1号是1天
        int dayOfWeek = 7 - calendar.get(Calendar.DAY_OF_WEEK) + 1;
        // 3.周数减去第一周再减去要得到的周
        week = week - 2;
        // 4.计算起止日期
        calendar.add(Calendar.DAY_OF_YEAR,week * 7 + dayOfWeek);
        // System.out.println("开始日期：" + new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
        String result = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()) + "~";
        calendar.add(Calendar.DAY_OF_YEAR, 6);
        // System.out.println("结束日期：" + new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
        return result + new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }

    public static char toUpperCase(char c) {
        return 97 <= c && c <= 122 ? (char) (c ^ 32) : c;
    }

    public static char toLowerCase(char c) {
        return 65 <= c && c <= 90 ? (char) (c | 32) : c;
    }


}
