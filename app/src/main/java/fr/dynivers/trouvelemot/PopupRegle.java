package fr.dynivers.trouvelemot;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;

public class PopupRegle extends Dialog {

    //Fields


    //Constructor
    PopupRegle(Activity activity)
    {
        super(activity, R.style.Theme_AppCompat_Dialog);
        setContentView(R.layout.popup_regle);
    }

    @SuppressLint("ResourceAsColor")
    public void build(){
        show();
    }
}
