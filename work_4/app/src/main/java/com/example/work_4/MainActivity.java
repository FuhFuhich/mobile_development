package com.example.work_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button first_activity_button = findViewById(R.id.first_activity_button);
        first_activity_button.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("first_activity", new FirstLastNameSender(
                ((EditText)findViewById(R.id.person_first_name)).getText().toString(),
                ((EditText)findViewById(R.id.person_last_name)).getText().toString()));

        startActivity(intent);
    }
}