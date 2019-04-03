package andorid.sample.practice_2019mar.databindingsample.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import andorid.sample.practice_2019mar.R;

public class GlideBindingAdapter {

    @BindingAdapter("imageGlideInt")
    public static void setImageResource(ImageView imageResource, int imageUrl) {

        Context context = imageResource.getContext();

        RequestOptions requestOptions = new RequestOptions()
        .placeholder(R.drawable.ic_launcher_background)
        .error(R.drawable.ic_launcher_foreground);

        Glide.with(context)
                .setDefaultRequestOptions(requestOptions)
                .load(imageUrl)
                .into(imageResource);
    }

    @BindingAdapter("imageGlideString")
    public static void setImageResource(ImageView imageResource, String imageUrl) {

        Context context = imageResource.getContext();

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground);

        Glide.with(context)
                .setDefaultRequestOptions(requestOptions)
                .load(imageUrl)
                .into(imageResource);
    }
}
