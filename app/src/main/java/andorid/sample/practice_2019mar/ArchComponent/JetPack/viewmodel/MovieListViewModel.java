package andorid.sample.practice_2019mar.ArchComponent.JetPack.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import andorid.sample.practice_2019mar.ArchComponent.JetPack.Model.MovieModel;
import andorid.sample.practice_2019mar.ArchComponent.JetPack.repository.MovieLisRepository;

public class MovieListViewModel extends ViewModel {

    MutableLiveData<MovieModel> data = new MutableLiveData<>();
    MovieLisRepository movieLisRepository;

    public MovieListViewModel() {
        movieLisRepository = new MovieLisRepository();
    }

    public void init() {
        if (data != null)
            return;
        data = movieLisRepository.getData();
    }

    public MutableLiveData<MovieModel> getData() {
        return data;
    }

}
