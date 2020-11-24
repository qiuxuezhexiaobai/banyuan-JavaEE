package JavaBasic.src.club.banyuan.basic;

import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/11 11:10 上午
 * @override 1.0
 */
public class MyArray2 {
    public static void main(String[] args) {
        int num = 5;
        StrArr strArr = new StrArr(5);
        while (num > 0) {
            System.out.println("请输入数据");
            Scanner first = new Scanner(System.in);
            strArr.add(first.next());
            num--;
        }
        strArr.list();
        System.out.println("请输入插入数据以及位置");
        int strIndex = new Scanner(System.in).nextInt();
        String strInfo = new Scanner(System.in).next();
        strArr.insert(strIndex,strInfo);
        strArr.list();

        System.out.println("修改第几个元素：");
        int strIndex3 = new Scanner(System.in).nextInt();
        String strInfo3 = new Scanner(System.in).next();
        strArr.update(strIndex3,strInfo3);
        strArr.list();

        System.out.println("删除第几个元素：");
        int strIndex2 = new Scanner(System.in).nextInt();
        strArr.delete(strIndex2);
        strArr.list();
    }
}

class StrArr {
    int counter = 0;
    int arrLen = 1;
    private String[] original;

    public StrArr(int arrLen) {
        this.arrLen = arrLen;
        original = new String[arrLen];
    }

    public void add(String str){
        if(counter < original.length){
            original[counter] = str;
            counter++;
        }
    }

    public void insert(int index, String str) {
        if(original.length == 0){
            add(str);
            return;
        }
        String[] newArr = new String[original.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index - 1) {
                newArr[i] = original[i];
            } else if (i > index - 1) {
                newArr[i] = original[i - 1];
            } else {
                newArr[i] = str;
            }
        }
        original = newArr;
    }

    public void list() {
        if (original.length == 0) {
            System.out.println("数组是空的，请先插入数据");
            return;
        }
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + "\t");
        }
        System.out.println();
    }

    public void update(int index, String str) {
        if (original.length == 0) {
            System.out.println("数组是空的");
            return;
        }
        original[index-1] = str;
    }

    public void delete(int index) {
        if (original.length == 0) {
            System.out.println("数组是空的");
            return;
        }
        String[] newArr = new String[original.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index-1) {
                newArr[i] = original[i];
            }else{
                newArr[i] = original[i+1];
            }
        }
        original = newArr;
    }
}
