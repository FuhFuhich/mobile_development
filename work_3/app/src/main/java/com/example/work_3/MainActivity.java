package com.example.work_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText main_editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button liner_button = findViewById(R.id.liner_button);
        Button frame_button = findViewById(R.id.frame_button);
        Button relative_button = findViewById(R.id.relative_button);

        main_editText = findViewById(R.id.main_editText);

        liner_button.setOnClickListener(this::onClick);
        frame_button.setOnClickListener(this::onClick);
        relative_button.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        String text = main_editText.getText().toString();

        Intent intent;

        if (v.getId() == R.id.relative_button) {
            intent = new Intent(this, RelativeLayoutActivity.class);
        }
        else if (v.getId() == R.id.frame_button) {
            intent = new Intent(this, FrameLayoutActivity.class);
        }
        else if (v.getId() == R.id.liner_button){
            intent = new Intent(this, LinerLayoutActivity.class);
        }
        else {
            return;
        }

        intent.putExtra("key", text);
        startActivity(intent);
    }
}