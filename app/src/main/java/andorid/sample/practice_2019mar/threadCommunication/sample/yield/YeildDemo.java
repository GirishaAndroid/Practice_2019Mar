package andorid.sample.practice_2019mar.threadCommunication.sample.yield;

import android.util.Log;

// https://howtodoinjava.com/java/multi-threading/difference-between-yield-and-join-in-threads-in-java/

public class YeildDemo {
    /*In below example program, I have created two threads named producer and consumer for no specific reason.
     Producer is set to minimum priority and consumer is set to maximum priority. I will run below code with/without commenting the line Thread.yield().
     Without yield(), though the output changes sometimes, but usually first all consumer lines are printed and then all producer lines.
     With using yield() method, both prints one line at a time and pass the chance to another thread, "almost all the time".
     Notice always high priority finished first*/

    int count = 1;

    class Producer implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                Log.d("Yield start", "I AM PRODUCER " + Thread.currentThread().getName() + " " + count++);
                Thread.yield();
            }
            Log.d("Yield end " + Thread.currentThread().getName(), " Finished");
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                Log.d("Yield start", "I AM CONSUMER " + Thread.currentThread().getName() + " " + count++);
                Thread.yield();
            }
            Log.d("Yield end " + Thread.currentThread().getName(), " Finished");
        }
    }

    public void startThread() {
        Thread t1 = new Thread(new Producer(), "Thread-1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        Thread t2 = new Thread(new Consumer(), "Thread-2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        Log.d("Run " + Thread.currentThread().getName(), " Finished");
    }

}
