package andorid.sample.practice_2019mar.ArchComponent.JetPack.View;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class MovieListAdapter extends RecyclerView.Adapter <MovieListAdapter.MovieListHolder> {

    @NonNull
    @Override
    public MovieListHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieListHolder movieListHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MovieListHolder extends RecyclerView.ViewHolder {
        public MovieListHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
