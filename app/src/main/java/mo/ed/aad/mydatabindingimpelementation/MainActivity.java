package mo.ed.aad.mydatabindingimpelementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import mo.ed.aad.mydatabindingimpelementation.databinding.ActivityMainBinding;

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



    }
}