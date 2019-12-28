package com.sorianog.snappy;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SplashScreenActivity extends AppCompatActivity {
    public static Boolean started = false;
    private FirebaseAuth firebaseAuth;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();

        if (firebaseAuth != null) {
            Intent mainActivityIntent = new Intent(getApplication(), MainActivity.class);
            mainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(mainActivityIntent);
            finish();
            return;
        } else {
            Intent authOptionsIntent = new Intent(getApplication(), AuthOptionsActivity.class);
            authOptionsIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(authOptionsIntent);
            finish();
            return;
        }
    }
}
