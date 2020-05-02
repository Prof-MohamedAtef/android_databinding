package mo.ed.aad.mydatabindingimpelementation.androidWave.arch;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.androidWave.Reader;
import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;
import mo.ed.aad.mydatabindingimpelementation.androidWave.model.ContactResponse;

public class ContactRepository {
    private static final String TAG= "ContactRepository";

    private List<Contact> contacts =new ArrayList<>();
    private ContactResponse contactResponse;
    private MutableLiveData<List<Contact>> mutableLiveData=new MutableLiveData<>();

    private Context mContext;
    public ContactRepository(Context context){
        this.mContext=context;
    }

    public MutableLiveData<List<Contact>> getMutableLiveData(){
        contactResponse= Reader.ReadJson(mContext);
        contacts= contactResponse.getContacts();
        mutableLiveData.setValue(contacts);
        return mutableLiveData;
    }
}
