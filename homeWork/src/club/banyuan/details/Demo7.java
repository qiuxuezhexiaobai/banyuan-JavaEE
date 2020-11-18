package club.banyuan.details;

import java.util.Arrays;

/**
 * @author nijing
 * @date 2020/11/17 2:19 下午
 * @override 1.0
 */
public class Demo7 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 7, 5, 6, 9, 4};
        insertSort(arr);
        choseSort(arr);
    }
    static void insertSort(int[] arr) {
        int i,j,temp;
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j>=0 && temp < arr[j] ; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void choseSort(int[] arr){
        int i,j,temp,min;
        for (i = 1;  i< arr.length - 1 ; i++) {
            min = i;
            for (j = i; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
