package fr.dynivers.trouvelemot;

//----------Import----------//
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//Je sais pas ce que c'est mais c'est la parti principal dans l'activité//
public class SimpleModeActivity extends AppCompatActivity {

    private TextView TextCardLetter;
    private TextView TextCardCategorie;
    private SimpleModeActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_mode2);

        Button quitButton = findViewById(R.id.QuitButton); //Importation local du bouton quiter
        Button nextButton = findViewById(R.id.NextButton); //Importation local du bouton suivant
        ImageView imageCardLetter = findViewById(R.id.ImageCardLetter);
        ImageView imageCardCategorie = findViewById(R.id.ImageCardCategorie);
        this.TextCardLetter = findViewById(R.id.TextCardLettre);
        this.TextCardCategorie = findViewById(R.id.TextCardCategorie);
        this.activity = this;


        imageCardCategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Detecter un click sur la carte catégorie
                TextCardCategorie.setText(RandomWorld.Categorie()); //Changer la Categorie aleatoirement sur la carte grace à la fonction categorie de la class RandomWorld
            }
        });

        imageCardLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Detecter un click sur la carte lettre
                TextCardLetter.setText(RandomWorld.Lettre()); //Changer la Lettre aleatoirement sur la carte grace à la fonction lettre de la class RandomWorld
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Detecter un click sur le bouton suivant
                TextCardCategorie.setText(RandomWorld.Categorie()); //Changer la Categorie aleatoirement sur la carte grace à la fonction categorie de la class RandomWorld
                TextCardLetter.setText(RandomWorld.Lettre()); //Changer la Lettre aleatoirement sur la carte grace à la fonction lettre de la class RandomWorld
            }
        });

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Detecter un click sur le bouton Quiter
                final PopupCustom popupCustom = new PopupCustom(activity);
                popupCustom.setTitle("Quitter");
                popupCustom.setSubTitle("êtes vous sur de vouloir quitter");
                popupCustom.getYesButton().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupCustom.dismiss();
                    }
                });
                popupCustom.getNoButton().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                popupCustom.build();
            }
        });
    }
}
