package club.banyuan.video;

/**
 * @author nijing
 * @date 2020/11/19 4:59 下午
 * @override 1.0
 */
public class Video {
    private String videoName = "黑客帝国";  //电影名称
    private boolean flag;  // 是否有人租借中
    private double score;  //电影评分
    private int commit; //评论人数
    private int count;     //电影总库存
    private int checkOutNum; // 电影已出租的数量

    public Video(){}

    public Video(int count){
        this.count = count;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getCommit() {
        return commit;
    }

    public void setCommit(int commit) {
        this.commit = commit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCheckOutNum() {
        return checkOutNum;
    }

    public void setCheckOutNum(int checkOutNum) {
        this.checkOutNum = checkOutNum;
    }

      @Override
    public String toString() {
        return "Video{" +
                "电影名='" + videoName + '\'' +
                ", 是否有人租借中=" + flag +
                ", 电影评分=" + score +
                "，评论人数=" + commit +
                ", 总库存=" + count +
                ", 已出租=" + checkOutNum +
                ", 剩余库存=" + (count - checkOutNum) +
                '}';
    }

}
