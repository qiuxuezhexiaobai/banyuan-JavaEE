package club.banyuan.details;

/**
 * @author nijing
 * @date 2020/11/12 8:04 下午
 * @override 1.0
 */
public class Demo2 {
    /**
     * 1234
     * 1234 % 10 = 4  1234 / 10 = 123  4
     * 123  % 10 = 3  123 / 10 = 12    4  3
     * 12   % 10 = 2  12 / 10 = 1；    4  3  2
     * 1    % 10 = 1  1  / 10 = 0；    4  3  2  1
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(reverse(-1203)+"");
    }
    public static int reverse(int num) {
        if(num <= Integer.MIN_VALUE || num >= Integer.MAX_VALUE){
            return 0;
        }
        int flag = num > 0 ? 1 : -1;
        if(flag == -1){
            num = -num;
        }
        int result = 0;
        while (num != 0){
            result = result * 10 + num % 10;
            num = num / 10;
        }
        return result*flag;
    }

}
