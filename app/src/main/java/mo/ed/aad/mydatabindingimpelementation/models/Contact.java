package mo.ed.aad.mydatabindingimpelementation.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {
    String UserName, Age, PhoneNumber, Email;

    public Contact(String userName, String age, String phoneNumber, String email) {
        UserName = userName;
        Age = age;
        PhoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(UserName);
        dest.writeString(Age);
        dest.writeString(PhoneNumber);
        dest.writeString(Email);
    }

    protected Contact(Parcel in){
        UserName=in.readString();
        Age=in.readString();
        PhoneNumber=in.readString();
        Email=in.readString();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };
}