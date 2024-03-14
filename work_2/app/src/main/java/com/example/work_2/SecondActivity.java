package com.example.work_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate: SecondActivity");

        Intent intent = getIntent();
        String fio = intent.getStringExtra("fio");
        String group = intent.getStringExtra("group");
        int age = intent.getIntExtra("age", 0);
        String grade = intent.getStringExtra("grade");

        EditText editTextFullName = findViewById(R.id.editTextFullName);
        editTextFullName.setText(fio);

        EditText editTextGroupNumber = findViewById(R.id.editTextGroupNumber);
        editTextGroupNumber.setText(group);

        EditText editTextAge = findViewById(R.id.editTextAge);
        editTextAge.setText(String.valueOf(age));

        EditText editTextGrade = findViewById(R.id.editTextGrade);
        editTextGrade.setText(grade);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: SecondActivity");
    }
}
