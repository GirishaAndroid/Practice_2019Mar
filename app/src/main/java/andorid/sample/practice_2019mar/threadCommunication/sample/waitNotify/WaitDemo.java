package andorid.sample.practice_2019mar.threadCommunication.sample.waitNotify;

import android.util.Log;

public class WaitDemo {

    int i;
    Pojo pojo;

    class Producer implements Runnable {

        @Override
        public void run() {

            do {

                Log.d("Wait", "Producer=" + i);
                try {
                    pojo.setCount(i++);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (i < 10);
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            do {
                try {
                    Log.d("Wait", "Consumer=" + pojo.getCount());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (i < 10);
        }
    }

    class Pojo {

        int count;
        boolean channel = false;

        public synchronized int getCount() throws InterruptedException {
            while (!channel) {
                wait();
            }
            channel = false;
            notify();
            return count;
        }

        public synchronized void setCount(int count) throws InterruptedException {

            while (channel) {
                wait();
            }
            this.count = count;
            channel = true;
            notify();
        }
    }

    public void startDemo() {

        pojo = new Pojo();

        Thread producer = new Thread(new Producer(), "Producer");
        Thread consumer = new Thread(new Consumer(), "Consumer");

        producer.start();
        consumer.start();
    }
}
