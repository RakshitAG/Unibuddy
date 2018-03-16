package com.example.anubh.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class UserAreaActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etEmail=(EditText)findViewById(R.id.etEmail);
        final TextView welcomeMessage= (TextView)findViewById(R.id.welcomeMessage);

        Intent intent = getIntent();
        String name=intent.getStringExtra("name");
        String username=intent.getStringExtra("username");
        String password=intent.getStringExtra("password");
        String email = intent.getStringExtra("email");

        String message =  "Welcome to Unibuudy " + name;
        welcomeMessage.setText(message);


        Button button = (Button)findViewById(R.id.button);
        Button bton=(Button)findViewById(R.id.bton);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mreaintent = new Intent(UserAreaActivity.this, MainActivity.class);
                UserAreaActivity.this.startActivity(mreaintent);
            }


    });
        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this, LoginActivity.class);
                UserAreaActivity.this.startActivity(intent);
            }


        });


    }
}
