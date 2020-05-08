package mo.ed.aad.mydatabindingimpelementation.sharedPrefs;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManagement {
    public Context context_;
    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;
    int PRIVATE_MODE = 0;
    public static final String PREFS_Logger = "LoggerFile";
    private static final String QUANTITY_VALUE="QUANTITY_VALUE";

    public SessionManagement(Context context){
        this.context_ =context;
        pref = context_.getSharedPreferences(PREFS_Logger, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setQuantityValue(int quantityValue){
        editor.putInt(QUANTITY_VALUE, quantityValue);
        editor.commit();
    }
}
