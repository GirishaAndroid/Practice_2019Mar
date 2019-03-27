package andorid.sample.practice_2019mar.workmanager.sample;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;

import java.util.ArrayList;

import andorid.sample.practice_2019mar.R;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class DoWork extends Worker {
    public DoWork(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        String url = getInputData().getString("KEY");

        // Do Work
        displayNotification("Workmanger","sample");
        //Return reponse with data object
        Data data = new Data.Builder()
                .putString("DATA","I am done with Job")
                .build();
       // setOutputData(data);
        return Result.success(data);
    }

    private void displayNotification(String title, String task) {
        NotificationManager notificationManager;
        notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("simplifiedcoding", "simplifiedcoding", NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder notification = new NotificationCompat.Builder(getApplicationContext(), "simplifiedcoding")
                .setContentTitle(title)
                .setContentText(task)
                .setSmallIcon(R.drawable.ic_launcher_background);

        notificationManager.notify(1, notification.build());
    }
}
