package andorid.sample.practice_2019mar.threadCommunication.sample.uiAndWorker;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class ViewClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);

                switch (msg.arg1) {
                    case 123:
                        Log.d("uiAndWorkerThread", "Data updated to UI thread from Worker thread");
                        break;
                }
            }
        };

        BackgroundTask backgroundTask = new BackgroundTask(handler);
        backgroundTask.start();
    }
}
