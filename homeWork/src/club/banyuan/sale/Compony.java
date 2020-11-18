package club.banyuan.sale;

import java.util.Arrays;

/**
 * @author nijing
 * @date 2020/11/17 8:27 下午
 * @override 1.0
 */
public class Compony {

    private Employee[] employeeArr;

    public Employee[] getEmployeeArr() {
        return employeeArr;
    }

    public void setEmployeeArr(Employee[] employeeArr) {
        this.employeeArr = employeeArr;
    }
    public Compony(){
       employeeArr = new Employee[1];
    }

    @Override
    public String toString() {
        return "Compony{" +
                "employeeArr=" + Arrays.toString(employeeArr) +
                '}';
    }

    Employee add(Employee emp){
        Employee[] temp;
        if (isEmpty()){
            temp = new Employee[1];
            temp[0] = emp;
        }else{
            temp = new Employee[employeeArr.length+1];
            for (int i = 0; i < temp.length; i++) {
                if(i<temp.length - 1){
                    temp[i] = employeeArr[i];
                }else{
                    temp[i] = emp;
                }
            }
        }
        setEmployeeArr(temp);
        System.out.println(Arrays.toString(employeeArr));
        return emp;
    }

    Employee remove(String name){
        Employee[] temp;
        Employee employee = null;//要删除的员工
        if (isEmpty()){
            return null;
        }else{
            int index = -1;
            for (int i = 0; i < employeeArr.length; i++) {
                if(name.equals(employeeArr[i].getName())){
                    index = i;
                }
            }
            temp = new Employee[employeeArr.length - 1];
            for (int i = 0; i < temp.length; i++) {
                if(i<index){
                    temp[i] = employeeArr[i];
                }else{
                    temp[i] = employeeArr[i+1];
                }
            }
        }
        setEmployeeArr(temp);
        System.out.println(Arrays.toString(employeeArr));
        return employee;
    }

    Employee show(String name){
        Employee emp = null;
        for (int i = 0; i < employeeArr.length; i++) {
            if(name.equals(employeeArr[i].getName())){
                return employeeArr[i];
            }
        }
        return emp;
    }
    double sum(){
        double sum = 0.0;
        if(isEmpty()){
            return 0.0;
        }
        for (int i = 0; i < employeeArr.length; i++) {
            sum+=employeeArr[i].getSalary();
        }
        return sum;
    }
    public boolean isEmpty(){
        if (employeeArr == null){
            return true;
        }
        if(employeeArr.length!=0 ){ //数组里面没有元素
            for (int i = 0; i < employeeArr.length; i++) {
                if(employeeArr[i]!=null){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
