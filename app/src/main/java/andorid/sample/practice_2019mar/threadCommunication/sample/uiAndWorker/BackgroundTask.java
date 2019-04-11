package andorid.sample.practice_2019mar.threadCommunication.sample.uiAndWorker;

import android.os.Handler;
import android.os.Message;

public class BackgroundTask extends Thread {

    Handler uiHandler;

    public BackgroundTask(Handler handler) {
        uiHandler = handler;
    }

    @Override
    public void run() {

        //Do your Task here

        //update UI Thread
        Message message = new Message();
        message.arg1 = 123;
        message.obj = "";
        uiHandler.sendMessage(message);
    }
}
