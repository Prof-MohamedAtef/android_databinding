package mo.ed.aad.mydatabindingimpelementation.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import mo.ed.aad.mydatabindingimpelementation.ContactViewModel;
import mo.ed.aad.mydatabindingimpelementation.R;
import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;
import mo.ed.aad.mydatabindingimpelementation.databinding.DetailFragmentLayoutBinding;

public class DetailFragment extends Fragment {

    DetailFragmentLayoutBinding mBinding;
    private Contact mContact;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle=getArguments();
        if (bundle!=null){
            mContact=bundle.getParcelable(String.valueOf(R.string.detail_intent));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding= DetailFragmentLayoutBinding.inflate(inflater);

        ContactViewModel contactViewModel=new ContactViewModel();
        contactViewModel.setContact(mContact);
        mBinding.setContactView(contactViewModel);
        return mBinding.getRoot();
    }
}
