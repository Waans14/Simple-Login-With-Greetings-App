package com.afonetech.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUser = findViewById(R.id.etUser);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnClick = findViewById(R.id.btnLogin);

        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etUser.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }else if(etPassword.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESS",Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(MainActivity.this,Hello.class);
                    in.putExtra("Name", etUser.getText().toString());
                    startActivity(in);
                }
            }
        });
    }
}