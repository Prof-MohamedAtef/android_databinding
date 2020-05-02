package mo.ed.aad.mydatabindingimpelementation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mo.ed.aad.mydatabindingimpelementation.databinding.FragmentALayoutBinding;
import mo.ed.aad.mydatabindingimpelementation.databinding.FragmentLayoutBBinding;
import mo.ed.aad.mydatabindingimpelementation.models.ModelCalc;

public class FragmentB extends Fragment {
    FragmentLayoutBBinding fragmentLayoutBBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentLayoutBBinding=FragmentLayoutBBinding.inflate(inflater);
        ModelCalc modelCalc=new ModelCalc(5,10,15);
        fragmentLayoutBBinding.setModelCalc(modelCalc);
        return fragmentLayoutBBinding.getRoot();
    }
}
