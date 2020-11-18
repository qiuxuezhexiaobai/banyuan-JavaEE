package club.banyuan.details;

import java.util.*;

/**
 * @author nijing
 * @date 2020/11/13 6:16 下午
 * @override 1.0
 */
public class Demo4 {
    /**
     * pwwkew
     * left=0; right=0; len=0;  str = null
     * left=0; str = p; right=1; len = 1;
     * left=0; str =pw; right=2; len = 1;
     * str=w; left=1;
     * str=null; left = 2;
     * str=w; right=3; left =2; len=1;
     * str=wk,right=4;left=2;len=2;
     * str=wk
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        tenth();
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        char[] a = s.toCharArray();

        int len = 0;
        int cur = 0;
        int start = 0;

        for (int i = 0; i < a.length; i++) {
            if(!map.containsKey((int)a[i])){
                len++;
                cur++;
                start=0;
                map.put((int)a[i], i);
            }else{
                start =  start > map.get((int)a[i]) ? start : map.get((int)a[i]) + 1;
                map.put((int)a[i], i);
            }
        }
        return len;
    }
    private static void tenth(){
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*10);
        }
        int len = arr.length;
        int index = 0;
        while(len > 0){
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if(index == arr[i]){
                    num++;
                }
            }

            if(index < 10){
                System.out.printf("%d>>%d\n", index, num);
                index++;
            }
            len--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
