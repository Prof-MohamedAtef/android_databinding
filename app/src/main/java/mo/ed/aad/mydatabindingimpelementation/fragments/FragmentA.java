package mo.ed.aad.mydatabindingimpelementation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mo.ed.aad.mydatabindingimpelementation.databinding.FragmentALayoutBinding;

public class FragmentA extends Fragment {

    FragmentALayoutBinding fragmentALayoutBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentALayoutBinding=FragmentALayoutBinding.inflate(inflater);
        return fragmentALayoutBinding.getRoot();
    }
}
