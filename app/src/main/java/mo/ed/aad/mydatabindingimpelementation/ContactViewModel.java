package mo.ed.aad.mydatabindingimpelementation;

import androidx.annotation.Nullable;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;

public class ContactViewModel extends BaseObservable {
    private Contact contact;
    @Bindable
    public boolean isImageVisibility() {
        return imageVisibility;
    }


    public void setImageVisibility(boolean imageVisibility) {
        this.imageVisibility = imageVisibility;
        notifyPropertyChanged(BR.imageVisibility);
    }

    private boolean imageVisibility=false;

    @Bindable
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
        notifyPropertyChanged(BR.contact);
    }

    public RequestListener getCustomRequestListener(){
        return new RequestListener() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target target, boolean isFirstResource) {
                return false;
            }

            @Override
            public boolean onResourceReady(Object resource, Object model, Target target, DataSource dataSource, boolean isFirstResource) {
                setImageVisibility(true);
                return false;
            }
        };
    }
}