package mo.ed.aad.mydatabindingimpelementation.androidWave.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.R;
import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;
import mo.ed.aad.mydatabindingimpelementation.databinding.RowItemBinding;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {


    List<Contact> mContactList;

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowItemBinding rowItemBinding=
                DataBindingUtil.inflate(
                        LayoutInflater.from(parent.getContext()),
                        R.layout.row_item,
                        parent,
                        false
                );
        return new ContactViewHolder(rowItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contact=mContactList.get(position);
        holder.rowItemBinding.setContact(contact);
    }

    @Override
    public int getItemCount() {
        return mContactList.size();
    }

    public void setContactList(List<Contact> contacts){
        this.mContactList=contacts;
        notifyDataSetChanged();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {

        private RowItemBinding rowItemBinding;

        public ContactViewHolder(@NonNull RowItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding=rowItemBinding;
        }
    }
}