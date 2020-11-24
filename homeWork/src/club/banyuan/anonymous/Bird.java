package club.banyuan.anonymous;

public abstract class Bird {
    private String name = "燕子";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();
}

