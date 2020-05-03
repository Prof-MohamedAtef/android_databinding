package mo.ed.aad.mydatabindingimpelementation;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;

public class ContactViewModel extends BaseObservable {
    private Contact contact;

    @Bindable
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
        notifyPropertyChanged(BR.contact);
    }
}
