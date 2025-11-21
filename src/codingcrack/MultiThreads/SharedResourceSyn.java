package codingcrack.MultiThreads;

public class SharedResourceSyn {

    private volatile boolean flag = false;
    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }

}
