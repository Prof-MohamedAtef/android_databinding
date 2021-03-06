package mo.ed.aad.mydatabindingimpelementation.androidWave;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.ChooseQuantityDialog;
import mo.ed.aad.mydatabindingimpelementation.IDetailFragment;
import mo.ed.aad.mydatabindingimpelementation.IRecyclerActivity;
import mo.ed.aad.mydatabindingimpelementation.QuantityListener;
import mo.ed.aad.mydatabindingimpelementation.R;
import mo.ed.aad.mydatabindingimpelementation.Util.Contacts;
import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;
import mo.ed.aad.mydatabindingimpelementation.databinding.ActivityDetailBinding;
import mo.ed.aad.mydatabindingimpelementation.fragments.DetailFragment;

public class DetailActivity extends AppCompatActivity implements QuantityListener {

    ActivityDetailBinding mBinding;
    private Contact mContact;
    private static final String TAG="DetailActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding= DataBindingUtil.setContentView(this,R.layout.activity_detail);

        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        if (bundle!=null){
            if (bundle.getParcelable(String.valueOf(R.string.detail_intent))!=null){
               mContact= bundle.getParcelable(String.valueOf(R.string.detail_intent));
               inflateDetailFragment();
            }
        }
    }

    private void inflateDetailFragment() {
        DetailFragment detailFragment=new DetailFragment();
        Bundle bundle=new Bundle();
        bundle.putParcelable(String.valueOf(R.string.detail_intent), mContact);
        detailFragment.setArguments(bundle);
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.Contact_Detail_container, detailFragment,"DetailFragment");
        transaction.addToBackStack("DetailFragment");
        transaction.commit();
    }

    @Override
    public void OnQuantityValueChanged(int quantity) {
//        String text=mBinding.toolbarTextView.getText().toString();
//        if (text!=null&&text.length()>0){
//            int q= Integer.valueOf( mBinding.toolbarTextView.getText().toString());
//            quantity+=q;
//            mBinding.toolbarTextView.setText(quantity);
//        }else {
//            int q= Integer.valueOf( mBinding.toolbarTextView.getText().toString());
//            mBinding.toolbarTextView.setText(quantity);
//        }
    }
}