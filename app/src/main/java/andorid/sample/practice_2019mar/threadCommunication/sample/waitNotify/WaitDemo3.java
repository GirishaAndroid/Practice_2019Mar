package andorid.sample.practice_2019mar.threadCommunication.sample.waitNotify;

import android.util.Log;

public class WaitDemo3 {

    int number = 1;

    class Odd extends Thread {
        @Override
        public void run() {
            do {
                Odd();
            } while (number < 100);
        }

        private void Odd() {

            synchronized (this) {
                while (number % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Log.d("Number", "Odd=" + number++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }

        }
    }

    class Even extends Thread {
        @Override
        public void run() {
            do {
                Even();
            } while (number < 100);
        }

        private void Even() {

            synchronized (this) {

                while (number % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                Log.d("Number", "Even=" + number++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }

        }
    }

    public void startThread() {
        Odd t1 = new Odd();
        Even t2 = new Even();

        t1.start();
        t2.start();
    }

}
