package com.example.iseddept;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    MaterialButton login;
    TextInputEditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPreferences mypref = getSharedPreferences("mypref",MODE_PRIVATE);

        if(mypref.getBoolean("islogin",false)){
            Intent MainActivity = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(MainActivity);
        }


        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("ali") &&
                password.getText().toString().equals("123")){

                    SharedPreferences.Editor edit = mypref.edit();
                    edit.putBoolean("islogin",true);
                    edit.apply();


                    Intent MainActivity = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(MainActivity);

                }else{
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}