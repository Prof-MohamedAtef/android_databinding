package mo.ed.aad.mydatabindingimpelementation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import mo.ed.aad.mydatabindingimpelementation.databinding.ActivityMainBinding;
import mo.ed.aad.mydatabindingimpelementation.fragments.FragmentA;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=activityMainBinding.getRoot();
        setContentView(view);

        activityMainBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                activityMainBinding.tv1.setText("");
                activityMainBinding.tv1.setText("Counter Value = ");
                activityMainBinding.tv1.append(String.valueOf(counter));
            }
        });

        inflateFragment();
    }

    private void inflateFragment() {
        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentA_Container,fragmentA,"FragmentA");
        transaction.commit();
    }
}