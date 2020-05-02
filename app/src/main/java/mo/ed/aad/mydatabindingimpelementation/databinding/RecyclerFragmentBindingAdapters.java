package mo.ed.aad.mydatabindingimpelementation.databinding;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.adapter.ContactAdapter;
import mo.ed.aad.mydatabindingimpelementation.models.Contact;

public class RecyclerFragmentBindingAdapters {


    private static final int NUM_COLUMNS = 2;

    @BindingAdapter("contactsList")
    public static void setContactsList(RecyclerView view, List<Contact> contacts){
        if (contacts==null){
            return;
        }else {
            RecyclerView.LayoutManager layoutManager=view.getLayoutManager();
            if (layoutManager==null){
                view.setLayoutManager(new GridLayoutManager(view.getContext(), NUM_COLUMNS));
            }
            ContactAdapter adapter=(ContactAdapter)view.getAdapter();
            if (adapter==null){
                adapter=new ContactAdapter(view.getContext(), contacts);
                view.setAdapter(adapter);
            }
        }
    }
}
