package andorid.sample.practice_2019mar.threadSafe;

import android.util.Log;

import java.util.ArrayList;

public class SynchronizationDemo {

    class ChangeListener extends Thread {
        @Override
        public void run() {
            put();
        }
    }

    class ChangeMaker extends Thread {
        @Override
        public void run() {
            put();
        }
    }

    private void put() {
        Log.d("SyncDemo", "Before Synchronization"+"Thread "+Thread.currentThread().getName()+" state="+Thread.currentThread().getState());

        synchronized (this) {
            Log.d("SyncDemo", "Thread "+Thread.currentThread().getName()+" in Running state"+" state="+Thread.currentThread().getState());
            int count = 10;
            while (count > 0) {
                Log.d("SyncDemo","Count="+count--);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Log.d("SyncDemo", "Thread "+Thread.currentThread().getName()+" finished execution"+" state="+Thread.currentThread().getState());
        }

        Log.d("SyncDemo", "After Synchronization"+"Thread "+Thread.currentThread().getName()+" state="+Thread.currentThread().getState());
    }


    public void startThread() {

        new ChangeListener().start();
        new ChangeMaker().start();

    }
}
