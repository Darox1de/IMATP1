package ca.ulaval.ima.tp1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InternalBrowser extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intrabrowser);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        webView = (WebView) findViewById(R.id.intraBrowser);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://m.youtube.ca");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
    public void quit(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
