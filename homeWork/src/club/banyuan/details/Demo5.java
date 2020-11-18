package club.banyuan.details;

/**
 * @author nijing
 * @date 2020/11/16 8:06 下午
 * @override 1.0
 */
public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,7,6,9,8};
        insertSort(arr);
    }
    static void insertSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        for(int i=1; i<arr.length; i++){
            int cur = arr[i];
            boolean flag = false;
            for(int j=i-1; j>=0; j--){
                if(cur<arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    arr[j+1] = cur;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                arr[0] = cur;
            }
        }
    }
}
