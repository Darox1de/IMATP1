package ca.ulaval.ima.tp1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Parcelable dude = new Parcelable("Ross", "Dany", LocalDate.of(1995, Month.AUGUST,3),"DAROS40");
    }

    public void openBrowser(View v) {
        Uri uri = Uri.parse("https://monportail.ulaval.ca");
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
    public void quit(View v) {
        setContentView(R.layout.activity_main);
    }
}
