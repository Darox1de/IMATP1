package ca.ulaval.ima.tp1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class ProfilDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_description);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        Profil profil = intent.getParcelableExtra("user");

        TextView textViewFirstNameHardcoded = findViewById(R.id.firstName);
        textViewFirstNameHardcoded.setText("Prénom:");

        TextView textViewName = findViewById(R.id.lastNameInput);
        textViewName.setText(profil.getName());

        TextView textViewFirstName = findViewById(R.id.firstNameInput);
        textViewFirstName.setText(profil.getFirstName());

        TextView textViewDate = findViewById(R.id.dateInput);
        SimpleDateFormat df = new SimpleDateFormat("dd MMMMM yyyy", Locale.US);
        String dateString = df.format(profil.getBirthDate());
        textViewDate.setText(dateString);

        TextView textViewIDUL = findViewById(R.id.inputIDUL);
        textViewIDUL.setText(profil.getIDUL());
    }

}
