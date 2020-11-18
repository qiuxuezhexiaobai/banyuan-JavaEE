package club.banyuan.oop;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        for (int i = 0; i < 6; i++) {
            students[i] = new Student();
            students[i].setStuName("张"+i);
            students[i].setStuId((long) (201010+i));
            students[i].setStuScore((int)(Math.random()*20)+60.5);
            students[i].setStuAddress("江苏省南京市栖霞区"+i+"号");
        }
        for (int i = 0; i < students.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < students.length - 1 -i; j++) {
                if(students[j].getStuScore() < students[j+1].getStuScore()){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println(Arrays.toString(students));
    }
}
