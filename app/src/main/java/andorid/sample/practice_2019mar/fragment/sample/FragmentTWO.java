package andorid.sample.practice_2019mar.fragment.sample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import andorid.sample.practice_2019mar.R;

public class FragmentTWO extends Fragment {

    String TAG = "Fragment Eample";

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "FragmentTWO onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "FragmentTWO onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FragmentTWO onCreateView");
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FragmentTWO onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FragmentTWO onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "FragmentTWO onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "FragmentTWO onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "FragmentTWO onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "FragmentTWO onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG, "FragmentTWO onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "FragmentTWO onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "FragmentTWO onDetach");
        super.onDetach();
    }
}
