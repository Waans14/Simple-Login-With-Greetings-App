package com.afonetech.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        TextView tvHallo = findViewById(R.id.tvHallo);

        // Receiving the Data From the Main Activity
        Bundle extras = getIntent().getExtras();
        if(extras == null){
            return;
        }
        String msg = extras.getString("Name");
        tvHallo.setText("Assalamu'alaikum " +" '"+msg+"' "+ ", Bagaimana Hari Ini? ");
    }
}