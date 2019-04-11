package andorid.sample.practice_2019mar.threadSafe;

import android.util.Log;
//https://howtodoinjava.com/java/multi-threading/object-vs-class-level-locking/
//https://www.geeksforgeeks.org/object-level-class-level-lock-java/
public class SynchronizationDemo2 {

    SynchronizationDemo2 lockObj;
    SynchronizationDemo2 object2;

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
        Log.d("SyncDemo2", "Before Synchronization"+"Thread "+Thread.currentThread().getName()+" state="+Thread.currentThread().getState());

        synchronized (lockObj) {
            lockObj.doLogic("lockObj");

        }
        object2.doLogic("Object2");

        Log.d("SyncDemo2", "After Synchronization"+"Thread "+Thread.currentThread().getName()+" state="+Thread.currentThread().getState());
    }

    private void doLogic(String data) {
        Log.d("SyncDemo2", "Thread data"+data+" "+Thread.currentThread().getName()+" in Running state"+" state="+Thread.currentThread().getState());
        int count = 100;
        while (count > 0) {
            Log.d("SyncDemo2","Count="+count--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.d("SyncDemo2", "Thread "+Thread.currentThread().getName()+" finished execution"+" state="+Thread.currentThread().getState());

    }


    public void startThread() {

        lockObj = new SynchronizationDemo2();
        object2 = new SynchronizationDemo2();

        new ChangeListener().start();
        new ChangeMaker().start();

    }
}
