package andorid.sample.practice_2019mar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import andorid.sample.practice_2019mar.ArchComponent.JetPack.View.MovieListActivity;
import andorid.sample.practice_2019mar.ParcelableDemo.PutParcelViewClass;
import andorid.sample.practice_2019mar.databindingsample.ProductUI;
import andorid.sample.practice_2019mar.designPatterns.ViewClass;
import andorid.sample.practice_2019mar.fragment.sample.FragmentActivityClass;
import andorid.sample.practice_2019mar.threadCommunication.sample.join.ThreadsChannel;
import andorid.sample.practice_2019mar.threadCommunication.sample.waitNotify.WaitDemo;
import andorid.sample.practice_2019mar.threadCommunication.sample.waitNotify.WaitDemo2;
import andorid.sample.practice_2019mar.threadCommunication.sample.waitNotify.WaitDemo3;
import andorid.sample.practice_2019mar.threadCommunication.sample.yield.YeildDemo;
import andorid.sample.practice_2019mar.threadSafe.SynchClassLevel;
import andorid.sample.practice_2019mar.threadSafe.SynchDemo3;
import andorid.sample.practice_2019mar.threadSafe.VolatileDemo;
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
        findViewById(R.id.design_pattern).setOnClickListener(this);
        //Fragment

        threadCommunicatio();
    }

    private void threadCommunicatio() {
        ThreadsChannel threadsChannel = new ThreadsChannel();
        threadsChannel.startThread1();
        threadsChannel.startThread2();

        YeildDemo yeildDemo = new YeildDemo();
        yeildDemo.startThread();

        WaitDemo waitDemo = new WaitDemo();
        waitDemo.startDemo();

        WaitDemo2 taskQue = new WaitDemo2();
        taskQue.TaskQue();

        WaitDemo3 waitDemo3 = new WaitDemo3();
        waitDemo3.startThread();

        VolatileDemo volatileDemo = new VolatileDemo();
        volatileDemo.startThread();

        SynchDemo3 synchDemo3 = new SynchDemo3();
        synchDemo3.startThred();

        SynchClassLevel synchClassLevel = new SynchClassLevel();
        synchClassLevel.startThred();

        Intent intent = new Intent(this, PutParcelViewClass.class);
        startActivity(intent);
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
            case R.id.design_pattern:
                startDesignPattern();
                break;
        }

    }

    private void startDesignPattern() {
        Intent intent = new Intent(this, ViewClass.class);
        startActivity(intent);
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
