package andorid.sample.practice_2019mar.threadSafe;

import android.util.Log;

/* https://dzone.com/articles/java-volatile-keyword-0
   Each thread has its own stack, and so its own copy of variables it can access.
*  Each thread has its own stack, and so its own copy of variables it can access. When the thread is created,
*  it copies the value of all accessible variables in its own memory.
*  The volatile keyword is used to say to the jvm "Warning, this variable may be modified in an other Thread" */

public class VolatileDemo {

    private volatile static  int MY_INT = 0;

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while (local_value < 5) {
                if (local_value != MY_INT) {
                    Log.d("VolatileDemo","Got Change for MY_INT : {0}"+ MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT < 5) {
                Log.d("VolatileDemo","Incrementing MY_INT to {0}" + local_value + 1);
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void startThread() {

        new ChangeListener().start();
        new ChangeMaker().start();
    }


}
