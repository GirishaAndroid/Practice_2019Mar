package andorid.sample.practice_2019mar.ArchComponent.JetPack.Network;

import andorid.sample.practice_2019mar.ArchComponent.JetPack.Model.MovieModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APInterface {

    @GET("/api/unknown")
    Call<MovieModel> getMovies();
}
