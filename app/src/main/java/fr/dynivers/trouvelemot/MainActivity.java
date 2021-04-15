package fr.dynivers.trouvelemot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MainActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.activity = this;

        // ---Import Element view--- //
        Button play =  findViewById(R.id.play);
        ImageView regles = findViewById(R.id.regles);
        ImageView param = findViewById(R.id.param);
        ImageView credits = findViewById(R.id.credits);

        play.setOnClickListener(new View.OnClickListener() {   //Play button
            @Override
            public void onClick(View v) {  //If click detect then open default game activity (SimpleModeActivity)
                Intent otherActivity = new Intent(getApplicationContext(), SimpleModeActivity.class); //define the activity to open
                startActivity(otherActivity); //open activity
                finish(); //end the instruction
            }
        });

        regles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Rules button
                final PopupRegle popupRegle = new PopupRegle(activity);  //define that the activity to open is a popup with the rules popup presets in a parameter
                popupRegle.build(); //charge popup
            }
        });

        param.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Parameter button
                Toast.makeText(getApplicationContext(), "Aucun paramètre pour le moment", Toast.LENGTH_SHORT).show(); // Display in the low of screen than is not parameter available
                /*final PopupParam popupParam = new PopupParam(activity);
                popupParam.build();*/
            }
        });

        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Credits popup
                final PopupCredits popupCredits = new PopupCredits(activity); //define that the activity to open is a popup with the credits popup presets in a parameter
                popupCredits.build(); //charge popup
            }
        });
    }
}
