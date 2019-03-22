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

public class FragmentONE extends Fragment {

    String TAG = "Fragment Eample";

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "FragmentONE onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FragmentONE onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FragmentONE onCreateView");
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FragmentONE onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FragmentONE onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "FragmentONE onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "FragmentONE onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "FragmentONE onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "FragmentONE onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG, "FragmentONE onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "FragmentONE onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "FragmentONE onDetach");
        super.onDetach();
    }
}
