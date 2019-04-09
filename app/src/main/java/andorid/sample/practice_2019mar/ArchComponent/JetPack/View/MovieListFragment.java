package andorid.sample.practice_2019mar.ArchComponent.JetPack.View;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import andorid.sample.practice_2019mar.ArchComponent.JetPack.Model.MovieModel;
import andorid.sample.practice_2019mar.ArchComponent.JetPack.viewmodel.MovieListViewModel;
import andorid.sample.practice_2019mar.R;
import andorid.sample.practice_2019mar.databinding.MovielistUiBinding;

public class MovieListFragment extends Fragment {

    MovielistUiBinding movielistUiBinding;
    MovieListViewModel movieListViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        movielistUiBinding = DataBindingUtil.inflate(inflater, R.layout.movielist_ui, container, false);

        return movielistUiBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        movieListViewModel = ViewModelProviders.of(this).get(MovieListViewModel.class);
        movieListViewModel.init();
        movieListViewModel.getData().observe(this, new Observer<MovieModel>() {
            @Override
            public void onChanged(@Nullable MovieModel movieModel) {

                //Update Recycleview
                //movieModel.getName();
            }
        });

    }
}
