package andorid.sample.practice_2019mar.threadSafe;

import android.util.Log;

public class SynchDemo3 {

    class Display {

        private void write(String name) {
            int i = 1;
            do {
                Log.d("SynchDemo3 " + Thread.currentThread().getName(), "" + name + i++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (i < 100);
        }
    }

    class MyThread extends Thread {
        Display d;

        public MyThread(Display d) {
            this.d = d;
        }

        @Override
        public void run() {
            synchronized (d) {
                d.write("Rama");
            }
        }
    }

    public void startThred() {

        Display d1 = new Display();
        Display d2 = new Display();

        MyThread myThread = new MyThread(d1);
        MyThread myThread1 = new MyThread(d1);
        myThread1.setName("MyThread2");
        myThread.setName("MyThread");
        myThread.start();
        myThread1.start();
    }
}
