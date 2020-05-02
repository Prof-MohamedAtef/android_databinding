package mo.ed.aad.mydatabindingimpelementation.androidWave.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.annotations.SerializedName;

import mo.ed.aad.mydatabindingimpelementation.R;

public class Contact {

    @SerializedName("id")
    private String ID;


    @SerializedName("email")
    private String Email;

    @SerializedName("userName")
    private String UserName;

    @SerializedName("age")
    private String Age;

    @SerializedName("phoneNum")
    private String PhoneNum;

    @SerializedName("avatar")
    private String Avatar;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }


    @BindingAdapter({ "avatar" })
    public static void loadImage(ImageView imageView, String imageURL) {
        Glide.with(imageView.getContext())
                .setDefaultRequestOptions(new RequestOptions()
                        .circleCrop())
                .load(imageURL)
                .placeholder(R.drawable.ic_cloud_loading)
                .into(imageView);
    }
}