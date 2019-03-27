package andorid.sample.practice_2019mar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import andorid.sample.practice_2019mar.fragment.sample.FragmentActivityClass;
import andorid.sample.practice_2019mar.workmanager.sample.WorkManagerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainui);

        findViewById(R.id.fragment).setOnClickListener(this);
        findViewById(R.id.workmanager).setOnClickListener(this);
        //Fragment

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fragment:
                startFragmentSample();
                break;
            case R.id.workmanager:
                startWorkManager();
                break;
        }

    }

    private void startWorkManager() {
        Intent intent = new Intent(this, WorkManagerActivity.class);
        startActivity(intent);
    }

    private void startFragmentSample() {
        Intent intent = new Intent(this, FragmentActivityClass.class);
        startActivity(intent);
    }


}
