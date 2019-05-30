package andorid.sample.practice_2019mar.designPatterns.Demo.mvvm.network;

import andorid.sample.practice_2019mar.designPatterns.Demo.mvvm.model.MovieModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APInterface {

    @GET("/api/unknown")
    Call<MovieModel> getMovies();
}
