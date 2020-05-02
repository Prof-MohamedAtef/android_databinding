package mo.ed.aad.mydatabindingimpelementation.androidWave;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.R;
import mo.ed.aad.mydatabindingimpelementation.androidWave.adapter.ContactAdapter;
import mo.ed.aad.mydatabindingimpelementation.androidWave.arch.ContactViewModel;
import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;
import mo.ed.aad.mydatabindingimpelementation.databinding.ActivityAndroidWaveBinding;

public class AndroidWaveActivity extends AppCompatActivity {

    private ContactViewModel contactViewModel;
    private ContactAdapter contactAdapter;
    ActivityAndroidWaveBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=
                DataBindingUtil.setContentView(this,R.layout.activity_android_wave);

        // bind recycler view
        RecyclerView recyclerView=mBinding.recyclervViewContacts;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        contactViewModel= ViewModelProviders.of(this).get(ContactViewModel.class);
        contactAdapter=new ContactAdapter();
        recyclerView.setAdapter(contactAdapter);
        populateContactsList();
    }

    private void populateContactsList() {
        contactViewModel.getAllContacts().observe(this, new Observer<List<Contact>>() {
            @Override
            public void onChanged(List<Contact> data) {
                contactAdapter.setContactList(data);
            }
        });
    }
}
