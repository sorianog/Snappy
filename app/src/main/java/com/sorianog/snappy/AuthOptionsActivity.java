package com.sorianog.snappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AuthOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authoptions);

        Button loginBtn = findViewById(R.id.login);
        Button registerBtn = findViewById(R.id.regsiter);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(getApplication(), LoginActivity.class);
                startActivity(loginIntent);
                return;
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrationIntent = new Intent(getApplication(), RegistrationActivity.class);
                startActivity(registrationIntent);
                return;
            }
        });
    }
}
