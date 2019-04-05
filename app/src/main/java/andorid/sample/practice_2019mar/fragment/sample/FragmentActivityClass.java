package andorid.sample.practice_2019mar.fragment.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import andorid.sample.practice_2019mar.R;

public class FragmentActivityClass extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4, b5, b6;

    FragmentManager fragmentManager;

    String TAG = "Fragment Eample";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Activity onCreate");

        setContentView(R.layout.activity_main);

        findViewById(R.id.fragment).setOnClickListener(this);
        findViewById(R.id.workmanager).setOnClickListener(this);
        findViewById(R.id.dadtabinding).setOnClickListener(this);
        findViewById(R.id.arch_component).setOnClickListener(this);
        findViewById(R.id.design_pattern).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "Activity onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "Activity onStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "Activity onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "Activity onResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "Activity onDestroy");
        super.onDestroy();
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.fragment:
                addFragmentOne();
                break;

            case R.id.workmanager:
                addFragmentTwo();
                break;

            case R.id.dadtabinding:
                removeFragOne();
                break;

            case R.id.arch_component:
                addFragmentAgainAgainwithoutBackStack();
                break;

            case R.id.design_pattern:
                replaceFragOne();
                break;

            case R.id.button6:
                replaceFragTwo();
                break;

            case R.id.button7:
                backStack();
                break;

            case R.id.button8:
                popTrasactionBackStack();
                break;
        }

    }

    private void popTrasactionBackStack() {
        Log.d(TAG,"POP");
        fragmentManager.popBackStack();
    }

    private void backStack() {

    }

    private void addFragmentOne() {
        FragmentONE fragmentONE = new FragmentONE();
        //fragmentManager.beginTransaction().add(R.id.fragContainer, fragmentONE).commit();
        fragmentManager.beginTransaction().addToBackStack("Fragment-1").add(R.id.fragContainer, fragmentONE).commit();
    }

    private void addFragmentTwo() {
        FragmentTWO fragmentTWO = new FragmentTWO();
        fragmentManager.beginTransaction().add(R.id.fragContainer, fragmentTWO).commit();
        //fragmentManager.beginTransaction().addToBackStack("Fragment-2").add(R.id.fragContainer, fragmentTWO).commit();
    }

    private void removeFragOne() {
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragContainer);
        fragmentManager.beginTransaction().remove(fragment).commit();
        //fragmentManager.beginTransaction().addToBackStack("Remove").remove(fragment).commit();

    }

    private void replaceFragOne() {
        FragmentTWO fragmentTWO = new FragmentTWO();
        fragmentManager.beginTransaction().replace(R.id.fragContainer, fragmentTWO).commit();
    }

    private void replaceFragTwo() {
    }

    // If you added fragments again and again without back stack how can we go back to previously added fragment ?
    //Ans: override onBackPressed and use remove operation
    @Override
    public void onBackPressed() {
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragContainer);
        if (fragment != null) {
            fragmentManager.beginTransaction().remove(fragment).commit();
        } else
            super.onBackPressed();
    }

    public void addFragmentAgainAgainwithoutBackStack() {
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragContainer);
        if (fragment instanceof FragmentONE) {
            FragmentTWO fragmentTWO = new FragmentTWO();
            fragmentManager.beginTransaction().add(R.id.fragContainer, fragmentTWO).commit();
        }
        if (fragment instanceof FragmentTWO) {
            FragmentONE fragmentONE = new FragmentONE();
            //fragmentManager.beginTransaction().add(R.id.fragContainer, fragmentONE).commit();
            fragmentManager.beginTransaction().add(R.id.fragContainer, fragmentONE).commit();
        } else {
            FragmentONE fragmentONE = new FragmentONE();
            //fragmentManager.beginTransaction().add(R.id.fragContainer, fragmentONE).commit();
            fragmentManager.beginTransaction().add(R.id.fragContainer, fragmentONE).commit();
        }
    }

}
