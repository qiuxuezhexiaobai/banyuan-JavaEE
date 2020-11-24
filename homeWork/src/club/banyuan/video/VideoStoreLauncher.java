package club.banyuan.video;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author nijing
 * @date 2020/11/19 5:08 下午
 * @override 1.0
 */
public class VideoStoreLauncher {
    static VideoStore videoStore = null;
    public static void main(String[] args) {
        videoStore = new VideoStore();
        initScanner();
    }

    private static void initScanner() {
        boolean flag = true;
        while (flag){
            System.out.println("<<<<<<<<<<<<<<<<<<<<小型录象带出租管理系统>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("1：添加一个新的电影");
            System.out.println("2：租借电影");
            System.out.println("3：归还电影");
            System.out.println("4：电影评分(分值在1~5)");
            System.out.println("5：查看库存");
            System.out.println("0: 退出系统");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option){
                case 0:
                    flag = false;
                    break;
                case 1:
                    Video video1 = new Video();
                    System.out.println("输入电影名：");
                    String videoName = scanner.next();
                    video1.setVideoName(videoName);
                    System.out.println("输入进货数量：");
                    int count = scanner.nextInt();
                    video1.setCount(count);
                    videoStore.addVideo(video1);
                    break;
                case 2:
                    System.out.println("输入电影名：");
                    String videoName2 = scanner.next();
                    boolean isCheckoutSuccess = videoStore.checkOut(videoName2);
                    if(isCheckoutSuccess){
                        System.out.println("成功借出电影");
                    }else{
                        System.out.println("借出电影失败");
                    }
                    break;
                case 3:
                    System.out.println("输入电影名：");
                    String videoName3 = scanner.next();
                    boolean result = videoStore.returnVideo(videoName3);
                    if(true){
                        System.out.println("归还成功!");
                    }else{
                        System.out.println("归还失败!");
                    }
                    break;
                case 4:
                    System.out.println("输入电影名：");
                    String videoName4 = scanner.next();
                    System.out.println("输入评分：");
                    double score = scanner.nextDouble();
                    videoStore.receiveRating(videoName4,score);
                    break;
                case 5:
                    System.out.println(Arrays.toString(videoStore.listInventory()));
                    break;
                default:
                    break;
            }
        }
    }


    //出租电影
    private static void checkOut() {

    }
}
