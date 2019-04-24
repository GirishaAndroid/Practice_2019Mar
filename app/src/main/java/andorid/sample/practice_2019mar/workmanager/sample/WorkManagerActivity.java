package andorid.sample.practice_2019mar.workmanager.sample;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import andorid.sample.practice_2019mar.R;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;

public class WorkManagerActivity extends AppCompatActivity {

    TextView tv;
    OneTimeWorkRequest workRequest, workRequest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worker_ui);

        tv = findViewById(R.id.textView);

        Constraints constraints = new Constraints.Builder()
                .setRequiresStorageNotLow(true)
                .setRequiresCharging(true)
                .build();

        Data data = new Data.Builder()
                .putString("KEY", "Value")
                .build();

        workRequest = new OneTimeWorkRequest.Builder(DoWork.class)
                .setConstraints(constraints)
                .setInputData(data)
                .addTag("UploadImage")
                .build();
        workRequest2 = new OneTimeWorkRequest.Builder(DoWork.class)
                .setConstraints(constraints)
                .setInputData(data)
                .addTag("UploadImage")
                .build();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WorkManager.getInstance().enqueue(workRequest);
                //WorkManager.getInstance().enqueue(workRequest2);
               /* WorkManager.getInstance().beginWith(Arrays.asList(workRequest, workRequest2))
                        .enqueue();*/

            }
        });

        /*//*WorkManager.getInstance().getWorkInfoByIdLiveData(workRequest.getId())
                .observe();*/
        WorkManager.getInstance().getWorkInfoByIdLiveData(workRequest.getId())
                .observe(this, new Observer<WorkInfo>() {
                    int i = 0;

                    @Override
                    public void onChanged(WorkInfo workInfo) {
                        tv.append(" " + workInfo.getState().name() + " " + workInfo.getOutputData().getString("DATA") + " " + i++);
                    }
                });
        WorkManager.getInstance().getWorkInfoByIdLiveData(workRequest2.getId())
                .observe(this, new Observer<WorkInfo>() {
                    int i = 0;

                    @Override
                    public void onChanged(WorkInfo workInfo) {
                        tv.append(" " + workInfo.getState().name() + " " + workInfo.getOutputData().getString("DATA") + " " + i++);
                    }
                });
    }
}

