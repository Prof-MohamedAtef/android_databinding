package mo.ed.aad.mydatabindingimpelementation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.databinding.RecyclerFragmentLayoutBinding;
import mo.ed.aad.mydatabindingimpelementation.models.Contact;

import static mo.ed.aad.mydatabindingimpelementation.Util.Contacts.getContacts;

public class RecyclerFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private static final String TAG = "RecyclerFragment";

    RecyclerFragmentLayoutBinding recyclerFragmentLayoutBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        recyclerFragmentLayoutBinding=RecyclerFragmentLayoutBinding.inflate(inflater);
        recyclerFragmentLayoutBinding.swipeRefreshLayout.setOnRefreshListener(this);

        setupContactsList();
        return recyclerFragmentLayoutBinding.getRoot();
    }

    private void setupContactsList(){
        recyclerFragmentLayoutBinding.getContacts();
    }

    @Override
    public void onRefresh() {
        onItemsLoadComplete();
    }

    private void onItemsLoadComplete() {
        (recyclerFragmentLayoutBinding.recyclervView.getAdapter()).notifyDataSetChanged();
        recyclerFragmentLayoutBinding.swipeRefreshLayout.setRefreshing(false);
    }
}