package pl.hypeapp.endoscope.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import pl.hypeapp.endoscope.R;
import pl.hypeapp.endoscope.WiFiDirectActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void intentStreamVideo(View view) {
        Intent i =  new Intent(MainMenuActivity.this, StartStreamActivity.class);
        startActivity(i);
    }
    public void intentViewStream(View view) {
        Intent i =  new Intent(MainMenuActivity.this, ConnectToStreamActivity.class);
        startActivity(i);
    }

    public void intentWifiDirect(View view) {
        Intent i =  new Intent(MainMenuActivity.this, WiFiDirectActivity.class);
        startActivity(i);
    }



}

