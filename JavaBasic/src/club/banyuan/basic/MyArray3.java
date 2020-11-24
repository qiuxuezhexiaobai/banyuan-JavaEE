package JavaBasic.src.club.banyuan.basic;

import java.util.Arrays;

/**
 * @author nijing
 * @date 2020/11/11 1:53 下午
 * @override 1.0
 */
public class MyArray3 {
    public static void main(String[] args) {
        int[] arr = {34, 5, 621, 452, 13, 551, 12, 5};
        int[] arr1 = {5, 2, 6, 9, 5};
        System.out.println(sortArray(arr));
        System.out.println(sortArray(bubble(arr)));
    }

    public static String sortArray(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return Arrays.toString(arr);
    }

    public static int[] bubble(int[] arr) {
        int len = arr.length;
        //待排序元素个数 n - 1
        for (int i = len - 1; i > 0; i--) {
            //重置flag,进行本次判断，默认此轮排序无序
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            //此趟排序没有进行数值交换,flag = false
            if (!flag)
                break;
        }
        return arr;
    }
}

