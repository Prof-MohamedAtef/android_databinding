package mo.ed.aad.mydatabindingimpelementation;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import mo.ed.aad.mydatabindingimpelementation.databinding.DialogChooseQuantityBinding;

/**
 * Created by User on 2/8/2018.
 */

public class ChooseQuantityDialog extends DialogFragment {

    private static final String TAG = "ChooseQuantityDialog";

    // data binding
    DialogChooseQuantityBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DialogChooseQuantityBinding.inflate(inflater);
        mBinding.setIDetailFragment((IDetailFragment) getActivity().getSupportFragmentManager().getFragments().get(0));
        mBinding.listView.setOnItemClickListener(mOnItemClickListener);
        mBinding.closeDialog.setOnClickListener(mCloseDialogListener);

        return mBinding.getRoot();
    }

    public AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Log.d(TAG, "onItemSelected: selected: " + adapterView.getItemAtPosition(i));
            String selectedValue = (String) adapterView.getItemAtPosition(i);
                mBinding.getIDetailFragment().setQuantity(Integer.parseInt(selectedValue));
//            ((QuantityListener)getActivity()).OnQuantityValueChanged(Integer.parseInt(selectedValue));
//            ((IDetailFragment) getActivity().getSupportFragmentManager().getFragments().get(0)).setQuantity(Integer.parseInt(selectedValue));
            getDialog().dismiss();
        }
    };

    public View.OnClickListener mCloseDialogListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getDialog().dismiss();
        }
    };


}