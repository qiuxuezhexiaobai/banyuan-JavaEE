package JavaBasic.src.club.banyuan.homework;

import java.util.Arrays;

/**
 * @author nijing
 * @date 2020/11/11 9:50 下午
 * @override 1.0
 */
public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr = {13, 26, -3, 4, 54, 26, 37, 18, 69, -10};
        sort(arr, false);
        sort(arr);
        print(arr);
        int result = multiply(6, 5);
        convert(3456789);
        exchangeMoney();
        filtArray(arr);
    }

    /**
     * 根据传入的参数来将数组升序或降序排列
     *
     * @param isAsc true 升序， false 降序
     * @param arr
     */
    static void sort(int arr[], boolean isAsc) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (isAsc) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        flag = true;
                    }
                } else {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        flag = true;
                    }
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 重载方法，将数组升序
     *
     * @param arr 目标数组
     */
    static void sort(int arr[]) {
        sort(arr, true);
    }

    /**
     * 定义一个数组，内容 {13,26,-3,4,54,26,37,18,69,-10}，
     * 编写一个print方法，使用字符串拼接的方式，将数组内容数组输出为如下格式，每5个换行* @param arr 目标数组
     */
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 5 != 0) {
                System.out.print("[" + i + "]=" + arr[i] + "\t");
            } else {
                System.out.print("[" + i + "]=" + arr[i] + "\t\n");
            }
        }
    }

    /**
     * 编写一个方法不使用 * 完成两个数相乘
     *
     * @param n1
     * @param n2
     * @return
     */
    static int multiply(int n1, int n2) {
        int result = 0;
        if(n1 < 0){
            n1 = -n1;
        }
        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n2;
        }
        for (int i : arr) {
            result += i;
        }
        System.out.println(n1 + "*" + n2 + "=" + result);
        return result;
    }

    /**
     * 编写一个方法输入分钟时间，向控制台输出多少年，多少天
     *
     * @param minute
     */
    static void convert(long minute) {
        int day = (int) minute / 60 / 24;
        String result = day + "天";
        if (day == 0) {
            System.out.println("不满一天");
            return;
        }
        if (day > 365) {
            int year = day / 365;
            day = day % 365;
            result = year + "年" + day + "天";
        }
        System.out.println(result);
    }

    /**
     * 有1.5元钱兑换1分，2分，5分硬币100枚，每种面值至少一个，请输出所有的兑换方案，并统计方案的总数
     * <p>
     */
    static void exchangeMoney() {
        {
            int i, j, k, m = 0;
            for (i = 1; i < 30; i++) {
                for (j = 1; j < 75; j++) {
                    for (k = 1; k < 101; k++) {
                        if (5 * i + 2 * j + k == 150 && i + j + k == 100) {
                            m++;
                            System.out.printf("第%d种方案：", m);
                            System.out.printf("兑换5分%d个、2分%d个和1分%d个的硬币\n", i, j, k);
                        }
                    }
                }
            }
        }
    }

    /**
     * 编写一个方法用于int数组去重，将数组中重复的元素只保留一个
     *
     * @param arr
     * @return
     */
    static int[] filtArray(int[] arr) {
        int index = 0;
        int temp = arr[index];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if(temp == arr[i] && index != i){
                arr[i]=-10086;
                num++;
            }
            index = i;
            temp = arr[i];
        }
        int len = arr.length - num;
        int index2 = 0; //原数组移动下标
        int index3 = 0; //现数组移动下标
        int[] newArr = new int[arr.length - num];
        while (len > 0){
            if(arr[index2] != -10086){
                newArr[index2] = arr[index3];
            }else{
                newArr[index2] = arr[index3+1];
                index3++;
            }
            index2++;
            index3++;
            len--;
        }
        System.out.println("原来的数组："+Arrays.toString(arr));
        System.out.println("去重的数组："+Arrays.toString(newArr));
        return arr;
    }

}
