package club.banyuan.details;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author nijing
 * @date 2020/11/13 10:45 上午
 * @override 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
        mult(9);
        pic(5);
        int[] ints = {1, 2, 3, 13, 5, 6, 7, 8, 9, 10};
        findMax(ints);
        findMaxAndMin(ints);
    }
    static int[] twoSum(int[] arr, int result){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int diff = result - arr[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff));
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
    static void mult(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i ;j++) {
                System.out.printf(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println("\n");
        }
    }
    static void pic(int n){
        for (int i = 0; i < n; i++) {
            String result = "";
            for (int j = n; j>i; j--) {
                result = result + j;
            }
            System.out.println(result);
        }
        System.out.println("\n");
    }

    static void findMax(int[] arr){
        int index = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                index = i;
                max = arr[i];
            }
        }
        System.out.println("最大数是："+max+",下标是："+index);
    }

    static void findMaxAndMin(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j++] = temp;
                    flag = false;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
