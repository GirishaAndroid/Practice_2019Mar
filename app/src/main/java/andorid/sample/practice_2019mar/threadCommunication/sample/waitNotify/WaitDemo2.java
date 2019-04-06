package andorid.sample.practice_2019mar.threadCommunication.sample.waitNotify;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class WaitDemo2 {

    class Producer implements Runnable {

        List<Integer> dataQue;
        int size;
        int i;

        public Producer(List<Integer> sharedData, int MAX_SIZE) {
            dataQue = sharedData;
            size = MAX_SIZE;
        }

        @Override
        public void run() {

            while (true) {
                synchronized (dataQue) {

                    while (dataQue.size() == size) {
                        Log.d("Notifyall", "Que is full, ." + " Thread Name =" + Thread.currentThread().getName());
                        try {
                            dataQue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    dataQue.add(i++);

                    Log.d("Notifyall", "Producer-"+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    dataQue.notifyAll();
                }

            }
        }

    }

    class Consumer implements Runnable {

        List<Integer> dataQue;

        public Consumer(List<Integer> sharedData) {
            dataQue = sharedData;
        }

        @Override
        public void run() {
            while (true) {

                synchronized (dataQue) {

                    while (dataQue.isEmpty()) {
                        Log.d("Notifyall", "wait que is empty lets producer add" + " Thread Name =" + Thread.currentThread().getName());
                        try {
                            dataQue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int i = (Integer) dataQue.remove(0);
                    Log.d("Notifyall", "Consumer=" + i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    dataQue.notifyAll();

                }
            }
        }
    }

    public void TaskQue() {


        int MAX_SIZE = 5;
        List<Integer> sharedData = new ArrayList<>();

        Thread producer = new Thread(new Producer(sharedData, MAX_SIZE), "Producer");
        Thread consumer = new Thread(new Consumer(sharedData), "Consumer");

        producer.start();
        consumer.start();

    }
}
