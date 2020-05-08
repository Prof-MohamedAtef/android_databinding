package mo.ed.aad.mydatabindingimpelementation.models;

import androidx.databinding.BaseObservable;

public class CartItem {
    private Contact contact;
    private int quantity;

    public CartItem() {
    }

    public CartItem(Contact contact, int quantity) {
        this.contact = contact;
        this.quantity = quantity;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
