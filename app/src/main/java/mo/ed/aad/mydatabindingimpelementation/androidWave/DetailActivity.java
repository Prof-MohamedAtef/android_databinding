package mo.ed.aad.mydatabindingimpelementation.androidWave;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import mo.ed.aad.mydatabindingimpelementation.R;
import mo.ed.aad.mydatabindingimpelementation.databinding.ActivityDetailBinding;
import mo.ed.aad.mydatabindingimpelementation.fragments.DetailFragment;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding= DataBindingUtil.setContentView(this,R.layout.activity_detail);

        inflateDetailFragment();
    }

    private void inflateDetailFragment() {
        DetailFragment detailFragment=new DetailFragment();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.Contact_Detail_container,detailFragment);
        transaction.commit();
    }
}