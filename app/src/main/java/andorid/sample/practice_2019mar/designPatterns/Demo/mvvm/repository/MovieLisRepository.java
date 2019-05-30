package andorid.sample.practice_2019mar.designPatterns.Demo.mvvm.repository;

import android.arch.lifecycle.MutableLiveData;

import andorid.sample.practice_2019mar.designPatterns.Demo.mvvm.model.MovieModel;
import andorid.sample.practice_2019mar.designPatterns.Demo.mvvm.network.APIClient;
import andorid.sample.practice_2019mar.designPatterns.Demo.mvvm.network.APInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieLisRepository {

    public MutableLiveData<MovieModel> movieModelMutableLiveData = new MutableLiveData<>();
    APInterface apInterface;

    public MutableLiveData<MovieModel> getData() {

        apInterface = APIClient.getClient().create(APInterface.class);
        Call<MovieModel> call = apInterface.getMovies();
        call.enqueue(new Callback<MovieModel>() {
            @Override
            public void onResponse(Call<MovieModel> call, Response<MovieModel> response) {
                if (response != null)
                    movieModelMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<MovieModel> call, Throwable t) {

            }
        });

        return movieModelMutableLiveData;
    }
}
