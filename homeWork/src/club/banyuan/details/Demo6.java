package club.banyuan.details;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author nijing
 * @date 2020/11/17 2:00 下午
 * @override 1.0
 */
public class Demo6 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 1, 2, 9, 4};
        System.out.println(Arrays.toString(remove(arr)));
    }

    static int[] remove(int[] arr) {
        int[] newArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isRepat = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isRepat = true;
                    break;
                }
            }
            if(!isRepat){
                newArr[index] = arr[i];
                index++;
            }
        }
        int[] xin = new int[index];
        for (int i = 0; i < xin.length; i++) {
            xin[i] = newArr[i];
        }
        arr = xin;
        System.out.println("in:" + Arrays.toString(xin));
        return arr;
    }
}
