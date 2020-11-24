package JavaBasic.src.club.banyuan.homework;

/**
 * @author nijing
 * @date 2020/11/12 10:56 上午
 * @override 1.0
 */
public class HomeWork5 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,2,4,6,7,8};
        removeHas(ints);
    }
    static void removeHas(int[] ints){
        int[] newArr = new int[ints.length];
        int key = 0;
        for (int i = 0; i < ints.length; i++) {
            boolean flag = true;
            for (int j = i+1; j < ints.length; j++) {
                if(ints[i] == ints[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                newArr[key++] = ints[i];
            }
        }
        int[] infoArray = new int[key];  //这里key 是 newArr 最大下标 + 1；  因为if(flag) 中 key++
        for (int i = 0; i < infoArray.length; i++) {
            infoArray[i] = newArr[i];
        }
    }
}
