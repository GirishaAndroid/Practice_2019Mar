package andorid.sample.practice_2019mar.ArchComponent.JetPack.View;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import andorid.sample.practice_2019mar.R;
import andorid.sample.practice_2019mar.databinding.MovielistActivityBinding;
//https://www.youtube.com/watch?v=GNN8BWZvXW8&t=241s

public class MovieListActivity extends AppCompatActivity {

    MovielistActivityBinding movielistActivityBinding;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        movielistActivityBinding = DataBindingUtil.setContentView(this, R.layout.movielist_activity);
        fragmentManager = getSupportFragmentManager();
        addFragment();
    }

    private void addFragment() {
        MovieListFragment movieListFragment = new MovieListFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.movie_container, movieListFragment).commit();
    }
}
