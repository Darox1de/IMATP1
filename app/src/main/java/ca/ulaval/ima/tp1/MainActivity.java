package ca.ulaval.ima.tp1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBrowser(View v) {
        Uri uri = Uri.parse("https://m.youtube.ca");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openLinkInApp(View v) {
        Intent intent = new Intent(this, InternalBrowser.class);
        startActivity(intent);
    }

    public void openRedPage(View v) {
        setContentView(R.layout.activity_ulaval);
    }

    public void openProfilDescription(View v) {


        Profil dude = new Profil("Ross", "Dany",633916800000L,"DAROS40");
        Intent intent = new Intent(this, ProfilDescription.class);
        intent.putExtra("user", dude);
        startActivity(intent);
    }
    public void quit(View v) {
        setContentView(R.layout.activity_main);
    }
}
