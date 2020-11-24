package JavaBasic.src.club.banyuan.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/11 4:44 下午
 * @override 1.0
 */
public class HomeWork1 {

    private static Double[][] printGradeArr;

    public static void main(String[] args) {
        addGradeTable();
        printGradeTable();

        System.out.println("输入一个0～120成绩，判断等级(步骤为0.5)");
        Scanner pointScanner = new Scanner(System.in);
        Double grade = getGrade(pointScanner.nextDouble());
        System.out.println("等级是:"+grade);

        System.out.println("输入一个成绩看它是否及格(步骤为0.5)");
        Double grade2 = getGrade(pointScanner.nextDouble());
        boolean result = isPass(grade2);
        if(result){
            System.out.println(grade2+"是及格的！");
        }else{
            System.out.println(grade2+"是不及格的！！！！");
        }
        printGradeTable(1);
    }

    private static void addGradeTable() {
        printGradeArr = new Double[12][];
        double min = 0, max = 0, grade = 0;
        for (int i = 0; i < 12; i++) {
            min = max + 0.5;
            if (i == 0) {
                min = min - 0.5;
                max = min + 49.5;
            } else if (i == 1) {
                max = min + 9.5;
            } else if (i == 11) {
                max = min + 15;
            } else {
                max = min + 4.5;
            }

            if (i == 0) {
                grade = grade + 1.0;
            } else if (i == 2 || i == 5 || i == 8) {
                grade = grade + 0.4;
            } else if (i == 10) {
                grade = grade + 0.7;
            } else {
                grade = grade + 0.3;
            }

            int len = (int) ((max - min) / 0.5) + 2;
            Double[] seond = new Double[len];
            seond[0] = (double) Math.round(grade * 10) / 10; //精确到小数点后1位
            for (int j = 1; j < len; j++) {
                seond[j] = min + (j - 1) * 0.5;
            }
            printGradeArr[i] = seond;
        }
    }

    static void printGradeTable() {
        for (int i = 0; i < printGradeArr.length; i++) {
            for (int j = 0; j < printGradeArr[i].length; j++) {
                System.out.print(printGradeArr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    static void printGradeTable(int b) {
        for (int i = 0; i < printGradeArr.length; i++) {
            for (int j = b; j < printGradeArr[i].length; j++) {
                System.out.print(printGradeArr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    static double getGrade(double point) {
        Double grede = 0.0;
        if (point < 0 || point > 120.0) {
            System.out.println("输入数值不符合规格");
            return grede;
        }
        for (int i = 0; i < printGradeArr.length; i++) {
            for (int j = 0; j < printGradeArr[i].length; j++) {
                if (printGradeArr[i][j] == point) {
                    grede = printGradeArr[i][0];
                }
            }
        }

        return grede;
    }

    static boolean isPass(double point) {
        boolean result = true;
        System.out.println("0~120的所有成绩");
        for (int i = 0; i < printGradeArr.length; i++) {
            for (int j = 0; j < printGradeArr[i].length; j++) {
                if (printGradeArr[i][j] == point) {
                    if(printGradeArr[i][0] < 2.0){
                        result = false;
                    }
                }
            }
        }
        return result;
    }
}




