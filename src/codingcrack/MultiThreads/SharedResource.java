package codingcrack.MultiThreads;

public class SharedResource {

    private volatile boolean flag = false;
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
