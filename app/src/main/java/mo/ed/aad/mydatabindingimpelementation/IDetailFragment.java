package mo.ed.aad.mydatabindingimpelementation;

import android.util.Log;

import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;

public interface IDetailFragment {
    void showQuantityDialogue();

    void setQuantity(int quantity);

    void showQuantityDialog();

    void addToCart(Contact product);

    void inflateViewCartFragment();

    void setCartVisibility(boolean visibility);
}
