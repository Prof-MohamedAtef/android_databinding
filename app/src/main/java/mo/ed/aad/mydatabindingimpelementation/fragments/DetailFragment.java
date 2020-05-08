package mo.ed.aad.mydatabindingimpelementation.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.ChooseQuantityDialog;
import mo.ed.aad.mydatabindingimpelementation.ContactViewModel;
import mo.ed.aad.mydatabindingimpelementation.IDetailFragment;
import mo.ed.aad.mydatabindingimpelementation.R;
import mo.ed.aad.mydatabindingimpelementation.Util.Contacts;
import mo.ed.aad.mydatabindingimpelementation.databinding.DetailFragmentLayoutBinding;
import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;
import mo.ed.aad.mydatabindingimpelementation.sharedPrefs.SessionManagement;

public class DetailFragment extends Fragment implements IDetailFragment {

    public DetailFragmentLayoutBinding mBinding;
    private Contact mContact;
    private static final String TAG="DetailFragment";
    private IDetailFragment iDetailFragment;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iDetailFragment= new IDetailFragment() {
            @Override
            public void showQuantityDialogue() {
                Log.d(TAG,"showQuantityDialogue: showing Quantity Dialogue.");
                ChooseQuantityDialog dialog=new ChooseQuantityDialog();
                dialog.show(getActivity().getSupportFragmentManager(),"ChooseQuantityDialogue");
            }

            @Override
            public void setQuantity (int quantity) {
                Log.d(TAG, "selectQuantity: selected quantity: "+quantity);
                DetailFragment fragment=(DetailFragment)getActivity().getSupportFragmentManager().findFragmentByTag("DetailFragment");
                if (fragment!=null){
                    List<Contact> contacts = Contacts.getContacts();
                    fragment.mBinding.getContactView().setContact(contacts.get(1));
                    fragment.mBinding.getContactView().setContact(mContact);
                }

                mBinding.setNumSelectedValue(quantity);


            }

            @Override
            public void showQuantityDialog() {

            }

            @Override
            public void addToCart(Contact product) {

            }

            @Override
            public void inflateViewCartFragment() {

            }

            @Override
            public void setCartVisibility(boolean visibility) {

            }
        };

        Bundle bundle=getArguments();
        if (bundle!=null){
            mContact=bundle.getParcelable(String.valueOf(R.string.detail_intent));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding= DetailFragmentLayoutBinding.inflate(inflater);
        mBinding.setHandler(iDetailFragment);
        ContactViewModel contactViewModel=new ContactViewModel();
        contactViewModel.setContact(mContact);
        mBinding.setContactView(contactViewModel);
        return mBinding.getRoot();
    }

    @Override
    public void showQuantityDialogue() {

    }

    @Override
    public void setQuantity(int quantity) {
        mBinding.setNumSelectedValue(quantity);
    }

    @Override
    public void showQuantityDialog() {

    }

    @Override
    public void addToCart(Contact product) {

    }

    @Override
    public void inflateViewCartFragment() {

    }

    @Override
    public void setCartVisibility(boolean visibility) {

    }
}