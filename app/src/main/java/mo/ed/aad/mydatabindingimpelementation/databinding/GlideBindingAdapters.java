package mo.ed.aad.mydatabindingimpelementation.databinding;

import android.content.Context;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;

import mo.ed.aad.mydatabindingimpelementation.R;

public class GlideBindingAdapters {
    private static final String TAG="GlideBindingAdapters";

    @BindingAdapter("imageUrl")
    public static void setImage(ImageView view, String imageUrl){
        Context context=view.getContext();

        RequestOptions options=new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(view);
    }

    @BindingAdapter("imageUrl")
    public static void setImage(ImageView view, int imageUrl){
        Context context=view.getContext();

        RequestOptions options=new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(view);
    }



    @BindingAdapter({"requestListener","imageResource"})
    public static void bindRequestListener(ImageView view, RequestListener requestListener, String imageResource){
        Context context=view.getContext();

        RequestOptions options=new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageResource)
                .listener(requestListener)
                .into(view);
    }

}
