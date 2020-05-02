package mo.ed.aad.mydatabindingimpelementation.androidWave;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.IRecyclerActivity;
import mo.ed.aad.mydatabindingimpelementation.R;
import mo.ed.aad.mydatabindingimpelementation.androidWave.adapter.ContactAdapter;
import mo.ed.aad.mydatabindingimpelementation.androidWave.arch.ContactViewModel;
import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;
import mo.ed.aad.mydatabindingimpelementation.databinding.ActivityAndroidWaveBinding;
import mo.ed.aad.mydatabindingimpelementation.fragments.DetailFragment;

public class AndroidWaveActivity extends AppCompatActivity implements IRecyclerActivity {

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
        contactAdapter=new ContactAdapter(this);
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

    @Override
    public void inflateContactFragment(Contact contact) {
        DetailFragment detailFragment=new DetailFragment();
//        Bundle bundle=new Bundle();
//        bundle.putParcelable(String.valueOf(R.string.detail_intent), contact);
//        detailFragment.setArguments(bundle);

        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.Contact_Detail_container, detailFragment,"DetailFragment");
//        transaction.addToBackStack("DetailFragment");
        transaction.commit();
    }
}