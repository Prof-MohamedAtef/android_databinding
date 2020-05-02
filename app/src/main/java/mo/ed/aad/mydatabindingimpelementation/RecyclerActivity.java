package mo.ed.aad.mydatabindingimpelementation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import mo.ed.aad.mydatabindingimpelementation.databinding.ActivityRecyclerBinding;
import mo.ed.aad.mydatabindingimpelementation.fragments.RecyclerFragment;

public class RecyclerActivity extends AppCompatActivity {

    ActivityRecyclerBinding activityRecyclerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityRecyclerBinding=ActivityRecyclerBinding.inflate(getLayoutInflater());
        View view=activityRecyclerBinding.getRoot();
        setContentView(view);


        inflateRecyclerFragment();
    }

    private void inflateRecyclerFragment() {
        RecyclerFragment recyclerFragment=new RecyclerFragment();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.recyclerView_Container,recyclerFragment,"RecyclerFragment");
        transaction.commit();
    }
}