package andorid.sample.practice_2019mar.threadCommunication.sample.join;

import java.lang.Thread;

public class ThreadsChannel {

   // public static volatile int count = 0;
    Thread t1, t2;

    public void startThread1() {

        t1 = new Thread(new ThreadOne(), "Thread-1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void startThread2() {
        t2 = new Thread(new ThreadTwo(), "Thread-2");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
