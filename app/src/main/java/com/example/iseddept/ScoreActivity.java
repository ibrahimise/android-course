package com.example.iseddept;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScoreActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        listView = findViewById(R.id.ListView);

        String[] names = {
          "C#","java","Database","Epu"
        };
        int[] images = {
                R.drawable.csharp,
                R.drawable.score,
                R.drawable.database,
                R.drawable.epuicon
        };
        CustomAdapter adapter = new CustomAdapter(names,images,this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(ScoreActivity.this, names[i], Toast.LENGTH_SHORT).show();
            }
        });


    }
}