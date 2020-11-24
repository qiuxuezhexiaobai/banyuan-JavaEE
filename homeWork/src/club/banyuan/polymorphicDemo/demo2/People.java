package club.banyuan.polymorphicDemo.demo2;

/**
 * @author nijing
 * @date 2020/11/24 7:16 下午
 * @override 1.0
 */
public class People extends Monkey{
    @Override
    public void speak(){
        System.out.println("小样的，不错嘛！会说话了！");
    }

    public void think(){
        System.out.println("别说话！认真思考！");
    }
}
