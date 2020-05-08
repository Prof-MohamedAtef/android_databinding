package mo.ed.aad.mydatabindingimpelementation;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.Util.BigDecimalUtil;
import mo.ed.aad.mydatabindingimpelementation.Util.Contacts;
import mo.ed.aad.mydatabindingimpelementation.models.CartItem;

public class CartViewModel  extends BaseObservable {
    private List<CartItem> cart=new ArrayList<>();
    private boolean isCartVisible;

    @Bindable
    public List<CartItem> getCart() {
        return cart;
    }

    @Bindable
    public boolean isCartVisible() {
        return isCartVisible;
    }

    public void setCart(List<CartItem> cart) {
        this.cart = cart;
        notifyPropertyChanged(BR.cart);
    }

    public void setCartVisible(boolean cartVisible) {
        isCartVisible = cartVisible;
        notifyPropertyChanged(BR.cartVisible);
    }


    public String getProductQuantitiesString(){
        int totalItems=0;

        for (CartItem cartItem:cart){
            totalItems+=cartItem.getQuantity();
        }

        String s="";

        if (totalItems>1){
            s="items";
        }else {
            s="item";
        }
        return ("("+String.valueOf(totalItems)+" "+s+")");
    }

    public String getTotalCostString(){
        double totalCost=0;

        for (int i=0; i<cart.size(); i++){
            int productQuantity=cart.get(i).getQuantity();

            double cost= productQuantity* Double.valueOf(5);
            totalCost += cost;
        }

        return "$"+ BigDecimalUtil.getValue(new BigDecimal(totalCost));
    }
}
