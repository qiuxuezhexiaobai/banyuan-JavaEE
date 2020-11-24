package club.banyuan.video;

import java.util.Arrays;

/**
 * @author nijing
 * @date 2020/11/19 4:59 下午
 * @override 1.0
 */
public class VideoStore {

    private static Video[] videos;

    public VideoStore(){
        videos = new Video[0];
    }

    public Video[] getVideos() {
        return videos;
    }

    public void setVideos(Video[] videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                "videos=" + Arrays.toString(videos) +
                '}';
    }

    /**
     * 添加一个新的电影
     * @param video
     */
    public void addVideo(Video video){
        for (int i = 0; i < videos.length; i++) {
            if(videos[i].getVideoName().equals(video.getVideoName()) ){
                int count = video.getCount() + videos[i].getCount();
                videos[i].setCount(count);
                return;
            }
        }
        videos = Arrays.copyOf(videos, videos.length + 1);
        videos[videos.length - 1] = video;
    }

    /**
     * 根据片名借出电影
     * @param videoName
     * @return
     */
    public boolean checkOut(String videoName){
        Video temp = null;
        for (int i = 0; i < videos.length; i++) {
            if(videos[i].getVideoName().equals(videoName)
                    && (videos[i].getCount() - videos[i].getCheckOutNum()) > 0){
                temp = videos[i];
                videos[i].setFlag(true);
                videos[i].setCheckOutNum(videos[i].getCheckOutNum()+1);
                return true;
            }
        }
        return false;
    }

    /**
     * 归还电影
     * @param videoName
     * @return
     */
    public boolean returnVideo(String videoName){
        for (int i = 0; i < videos.length; i++) {
            if(videos[i].getVideoName().equals(videoName)){
                videos[i].setCheckOutNum(videos[i].getCheckOutNum() - 1);
                if(videos[i].getCheckOutNum() == 0){
                    videos[i].setFlag(false);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * 设置用户对电影的评分(1~5)，收到评分之后，
     * 计算该电影的平均评分，然后保存到Video的评分属性中
     * @param name
     * @param score
     */
    public  void receiveRating(String name, double score){
        if(score<1 || score>5){
            System.out.println("分值在1~5");
            return;
        }
        Video video = null;
        for (int i = 0; i < videos.length; i++) {
            if(videos[i].getVideoName().equals(name)){
                video = videos[i];
            }
        }
        if(video == null){
            return;
        }
        double newScore = (video.getCommit() * video.getScore() + score) / (video.getCommit() + 1);
        video.setScore((double) Math.round(newScore * 100) / 100);
        video.setCommit(video.getCommit()+1);
    }

    /**
     * 列出整个库存的电影
     * @return
     */
    public Video[] listInventory(){
        Video[] stock = new Video[0];
        for (int i = 0; i < videos.length; i++) {
            if((videos[i].getCount() - videos[i].getCheckOutNum()) > 0){
                stock = Arrays.copyOf(stock, stock.length + 1);
                stock[stock.length - 1] = videos[i];
            }
        }
        return stock;
    }
}
