package com.example.iseddept;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import taimoor.sultani.sweetalert2.Sweetalert;

public class MainActivity extends AppCompatActivity {

    MaterialCardView card;
    MaterialCardView examcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        examcard = findViewById(R.id.examcard);
        examcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ExamActivity = new Intent(MainActivity.this, Exam.class);
                ExamActivity.putExtra("name", "Ali Abdulla");
                ExamActivity.putExtra("age", 12);
                startActivity(ExamActivity);
            }
        });


        card = findViewById(R.id.cardclick);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "CARD VIEW", Toast.LENGTH_SHORT).show();
            }
        });
    }
}