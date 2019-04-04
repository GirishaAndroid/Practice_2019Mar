package andorid.sample.practice_2019mar.ArchComponent.JetPack.View;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import andorid.sample.practice_2019mar.R;
import andorid.sample.practice_2019mar.databinding.MovielistUiBinding;

public class MovieListFragment extends Fragment {

    MovielistUiBinding movielistUiBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        movielistUiBinding = DataBindingUtil.inflate(inflater, R.layout.movielist_ui, container, false);

        return movielistUiBinding.getRoot();
    }
}
