package mo.ed.aad.mydatabindingimpelementation.androidWave;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import mo.ed.aad.mydatabindingimpelementation.androidWave.model.ContactResponse;
import mo.ed.aad.mydatabindingimpelementation.androidWave.util.Utils;
import mo.ed.aad.mydatabindingimpelementation.androidWave.model.Contact;

public class Reader {

    public static ContactResponse ReadJson(Context context){
        String jsonFileString = Utils.getJsonFromAssets(context, "json-data");
        Log.i("data", jsonFileString);

        Gson gson = new Gson();
        Type listUserType = new TypeToken<ContactResponse>() { }.getType();

        ContactResponse users = gson.fromJson(jsonFileString, listUserType);
        return users;
    }
}
