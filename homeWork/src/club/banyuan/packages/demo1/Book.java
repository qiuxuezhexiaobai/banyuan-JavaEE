package club.banyuan.packages.demo1;

/**
 * @author nijing
 * @date 2020/11/20 9:13 下午
 * @override 1.0
 */
public class Book {
    private String title;
    private int pageNum = 200;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if(pageNum < 200){
            System.out.println("页数不能少于200页");
            return;
        }
        this.pageNum = pageNum;
    }
    public String detail(){
        return "名称:"+title+";页数:"+pageNum;
    }
}
