package mo.ed.aad.mydatabindingimpelementation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.BR;
import mo.ed.aad.mydatabindingimpelementation.R;
import mo.ed.aad.mydatabindingimpelementation.databinding.RowItemBinding;
import mo.ed.aad.mydatabindingimpelementation.models.Contact;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.BindingHolder> {

    private static final String TAG="ContactAdapter";

    private List<Contact> mContacts=new ArrayList<>();
    private Context mContext;

    public ContactAdapter(Context context, List<Contact> contacts){
        mContacts=contacts;
        mContext=context;
    }

    public void refreshList(List<Contact> contacts){
        mContacts.clear();
        mContacts.addAll(contacts);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BindingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowItemBinding rowItemBinding=DataBindingUtil.inflate(
          LayoutInflater.from(mContext), R.layout.row_item,parent,false
        );
        return new BindingHolder(rowItemBinding.getRoot());
    }



    @Override
    public void onBindViewHolder(@NonNull BindingHolder holder, int position) {
        Contact contact=mContacts.get(position);
//        holder.rowItemBinding.setContact(contact);
        holder.rowItemBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class BindingHolder extends RecyclerView.ViewHolder{
        RowItemBinding rowItemBinding;
        public BindingHolder(@NonNull View itemView) {
            super(itemView.getRootView());
            rowItemBinding = DataBindingUtil.bind(itemView.getRootView());
        }
    }
}
