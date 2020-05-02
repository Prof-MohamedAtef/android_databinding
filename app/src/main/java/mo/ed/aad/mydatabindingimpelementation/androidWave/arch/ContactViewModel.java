package mo.ed.aad.mydatabindingimpelementation.androidWave.arch;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;

public class ContactViewModel extends AndroidViewModel {

    private ContactRepository contactRepository;


    public ContactViewModel(@NonNull Application application) {
        super(application);
        contactRepository=new ContactRepository(application.getApplicationContext());
    }

    public LiveData<List<Contact>> getAllContacts(){
        return contactRepository.getMutableLiveData();
    }
}
