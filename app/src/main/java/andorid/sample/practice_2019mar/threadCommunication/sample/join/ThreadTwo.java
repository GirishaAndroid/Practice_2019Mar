package andorid.sample.practice_2019mar.threadCommunication.sample.join;

import android.util.Log;

public class ThreadTwo implements Runnable {

    int count;

    @Override
    public void run() {
        do {
            Log.d("Start "+Thread.currentThread().getName(), "Count=" + count++);
        } while (count < 100);

        Log.d("Start "+Thread.currentThread().getName(), "Finished");
    }
}
