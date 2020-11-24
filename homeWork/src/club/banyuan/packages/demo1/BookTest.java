package club.banyuan.packages.demo1;

/**
 * @author nijing
 * @date 2020/11/20 9:16 下午
 * @override 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("新华字典");
        book.setPageNum(300);
        System.out.println(book.detail());
    }
}
