package fr.dynivers.trouvelemot;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;

public class PopupCredits extends Dialog {

    //Fields


    //Constructor
    PopupCredits(Activity activity)
    {
        super(activity, R.style.Theme_AppCompat_Dialog); //Theme popup
        setContentView(R.layout.popup_creditst); //Layout credit popup
    }

    @SuppressLint("ResourceAsColor")
    public void build(){
        show();
    } //Charge function
}
