package com.example.cjproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_beforewrite);

        EditText mSignName = findViewById(R.id.signName);
        EditText midfirst = findViewById(R.id.idfirst);
        EditText mpasswordfirst = findViewById(R.id.passwordfirst);
        EditText mpasswordcheckfirst = findViewById(R.id.passwordcheckfirst);
        EditText mnumber = findViewById(R.id.numberfirst);
        EditText mconfirmbuttonfirst = findViewById(R.id.confirm_buttonfirst);

        Button mnextfirst = findViewById(R.id.nextfirst);

       mnextfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mSignName.getText().toString();
                String id = midfirst.getText().toString();
                String password = mpasswordfirst.getText().toString();
                String passwordcheck = mpasswordcheckfirst.getText().toString();
                String number = mnumber.getText().toString();
                String confirmbutton = mconfirmbuttonfirst.getText().toString();

//                Intent intent = new Intent(MainActivity.this, SubActivity.class);
//                intent.putExtra("NAME", name);
//                intent.putExtra("ID", id);
//                intent.putExtra("PASSWORD", password);
//                intent.putExtra("PASSWORDCHECK", passwordcheck);
//                intent.putExtra("NUMBER", number);
//                intent.putExtra("CONFIRMBUTTON", confirmbutton);

                

            }
        });
    }
}