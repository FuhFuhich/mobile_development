package com.example.work_3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FrameLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.frame_layout);

        String text = getIntent().getExtras().getString("key");
        TextView textView = findViewById(R.id.frame_textView);
        textView.setText(text);
    }
}
