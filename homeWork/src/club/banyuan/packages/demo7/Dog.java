package club.banyuan.packages.demo7;

/**
 * @author nijing
 * @date 2020/11/20 9:47 下午
 * @override 1.0
 */
public class Dog {
    public void yao(){
        System.out.println("汪汪叫");
    }
    public void yao(String str){
        System.out.println("咬骨头，好香啊");
    }
    public void yao(Person p){
        if(p.getSex().equals("男")){
            System.out.println("扑上去撕咬");
        }else{}
    }
}
