package club.banyuan.oop;
public class Student {
    private String stuName;
    private Long stuId;
    private double stuScore;
    private String stuAddress;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public double getStuScore() {
        return stuScore;
    }

    public void setStuScore(double stuScore) {
        this.stuScore = stuScore;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    @Override
    public String toString() {
        return "Student [stuAddress=" + stuAddress + ", stuId=" + stuId + ", stuName=" + stuName + ", stuScore="
                + stuScore + "]";
    }
    
}
