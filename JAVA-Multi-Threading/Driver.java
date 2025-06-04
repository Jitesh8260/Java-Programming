class ChildThread extends Thread {
    int start, end;

    public ChildThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { 
                System.out.println("Child : " + i);
            }
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        int m = 1, n = 10;

        Thread childThread = new ChildThread(m, n);
        childThread.start();

        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Parent: " + i);
            }
        }
    }
}
