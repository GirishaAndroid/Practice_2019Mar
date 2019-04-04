package andorid.sample.practice_2019mar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import andorid.sample.practice_2019mar.ArchComponent.JetPack.View.MovieListActivity;
import andorid.sample.practice_2019mar.databindingsample.ProductUI;
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
        findViewById(R.id.dadtabinding).setOnClickListener(this);
        findViewById(R.id.arch_component).setOnClickListener(this);
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
            case R.id.dadtabinding:
                startDataBinding();
                break;
            case R.id.arch_component:
                startArchComp();
                break;
        }

    }

    private void startArchComp() {
        Intent intent = new Intent(this, MovieListActivity.class);
        startActivity(intent);
    }

    private void startDataBinding() {
        Intent intent = new Intent(this, ProductUI.class);
        startActivity(intent);

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
