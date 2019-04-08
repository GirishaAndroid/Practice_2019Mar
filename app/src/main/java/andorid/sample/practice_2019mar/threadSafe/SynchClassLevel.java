package andorid.sample.practice_2019mar.threadSafe;

import android.util.Log;
//https://www.youtube.com/watch?v=YpI5l7LjEOo
//Every class has default class variable. In static method synchronization, thread aquires current class object lock.
// hence any other method with static block will not execute since already one thread aquire lock on class object.

public class SynchClassLevel {

    static class Display {

        public static void write(String name) {
            int i = 1;
            do {
                Log.d("SynchClassLevel " + Thread.currentThread().getName(), "" + name + i++);
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
            synchronized (Display.class) {
                Display.write("Rama");
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
