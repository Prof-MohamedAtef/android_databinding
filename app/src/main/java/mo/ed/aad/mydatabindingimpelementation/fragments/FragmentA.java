package mo.ed.aad.mydatabindingimpelementation.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mo.ed.aad.mydatabindingimpelementation.RecyclerActivity;
import mo.ed.aad.mydatabindingimpelementation.androidWave.AndroidWaveActivity;
import mo.ed.aad.mydatabindingimpelementation.databinding.FragmentALayoutBinding;

public class FragmentA extends Fragment {

    FragmentALayoutBinding fragmentALayoutBinding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentALayoutBinding=FragmentALayoutBinding.inflate(inflater);
        fragmentALayoutBinding.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AndroidWaveActivity.class));
            }
        });
        return fragmentALayoutBinding.getRoot();
    }
}
