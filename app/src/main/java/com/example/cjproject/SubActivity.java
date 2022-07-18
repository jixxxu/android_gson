package com.example.cjproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.security.cert.PKIXRevocationChecker;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String id = intent.getStringExtra("ID");
        String password = intent.getStringExtra("PASSWORD");
        String passwordcheck = intent.getStringExtra("PASSWORDCHECK");
        String number = intent.getStringExtra("NUMBER");
        String confirmbutton= intent.getStringExtra("CONFIRMBUTTON");

        TextView mResultTv = findViewById(R.id.resultTv);

        mResultTv.setText("Name: "+name+"/nID "+id+"Password: "+password+"PasswordCheck: "+passwordcheck+"Number: "+number+"Confirmbutton :"+confirmbutton);


    }
}