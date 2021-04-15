package fr.dynivers.trouvelemot;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;

public class PopupParam extends Dialog {

    //Fields
    private Button saveButton;

    //Constructor
    PopupParam(Activity activity)
    {
        super(activity, R.style.Theme_AppCompat_Dialog);
        setContentView(R.layout.popup_param);
        this.saveButton = findViewById(R.id.yesButton);
    }


    @SuppressLint("ResourceAsColor")
    public void build(){
        show();
    }
}
