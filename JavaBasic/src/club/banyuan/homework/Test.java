package JavaBasic.src.club.banyuan.homework;

/**
 * @author nijing
 * @date 2020/11/12 3:02 下午
 * @override 1.0
 */
public class Test {
    public static void main(String[] args) {
        printGradeTable();
    }

    private static void printGradeTable() {
        double grade = 1.0;
        for (int i = 0; i < 12; i++) {
            if (i == 0) {
                System.out.printf("%.1f\t0 - 49.5\n", grade);
            } else if (i == 1) {
                grade = getGrade(60 + (i - 2) * 5);
                System.out.printf("%.1f\t50 - 59.5\n", grade);
            } else if (i == 11) {
                grade = getGrade(60 + (i - 2) * 5);
                System.out.printf("%.1f\t105 - 120\n", grade);
            } else {
                grade = getGrade(60 + (i - 2) * 5);
                System.out
                        .printf("%.1f\t" + (60 + (i - 2) * 5) + " ~ " + (60 + (i - 2) * 5 + 4.5) + "\n", grade);
            }
        }
    }

    private static double getGrade(int point) {
        if (point <= 49.5) {
            return 1.0;
        } else if (point <= 59.5 && point >= 50) {
            return 1.3;
        }
        if (point >= 105) {
            return 5.0;
        }
        int step = (int) ((point - 60) / 5);
        switch (step) {
            case 0:
                return 1.7;
            case 1:
                return 2.0;
            case 2:
                return 2.3;
            case 3:
                return 2.7;
            case 4:
                return 3.0;
            case 5:
                return 3.3;
            case 6:
                return 3.7;
            case 7:
                return 4.0;
            case 8:
                return 4.7;
        }
        return 0.0;
    }
}
